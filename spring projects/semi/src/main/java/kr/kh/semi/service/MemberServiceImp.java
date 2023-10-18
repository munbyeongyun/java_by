package kr.kh.letsKo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.kh.letsKo.service.MemberService;
import kr.kh.letsKo.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;

	@GetMapping("/member/signupView")
	public String signupView(Model model) {
		model.addAttribute("title", "회원가입");
		return "/member/signup";
	}

	@PostMapping("/member/registSignup")
	public String registSignup(Model model, MemberVO member) {
		boolean res = memberService.registSignup(member);
		if(res) {
			model.addAttribute("msg", "회원가입이 완료되었습니다.");
			model.addAttribute("url", "member/loginView");
		}else {
			model.addAttribute("msg", "회원가입이 실패하였습니다. 다시 시도해 주세요.");
			model.addAttribute("url", "member/signup");
		}
		System.out.println(member);
		return "/main/message";
	}

	@ResponseBody
	@PostMapping("/member/checkId")
	public boolean idCheck(@RequestParam("me_id") String me_id){
		return memberService.checkId(me_id);
	}

	@GetMapping(value="/member/loginView")
	public String memberLoginView() {
		return "/member/login";
	}

	@PostMapping(value="/member/login")
	public String memberLogin(MemberVO member, Model model) {
		MemberVO user = memberService.login(member);
		if(null != user.getMe_id() && !("").equals(user.getMe_id())) {
			model.addAttribute("msg", "로그인에 성공했습니다.");
			model.addAttribute("url", "");
			model.addAttribute("user", user);
			user.setAutoLogin(member.isAutoLogin());
		}else {
			model.addAttribute("msg", "로그인에 실패했습니다.");
			model.addAttribute("url", "member/loginView");
		}
		return "/main/message";
	}

	@GetMapping(value="/member/logout")
	public String memberLogout(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		MemberVO user = (MemberVO)session.getAttribute("user");

		user.setMe_session_limit(null);
		memberService.updateMemberSession(user);
		model.addAttribute("msg", "로그아웃에 성공했습니다.");
		model.addAttribute("url", "");

		if(user != null) {
			session.removeAttribute("user");
			model.addAttribute("msg", "로그아웃에 성공했습니다.");
		}
		return "/main/message";
	}

}
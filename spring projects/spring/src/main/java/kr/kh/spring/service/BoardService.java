package kr.kh.spring.service;

import org.apache.ibatis.annotations.Param;

import kr.kh.spring.vo.BoardVO;
import kr.kh.spring.vo.MemberVO;

public interface BoardService {

	boolean insertBoard(BoardVO board, MemberVO user);

}

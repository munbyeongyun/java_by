import {BrowserRouter, Routes, Route, Link, useLocation, useNavigate} from 'react-router-dom'
import {useState} from 'react'

function App() {
  let [list, setList] = useState([{
    id : 1,
    title : 'Movie1',
    genre: 'Drame',
    releaseDate : '2022-01-01'
  },{
    id : 2,
    title : 'Movie2',
    genre: 'Action',
    releaseDate : '2022-01-02'
  }]);
  const deleteBoard = (id)=>{
    let tmpList = list.filter(item=>item.id != id);
    setList(tmpList);
  }
  const addBoard = (board)=>{
    setList([board, ...list]);
  }
  return (
    <BrowserRouter>
      <Header/>
      <Routes>
        <Route path="/" exact element={<Home list={list} deleteBoard={deleteBoard} add={addBoard} />} />
        <Route path='/insert' element={<Insert/>}/>
      </Routes>
    </BrowserRouter>
  );
}

function Header(){
	return(
		<header className='menu'>
			<ul className='menu-list'>
				<li className='menu-item'>
					<Link to="/" className='menu-link'>List</Link>
				</li>
				<li className='menu-item'>
					<Link to="/insert" className='menu-link'>Add New Message</Link>
				</li>
			</ul>
		</header>
	)
}

function Home({list, deleteBoard, add}){
	const location = useLocation();
	let board = location.state;
	if(board != null){
		add(board);
		location.state = null;
	}
	return (
		<main>
			<table>
				<thead>
					<tr>
						<th>ID</th>
						<th>writer</th>
						<th>message</th>
						<th>write_date</th>
            <th>Action</th>
					</tr>
				</thead>
				<tbody>
					{list.length == 0 ?
						<tr><th colSpan={4}><h1>등록된 메세지가 없습니다.</h1></th></tr> :
						list.map(item=>{
							return(
								<tr key={item.id}>
									<td>{item.id}</td>
									<td>{item.writer}</td>
									<td>{item.message}</td>
                  <td>{item.write_date}</td>
									<td><button onClick={()=>{deleteBoard(item.id)}}>Delet</button></td>
								</tr>
							)
						})
					}
				</tbody>
			</table>
		</main>
	)
}

function Insert() {
  const navigate = useNavigate();
  const [id, setId] = useState(1);
  const [writer, setWriter] = useState('');
  const [message, setMessage] = useState('');
  const [write_date, setWrite_date] = useState('');
  const [errorMessage, setErrorMessage] = useState('');
  const [idList, setIdList] = useState([]); // 중복 ID 확인용 목록

  const idChange = (e) => setId(e.target.value);
  const writerChange = (e) => setWriter(e.target.value);
  const messageChange = (e) => setMessage(e.target.value);
  const write_dateDateChange = (e) => setWrite_date(e.target.value);

  const insertBoard = () => {
    // 모든 필드가 채워져 있는지 확인
    if (id && writer && message && write_date) {
      // 중복 ID 확인
      if (idList.includes(id)) {
        setErrorMessage('중복되는 ID입니다.');
        return;
      }

      navigate('/', {
        state: {
          id: id,
          writer: writer,
          message: message,
          write_date: write_date,
        },
      });

      // 입력 필드 초기화
      setId(1);
      setWriter('');
      setMessage('');
      setWrite_date('');
      setErrorMessage('');

      // 중복 ID 목록 업데이트
      setIdList([...idList, id]);
    } else {
      setErrorMessage('모든 필드를 입력하세요.');
    }
  };

  return (
    <div>
      <input type="number" placeholder="ID" onChange={idChange} value={id} />
      <br />
      <input type="text" placeholder="writer" onChange={writerChange} value={writer} />
      <br />
      <input type="text" placeholder="message" onChange={messageChange} value={message} />
      <br />
      <input type="date" onChange={write_dateDateChange} value={write_date} />
      <br />
      {errorMessage && <p style={{ color: 'red' }}>{errorMessage}</p>}
      <button onClick={insertBoard}>등록</button>
    </div>
  );
}

export default App;

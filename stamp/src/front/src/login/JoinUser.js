import React, {useState} from "react";
import {useNavigate} from "react-router-dom";

const JoinUser = () =>{
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [phone, setPhone] = useState('');
  const [nickname, setNickname] = useState('');
  const [name, setName] = useState('');
  const [registration, setRegistration] = useState('');
  const [userType, setUserType] = useState('');
  const [agree, setAgree] = useState('');

  /*로그인 페이지 이동*/
  const moveNavigate = useNavigate();
  const goToLogin = () => {
    moveNavigate('/');
  };

  /*회원가입 요청 서버 전송 프로세스 */
  const processSignup = () => {
    fetch('/api/auth/signUp', {
      method: 'post',
      headers: {
        'Content-Type': 'application/json;charset=utf-8',
      },
      body: JSON.stringify({
        email: email,
        password: password,
        userName: name,
        userPhone: phone,
        nickName: nickname,
        userType: userType,
        agree: agree
      }),
    })
        .then(response => {
          if(response.ok)
          {
            return response.json();
          }
          throw new Error('서버 응답이 올바르지 않습니다. ');
        })
        .then(data => {
          if (data.message === 'SIGNUP SUCCESS') {
            moveNavigate('/')
          } else {
            alert('회원가입에 실패했습니다. 다시 시도해주세요.');
          }
        })
        .catch(error => {
          alert('회원가입 중 오류가 발생했습니다. 다시 시도해주세요');
        });
  };


  return (
      <div>
        <h1>회원가입</h1>
        <input
            type="email"
            placeholder="이메일을 입력해주세요"
            value={email}
            name="email"
        />


      </div>

  )
}

export default JoinUser
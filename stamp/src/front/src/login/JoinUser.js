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
        businessRegistration: registration,
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
        <div>
          <input
              type="email"
              placeholder="이메일을 입력해주세요"
              value={email}
              name="email"
          />
        </div>
        <div>
          <input
              type="text"
              placeholder="이름"
              value={name}
              name="userName"
          />
        </div>
        <div>
          <input
            type="password"
            placeholder="비밀번호"
            value={password}
            name="password"

          />
        </div>
        <div>
          <input
              type="password"
              placeholder="비밀번호 한번더 "
              value={password}
          />
        </div>
        <div>
          <input
            type="text"
            placeholder="핸드폰번호(-)없이 입력해주세요"
            value={phone}
            name="userPhone"
            />
        </div>
        <div>
          <input
            type="text"
            placeholder="닉네임"
            value={nickname}
            name="nickname"
          />
        </div>
        <div>
          <label htmlFor="common">일반회원</label>
          <input
            type="radio"
            id="common"
            value= "1"
            name="userType"
          />
          <label htmlFor="business">사업자</label>
          <input
            type="radio"
            id="business"
            value= "2"
            name="userType"
          />
        </div>
        <div>
          <input
            type="text"
            placeholder="사업자 번호"
            value={registration}
            name="businessRegistration"
          />
        </div>
        <div>
          <h3>약관 동의</h3>
          <label htmlFor="disagree">비동의</label>
          <input
            type="radio"
            id="disagree"
            value="1"
            name="agree"
          />
          <label htmlFor="agree">동의</label>
          <input
            type="radio"
            id="agree"
            value="2"
            name="agree"
          />
        </div>

      </div>

  );

}

export default JoinUser
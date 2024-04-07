import React from "react";
import Layout from "../common/Layout";
import JoinUser from "./JoinUser";
import {Link} from "react-router-dom";

const Login = () =>{
  return (
      <div>
        <Layout>
          <Link to="/signUp">회원 가입</Link>
        </Layout>
      </div>
  )
}

export default Login
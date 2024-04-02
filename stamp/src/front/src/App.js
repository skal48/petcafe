import './App.css';
import {useEffect, useState} from "react";
import React from 'react';
import Header from "./common/Header";
import Footer from "./common/Footer";
import {Outlet} from "react-router-dom";


function App() {
  /*const [data, setData] = useState([])
  useEffect(() => {
    fetch("/showMe")
        .then((res) => {
          return res.json();
        })
        .then(function (result) {
            setData(result);
      })
  },[]);*/
  return (
    <div className={App}>
        {/*  <ul>
              {data.map((v,idx)=><li key={`${idx}-${v}`}>{v}</li>)}
          </ul>*/}

      <Header />
      <Outlet />
      <Footer />

    </div>

  );
}

export default App;

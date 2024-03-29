import './App.css';
import {useEffect, useState} from "react";
import React from 'react';
import Layout from "./common/Layout";


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
    <div className="App">
        {/*  <ul>
              {data.map((v,idx)=><li key={`${idx}-${v}`}>{v}</li>)}
          </ul>*/}

        <Layout >
        </Layout>





    </div>
  );
}

export default App;

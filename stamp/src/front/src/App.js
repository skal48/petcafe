import './App.css';
import {useEffect, useState} from "react";
import {Route, Routes, Link} from "react-router-dom";
import React from 'react';
import TestComponent from "./TestComponent";


function App() {
  const [data, setData] = useState([])
  useEffect(() => {
    fetch("/showMe")
        .then((res) => {
          return res.json();
        })
        .then(function (result) {
            setData(result);
      })
  },[]);
  return (
    <div className="App">
          <ul>
              {data.map((v,idx)=><li key={`${idx}-${v}`}>{v}</li>)}
          </ul>
        <nav>
          <Link to="/test">Test</Link>
        </nav>
        <Routes>
          <Route path="/test" element={<TestComponent />} />
        </Routes>



    </div>
  );
}

export default App;

import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { createBrowserRouter, RouterProvider} from "react-router-dom";
import Login from "./login/Login";
import Coupon from "./coupon/Coupon";
import Home from "./home/Home";

const router = createBrowserRouter([
  {
    path: "/",
    element: <App />,
 /*   errorElement: <NotFound />,*/
    children: [
      { index: true, path: "/", element: <Home /> }, //index로 '/' 메인페이지 지정
      { path: "/login", element: <Login /> },
      {
        path: "/coupon",
        element: <Coupon />
      },
    ],
  },
]);
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();

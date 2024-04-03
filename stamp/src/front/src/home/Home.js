import React from "react";
import Kakaomap from "./Kakaomap";
import Layout from "../common/Layout";
import SearchBar from "./SearchBar";
import CafeList from "./CafeList";


const Home = () => {
  return (
      <Layout>

        <div>
          <Kakaomap/>
        </div>
        <div>
          <SearchBar/>
          <CafeList />
        </div>
      </Layout>
  );
}

export default Home
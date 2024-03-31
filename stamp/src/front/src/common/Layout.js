import React from "react";
import Header from "./Header";
import Footer from "./Footer";

const Layout = (props) => {
    return (
        <div>
            <Header />
              <main style={{height:1000}}>
                {props.children}
              </main>

            <Footer />

        </div>
    )
}

export default Layout
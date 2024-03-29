import React from "react";
import header from "./Header";
import footer from "./Footer";
import Header from "./Header";
import Footer from "./Footer";

const Layout = (props) => {
    return (
        <div>
            <Header />
              <main>
                {props.children}
              </main>

            <Footer />

        </div>
    )
}

export default Layout
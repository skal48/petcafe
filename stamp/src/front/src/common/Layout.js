import React from "react";
import Header from "./Header";
import Footer from "./Footer";
import styles from "./Layout.module.scss"

const Layout = (props) => {
  return (
      <div className={styles.layout}>
        <Header />
        <main>
          {props.children}
        </main>
        <Footer />
      </div>
  )
}

export default Layout

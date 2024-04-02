import React from "react";
import styles from './Footer.module.scss'

const Footer = () => {
    return (
        <footer className={styles.footer}>
            <div>
              <a href="/" className={styles.footerLogo}>쿠 펫</a>
            </div>
            <div className={styles.made}>
              Created by sumin
            </div>
        </footer>
    )
}

export default Footer

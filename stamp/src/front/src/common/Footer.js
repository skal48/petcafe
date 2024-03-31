import React from "react";
import styles from './Footer.module.scss'

const Footer = () => {
    return (
        <footer className={styles.footer}>
            <div className={styles.footerLogo}>
              쿠펫
            </div>
            <div className={styles.made}>
              made by sumin
            </div>
        </footer>
    )
}

export default Footer

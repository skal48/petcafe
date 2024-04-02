import React from "react";
import styles from './Header.module.scss'
import {Link} from "react-router-dom";


const Header = () => {
    return (
        <header className={styles.header}>
          <div className={styles.contents}>
            <Link to ="/" className={styles.logo}>
              쿠 펫
            </Link>
            <nav className={styles.navigation}>
              <ul>
                <li><Link to="/login">로그인</Link></li>
                <li><Link to="/coupon">쿠폰</Link></li>
              </ul>
            </nav>
          </div>

        </header>
    )
}

export default Header
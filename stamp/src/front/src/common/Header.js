import React from "react";
import styles from './Header.module.scss'

const Header = () => {
    return (
        <header className={styles.header}>
          <div className={styles.contents}>
            <div> 
              로고 넣기
            </div>
            <nav className={styles.navigation}>
              <ul>
                <li>로그인</li>
                <li>쿠폰</li>
              </ul>
            </nav>
          </div>
        </header>
    )
}

export default Header
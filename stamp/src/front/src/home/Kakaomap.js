import React, {useEffect} from "react";
import styles from './Kakaomap.module.scss';
import { Map } from 'react-kakao-maps-sdk';


const Kakaomap = () =>{

  return (
      <div className={styles.kmaps}>
        <Map
            center={{ lat: 33.5563, lng: 126.79581 }}   // 지도의 중심 좌표
            style={{ width: '800px', height: '600px' }} // 지도 크기
            level={3}                                   // 지도 확대 레벨
        >
        </Map>
        
        
        요를ㄹ레이
      </div>);
}


export default Kakaomap
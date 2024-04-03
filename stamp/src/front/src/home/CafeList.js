import React, {useEffect, useState} from "react";
import axios from "axios";

const CafeList = () => {
  const [cafeList, setList] = useState([{
    CafeNo:'',
    cafeName: '',
    address: ''
  }]);
  useEffect(() => {
    axios.get("/cafe/list")
        .then(res => setList(res.data))
        .catch(error => console.log(error))
  }, []);
  return (
      <div>
        <div className='cafeList'>
          {cafeList.map((cafe, CafeNo) => {
            return (
                <tr key={cafe.CafeNo}>
                  <td>{cafe.cafeName}</td>
                  <td>{cafe.address}</td>
                </tr>


            )
          })}
        </div>
      </div>
  )
}

/*무한 스크롤 구현*/
/* 검색 결과가 없으면 나오는 페이지 */



export default CafeList
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function TestComponent() {

    const baseUrl = "http://localhost:8080";

    const [ data, setData ] = useState();

    useEffect(() => {
        putSpringData();
    },[])

    async function putSpringData() {
        await axios
            .get(baseUrl + "/test")
            .then((res)=>{
                console.log(res.data);
                setData(res.data);
            })
            .catch((err)=>{
                console.log(err);
            })
    }

    return (
            <div>
                {data ? data.map((datas)=>(
                    <div key={datas.userNo}>
                        <div>번호: {datas.userNo}</div>
                        <div>타입: {datas.userName}</div>
                        <div>핸드폰: {datas.userPhone}</div>

                    </div>
                )) : ''}
            </div>

    );

}

export default TestComponent;
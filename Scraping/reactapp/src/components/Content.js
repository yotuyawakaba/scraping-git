import React, { useState, useEffect } from "react";
import BodyCard from './BodyCard';
import Grid from '@mui/material/Grid';

export const ApiFetch2 = () => {
	const [stones, setStone] = useState([]);

	useEffect(() => {
		// APIを呼び出す
		fetch("http://localhost:8080/api/test", { method: "GET" })
			// レスポンスのデータ形式をjsonに設定
			.then((res) => res.json())
			// APIから渡されるレスポンスデータ(data)をstateにセットする
			.then((data) => {
				setStone(data);
			});
	}, []);

	// const propTitle = stones.map( item =>  { return item.title });

    const getCardContent = getObj => {
        return (
            <Grid item xs={12} sm={4} key={getObj.id}>
                <BodyCard {...getObj} />
            </Grid>
        );
    };

    return (
        <Grid container spacing={2}>
            {stones.map(contentObj => getCardContent(contentObj))}
        </Grid>
    )
};
export default ApiFetch2
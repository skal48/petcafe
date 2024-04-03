import React from "react";

const SearchBar = () => {

  return(
      <div className='searchBar'>
        <input type='text' name='search' placeholder=' 검색어를 입력해 주세요' />
        <button type='submit'>검색</button>
      </div>
  )
}

export default SearchBar
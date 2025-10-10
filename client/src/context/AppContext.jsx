import { createContext, useEffect, useState } from "react";
import { fetchCategories } from "../Service/CategoryService.js";


export const AppContext = createContext(null);

export const AppContextProvider = (props) => {

    const [categories, setcategories] = useState([]);

    useEffect(() => {
        async function loadData() {
            const response = await fetchCategories();
            setcategories(response.data);
        }
        
        loadData();
    }, []) ;  

    const contextValue = {
        categories,
        setcategories
    }

    return <AppContext.Provider value={contextValue}> 
        {props.children}
    </AppContext.Provider>
}

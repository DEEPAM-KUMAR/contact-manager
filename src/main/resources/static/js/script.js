window.addEventListener('load', (event) => {
    console.log('The page has fully loaded');

    // after the window along with html and css is loaded then trigger the js

    const themeButton = document.getElementById("dark-mode");
    const baseHtml = document.getElementById("base");
    const buttonText = themeButton.getElementsByTagName("span")[0];

        let selectedMode = localStorage.getItem("theme");

        const enableDark=()=>{
           baseHtml.classList.remove("light");
           baseHtml.classList.add("dark");
           localStorage.setItem("theme","enabled");
           buttonText.textContent = "Light";
        }

        const disableDark=()=>{
           baseHtml.classList.add("light");
           baseHtml.classList.remove("dark");
           localStorage.setItem("theme","disabled");
           buttonText.textContent = "Dark";
        }

        if(selectedMode === 'disabled'){
          disableDark();
        }

        themeButton.addEventListener("click",(e)=>{

        selectedMode = localStorage.getItem("theme");
        if(selectedMode==='disabled'){
           enableDark();
        }else{
           disableDark();
        }

        })



});



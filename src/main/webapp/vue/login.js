var vm = new Vue({
    el:"#app",
    data:{

    },
    methods:{
        login:function(){

            var name=document.getElementById("name").value;
            var password=document.getElementById("password").value;
            // alert(name+":"+password);
            this.$http.post('http://localhost:8080/scs/LoginController',
                {name:name,password:password},{emulateJSON:true})
                .then(
                function(response){
                    var result = response.bodyText.toString();
                    alert(result);
                    window.location.href = 'http://localhost:8080/scs/HomePage.jsp';
                },
                function(){
                    alert("发送请求失败");
                });


        }
    }

})
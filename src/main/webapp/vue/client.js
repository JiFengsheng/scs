var vm=new Vue({
    el:"#client",
    data:{
        isWrite:true,
        grades:[
            "2016","2017"
        ],
        academys:[],
        majors:[],
        cs:[]
    },
    methods:{
        getGrades:function(){


            this.$http.get('http://localhost:8080/scs/getGrades')
                .then(
                    function(response){
                        var result = response.bodyText.toString();
                        this.grades=eval(result);
                        // alert(result);
                    },
                    function(){
                        alert("发送请求失败");
                    });


        },

        getGradeValue:function(){
            var grade = document.getElementById("grade").value;
            // alert(grade);


        },
        getAcademyValue:function(){
            var academy = document.getElementById("academy").value;
            // alert(academy);
            this.$http.post('http://localhost:8080/scs/getMajors',
                {academy:academy},{emulateJSON:true})
                .then(
                    function(response){
                        var result = response.bodyText.toString();
                        this.majors = eval(result);
                        console.log(result);

                    },
                    function(){
                        alert("发送请求失败");
                    });


        },
        getMajorValue:function(){
            var grade = document.getElementById("grade").value;
            var academy = document.getElementById("academy").value;
            var major = document.getElementById("major").value;
            // alert(grade+":"+academy+":"+major);
            this.$http.post('http://localhost:8080/scs/getClass',
                {grade:grade,academy:academy,major:major},{emulateJSON:true})
                .then(
                    function(response){
                        var result = response.bodyText.toString();
                        this.cs = eval(result);
                        console.log(result);

                    },
                    function(){
                        alert("发送请求失败");
                    });

        },
        getClassValue:function(){
            var c = document.getElementById("c").value;
            // alert(c);
        }



    },
    created:function(){
        this.$http.get('http://localhost:8080/scs/getGrades')
            .then(
                function(response){
                    var result = response.bodyText.toString();
                    this.grades=eval(result);
                    console.log(result);
                    // alert(result);
                },
                function(){
                    alert("发送请求失败");
                }
                );

        this.$http.get('http://localhost:8080/scs/getAcademys')
            .then(
                function(response){
                    var result = response.bodyText.toString();
                    this.academys=eval(result);
                    console.log(result);
                    // alert(result);
                },
                function(){
                    alert("发送请求失败");
                }
            );


    },
    beforeMount:function(){
        console.log("beforeMount")
    }



})
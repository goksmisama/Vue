var vue = new Vue({
    el: "#app",
    data: {
        user: {id: "", username: "", password: "", age: "", sex: "", email: ""},
        userList: []
    },
    methods: {
        findAll: function () {
            var _this = this;
            axios.get("/vueDemo/user/findAll.do")
                .then(function (response) {
                    _this.userList = response.data;
                })
                .catch(function (err) {
                    console.log(err);
                });
        },
        findById: function (userId) {
            var _this = this;
            axios.get("/vueDemo/user/findById.do", {params: {id: userId}})
                .then(function (response) {
                    _this.user = response.data;
                    $("#myModal").modal("show");
                })
                .catch(function (err) {
                    console.log(err);
                });
        },
        update: function () {
            var _this = this;
            axios.post("/vueDemo/user/updateUser.do", _this.user)
                .then(function (response) {
                    _this.findAll();
                })
                .catch(function (err) {
                    console.log(1111111);
                    console.log(err);
                    console.log(111111);
                });
        }
    },
    created: function () {
        this.findAll();
    }
});

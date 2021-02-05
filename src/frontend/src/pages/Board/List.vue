<template>
    <div>
        <h2>스프링 부트로 시작하는 웹서비스 Ver.2</h2>
        <div class="col-md-12">
            <div class="row">
                <div class="col-md-6">
                    <b-button variant="success" @click="write">글 등록</b-button>
                </div>
            </div>
            <br>
            <!--목록 출력 영역-->
            <table class="table table-horizontal table-bordered">
                <thead class="thead-strong">
                <tr>
                    <th>게시글번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>최종수정일</th>
                </tr>
                </thead>
                <tbody id="tbody">
                <tr v-for="item in list" v-bind:key="item.id">
                    <td>{{item.id}}</td>
                    <td>{{item.title}}</td>
                    <td>{{item.author}}</td>
                    <td>{{item.modifiedDate}}</td>
                </tr>
                </tbody>
            </table>
        </div>    
    </div>
</template>

<script>
export default {
    data: function() {
        return { 
            list: []
        }
    },
    methods: {
        write() {
            this.$router.push('/board/write');
        }
    },
    mounted() {
        let $vm = this;

        this.$http.get('/api/board')
        .then((res) => {
            console.log(res);
            $vm.list = res.data;    
        })
        .catch((err) => {
            console.log(err);
        })
    }
}
</script>

<style scoped>

</style>
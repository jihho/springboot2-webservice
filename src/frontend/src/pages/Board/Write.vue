<template>
    <div>
        <h2> 게시글 등록</h2>

        <div class="col-md-12">
            <div class="col-md-4">
                <form>
                    <div class="form-group">
                        <label for="title">제목</label>
                        <input type="text" class="form-control"
                            v-model="title" placeholder="제목을 입력하세요">
                    </div>
                    <div class="form-group">
                        <label for="author">작성자</label>
                        <input type="text" class="form-control"
                            v-model="author" placeholder="작성자를 입력하세요">
                    </div>
                    <div class="form-group">
                        <label for="content">내용</label>
                        <textarea class="form-control" v-model="content"
                            placeholder="내용을 입력하세요"></textarea>
                    </div>
                </form>
                <b-button>취소</b-button>  &nbsp;
                <b-button variant="success" class="btn btn-primary" id="btn-save" @click="save">등록</b-button>                        
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            title: '',
            author: '',
            content: ''
        }
    },   
    methods: {
        save() { // 등록 프로세스
            this.data = {
                title: this.title,
                author: this.author,
                content: this.content
            }

            this.$http.post('/api/board/posts', this.data)
            .then((res) => {
                if(res.status == 200) {
                    alert('글이 등록되었습니다.');
                    this.$router.push('/board/list');
                }
            })
            .catch((err) => {
                alert(JSON.stringify(err));
            })
        }
    }
}
</script>

<style scoped>

</style>
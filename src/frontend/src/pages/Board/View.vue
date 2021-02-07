<template>
    <div>
        <h2>게시글 수정</h2>
        <div class="col-md-12">
            <div class="col-md-4">
                <form>
                    <div class="form-group">
                        <label for="id">글번호</label>
                        <input type="text" class="form-control"
                            id="id" value="" readonly>
                    </div>
                    <div class="form-group">
                        <label for="title">제목</label>
                        <input type="text" class="form-control"
                            id="title" value="">
                    </div>
                    <div class="form-group">
                        <label for="content">내용</label>
                        <textarea class="form-control" id="content"></textarea>
                    </div>
                </form>
                <b-button variant="warning">취소</b-button>
                &nbsp;&nbsp;
                <b-button id="btn-update" variant="success">수정 완료</b-button>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    
}
</script>

<style scoped>

</style>
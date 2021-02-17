<template>
    <div class="auth-page">
        <div class="container">
            <h5 class="auth-logo">
                <span>
                    <b-icon icon="brightness-alt-high-fill" variant="warning"></b-icon>
                </span>
                Jiho App
                <span>
                    <b-icon icon="brightness-alt-high-fill" variant="info"></b-icon>
                </span>
            </h5>
            <section class="widget-auth mx-auto widget">
                <header class="title">
                    <h3 class="mt-0">Login to your Web App</h3>
                </header>

                <div class="widgetBody widget-body">
                    <p class="widget-auth-info">
                        Use your email to sign in.
                    </p>
                
                    <div role="alert" aria-live="polite" aria-atomic="true"
                        class="alert alert-sm text-center mt-2 alert-secondary">
                        This is real app with Spring boot backend - use
                        <br>
                        <span class="font-weight-bold">"admin@toy.com/password"</span>
                        <br>
                        to login!
                    </div>
                    
                    <form class="mt">
                        <div class="form-group">
                            <input required="required" type="email" name="email" 
                                placeholder="Email" class="form-control no-border">
                        </div>
                        <div class="form-group">
                            <input required="required" type="password" name="password"
                                placeholder="Password" class="form-control no-border">
                        </div>
                        <button type="submit" class="btn auth-btn mb-3 btn-info btn-sm">Login</button>
                        <b-button variant="primary" class="social-button mb-2" @click="googleLogin()">
                            <img src="../../assets/google_icon.png" id="google-img">
                            <p class="social-text">GOOGLE</p>
                        </b-button>
                    </form>
                </div>
            </section>
        </div>
    </div>
</template>

<script>
export default {
    methods: {
        googleLogin() {
            
        }
    }
}
</script>

<style scoped>
.auth-page {
    padding-top: 10vh;
    height:100vh;
    font-family: Montserrat, sans-serif;
}
.container, .container-fluid, .container-lg, .container-md,
.container-sm, .container-xl {
    width: 100%;
    padding-right: 20px;
    padding-left: 20px;
    margin-right: auto;
    margin-left: auto;
}
.auth-logo {
    margin-top: 15px;
    margin-bottom: 40px;
    text-align: center;
    font-weight: 400;
}
.h5, h5 {
    font-size: 1.25rem;
}
.h3, h3 {
    font-size: 1.55rem;
}
.widget-auth {
    max-width: 360px;
    padding: 30px !important;
}
.ml-auto, .mx-auto {
    margin-left: auto !important;
}
.mr0auto, .mx-auto {
    margin-right: auto !important;
}
.widget {
    display: block;
    position: relative;
    margin-bottom: 40px;
    padding: 15px 20px;
    background: #fff;
    border-radius: .45rem;
}
.widget>header {
    margin: -15px -20px;
    padding: 15px 20px;
}
.title {
    margin-top: 0;
    color: #444;
}
header {
    display: block;
}
.widget>header h3 {
    margin: 0;
    font-weight: 400;
    text-align: center;
}
.mt-0 {
    margin-top: 0 !important;
}
.h1, .h2, .h3, .h4, .h5, .h6, h1, h2, h3, h4, h5, h6 {
    margin-bottom: .5rem;
    font-weight:500;
    line-height: 1.2;
}
h3 {
    display: block;
    margin-block-start: 1em;
    margin-block-end: 1em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
}
.widget-auth, .widget-auth-info {
    font-size: 13px;
    color: #888;
    margin-bottom: 0;
    text-align: center;
} 
.alert {
    border: none;
    font-size: .725rem;
    position: relative;
    margin-bottom: 1rem;
    border-radius: .5rem;
}
.alert-sm {
    padding: 10px 15px;
}
.text-center {
    text-align: center !important;
}
.alert-secondary {
    color: #3f474c;
    background-color: #e4e7e9;
}
.form-group {
    margin-bottom: 1rem;
}
.form-control.no-border {
    border: none;
    background-color: #f2f2f2;
}
.form-control, .form-control:focus {
    box-shadow: none;
}
.form-control {
    font-family: Montserrat, sans-serif;
    display: block;
    width: 100%;
    height: calc(1.5em + .75rem + 2px);
    padding: .375rem 1rem;
    font-size: 1rem;
    font-weight: 300;
    line-height: 1.5;
    color: #495057;
    background-clip: padding-box;
    border-radius: .5rem;
}
.btn:not(:disabled):not(.disabled) {
    cursor: pointer;
}
.btn:not(.active) {
    box-shadow: none!important;
}
.btn-sm {
    padding: .4rem .8rem;
    font-size: .785rem;
    line-height: 1.5;
    border-radius: .45rem;
}
.btn-info {
    color: #fff;
    /* background-color: #1a86d0;
    border-color: #1a86d0; */
    box-shadow: inset 0 1px 0 hsla(0, 0%, 100%, .15),
        0 1px 1px rgba(0,0,0,.075);
}
.btn {
    display: inline-block;
}
.auth-btn {
    width: 100%;
}
.auth-logo span {
    display: inline-block;
    margin: 0 20px;
}
.social-button {
    width: 100%;
    height: 32px;
    line-height: 1.3;
    font-size: 13px;
    border-radius: 7px;
}
#google-img {
    width:15px;
    height:15px;
    margin-right: 5px;
    margin-left: -20px;
}
.social-text {
    display: inline;
}
</style>
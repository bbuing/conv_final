package com.tour.semiPJ.controller;

import java.util.List;

public class HomeForm {

    private String[] mainTag = {"#휴가","#바다","#산림욕","#계곡","#혼자여행","#당일치기"};
    private String[] mainRegion = { "서울", "인천", "경기도", "충청북도", "충청남도", "경상북도", "경상남도", "전라북도", "전라남도", "강원도", "제주도" };
    private String[] mainTheme = { "커플", "가족", "단체", "나홀로", "힐링", "저가여행", "바다", "계곡", "등산", "반려동물" };
    private String[] mainTransport = { "자동차", "비행기", "배", "기차", "지하철", "버스", "도보" };
    private String[] mainStay = { "펜션", "호텔", "모텔", "게스트하우스" };

    public String[] getMainTag() {
        return mainTag;
    }

    public String[] getMainRegion() {
        return mainRegion;
    }

    public String[] getMainTheme() {
        return mainTheme;
    }

    public String[] getMainTransport() {
        return mainTransport;
    }

    public String[] getMainStay() {
        return mainStay;
    }
}

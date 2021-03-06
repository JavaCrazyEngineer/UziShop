﻿package com.iskyshop.lucene;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LuceneThread implements Runnable {
    private String path;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    private List<LuceneVo> vo_list = new ArrayList();

    public LuceneThread(String path, List<LuceneVo> vo_list) {
        this.path = path;
        this.vo_list = vo_list;
    }

    public void run() {
        LuceneUtil lucene = LuceneUtil.instance();
        lucene.setIndex_path(this.path);
        lucene.deleteAllIndex(true);
        try {
            lucene.writeIndex(this.vo_list, this.path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
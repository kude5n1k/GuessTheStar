package com.example.guessthestar.utils;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class DiskExecutor implements Executor {

    private Executor diskExecutor;

    public DiskExecutor() {
        this.diskExecutor = Executors.newSingleThreadExecutor();
    }

    @Override
    public void execute(Runnable runnable) {
        diskExecutor.execute(runnable);
    }
}


package com.example.win7.fyp;

interface GetUserCallback {

    /**
     * Invoked when background task is completed
     */

    public abstract void done(user returnedUser);
}

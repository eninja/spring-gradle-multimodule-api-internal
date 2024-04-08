package com.example.demoapp.shared;

public class Either<A, B> {
    public final A error;
    public final B ok;
    private final boolean isError;

    private Either(A error, B ok, boolean isError) {
        this.error = error;
        this.ok = ok;
        this.isError = isError;
    }

    public static <A, B> Either<A, B> ofError(A error) {
        return new Either<>(error, null, true);
    }

    public static <A, B> Either<A, B> ofOk(B value) {
        return new Either<>(null, value, false);
    }

    public boolean isError() {
        return isError;
    }

    @Override
    public String toString() {
        return "Either{" +
                "error=" + error +
                ", ok=" + ok +
                ", isError=" + isError +
                '}';
    }
}

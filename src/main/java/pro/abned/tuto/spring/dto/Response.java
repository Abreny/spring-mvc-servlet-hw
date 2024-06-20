package pro.abned.tuto.spring.dto;

public record Response<T> (T data) {

    public static <R> Response<R> ok(R data) {
        return new Response<>(data);
    }
}

package gateway;

import io.micronaut.retry.annotation.Fallback;
import io.reactivex.Single;

@Fallback
public class EncryptClientFallback implements EncryptOperations {

    @Override
    public Single<MyMessage> encrypt(String text) {
        return Single.just(new MyMessage("Fallback!"));
    }
}

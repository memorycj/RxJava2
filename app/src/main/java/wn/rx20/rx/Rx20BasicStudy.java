package wn.rx20.rx;

import org.reactivestreams.Subscription;



import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/**
 * author : wn
 * e-mail : memory_cjj@163.com
 * time   : 2017-06-08
 */


public class Rx20BasicStudy {

    public void simpleFlowable() {

        Flowable.create(new FlowableOnSubscribe<String>() {
            @Override
            public void subscribe(@NonNull FlowableEmitter<String> emitter) throws Exception {
                emitter.onNext("haha");
                emitter.onNext("heihei");
                emitter.onNext("lala");
                emitter.onComplete();
            }
        }, BackpressureStrategy.ERROR).subscribe(new FlowableSubscriber<String>() {
            @Override
            public void onSubscribe(@NonNull Subscription s) {

                s.request(1);
            }

            @Override
            public void onNext(String s) {

            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onComplete() {

            }
        });
    }



    public void simpleObserverble() {
        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<String> emitter) throws Exception {

            }
        }).subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                d.dispose();
            }

            @Override
            public void onNext(@NonNull String s) {

            }

            @Override
            public void onError(@NonNull Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}

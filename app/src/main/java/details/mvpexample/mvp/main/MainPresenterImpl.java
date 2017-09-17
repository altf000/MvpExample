package details.mvpexample.mvp.main;

/**
 * Created by neox on 17.09.17.
 */

public class MainPresenterImpl extends MainPresenter {

    @Override
    public void getMessages() {
        getView().showLoading();
        getView().getMessageDone("Message");
        getView().hideLoading();
    }

    @Override
    public void detachView() {
        super.detachView();
    }
}

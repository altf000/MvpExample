package details.mvpexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import details.mvpexample.mvp.main.MainPresenter;
import details.mvpexample.mvp.main.MainPresenterImpl;
import details.mvpexample.mvp.main.MainPresenterView;

public class MainActivity extends AppCompatActivity implements MainPresenterView{

    private MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainPresenter = new MainPresenterImpl();
        mMainPresenter.attachView(this);
        mMainPresenter.getMessages();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMainPresenter.detachView();
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void showLoading() {
        // show progressBar
    }

    @Override
    public void hideLoading() {
        // hide progressBar
    }

    @Override
    public void showError(String error) {
        Toast.makeText(getContext(), error, Toast.LENGTH_LONG).show();
    }

    @Override
    public void getMessageDone(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_LONG).show();
    }
}

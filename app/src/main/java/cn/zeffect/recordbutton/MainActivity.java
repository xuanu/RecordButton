package cn.zeffect.recordbutton;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import cn.zeffect.view.recordbutton.RecordButton;

public class MainActivity extends AppCompatActivity {
    RecordButton img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (RecordButton) findViewById(R.id.img);
        // img.setSavePath();//可选
        //img.setMaxIntervalTime();//可选
        img.setOnFinishedRecordListener(new RecordButton.OnFinishedRecordListener() {
            @Override
            public void onFinishedRecord(String audioPath) {
                //录音完成回调
            }
        });
        //img.getDrawable().setLevel(4000);
        //new ProgressTask().execute();
    }

    public class ProgressTask extends AsyncTask<Void, Integer, Void> {
        private int mProgress = 0;

        @Override
        protected Void doInBackground(Void... params) {
            while (mProgress <= 10000) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                publishProgress(mProgress += 500);
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            System.out.println("当前进度：" + values[0]);
        }

    }
}

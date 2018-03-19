package com.staging.hema;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

import cn.jpush.android.api.JPushInterface;

public class TestActivity extends Activity {

    private TextView mTitle;
    private TextView mContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_ac);
        initView();
//        TextView tv = new TextView(this);
//        tv.setText("用户自定义打开的Activity");
        Intent intent = getIntent();
        if (null != intent) {
            Bundle bundle = getIntent().getExtras();
            String title = null;
            String content = null;
            if (bundle != null) {

                title = "EXTRA_NOTIFICATION_TITLE = " + bundle.getString(JPushInterface.EXTRA_NOTIFICATION_TITLE);

                content += "\n CONNECTION = " + bundle.getString(JPushInterface.ACTION_CONNECTION_CHANGE);
                content += "\n REGISTRATION = " + bundle.getString(JPushInterface.ACTION_REGISTRATION_ID);
                content += "\n STOPPUSH = " + bundle.getString(JPushInterface.ACTION_STOPPUSH);
                content += "\n RESTOREPUSH = " + bundle.getString(JPushInterface.ACTION_RESTOREPUSH);
                content += "\n MESSAGE_RECEIVED = " + bundle.getString(JPushInterface.ACTION_MESSAGE_RECEIVED);

                content += "\n NOTIFICATION_RECEIVED = " + bundle.getString(JPushInterface.ACTION_NOTIFICATION_RECEIVED);
                content += "\n NOTIFICATION_OPENED = " + bundle.getString(JPushInterface.ACTION_NOTIFICATION_OPENED);
                content += "\n NOTIFICATION_CLICK_ACTION = " + bundle.getString(JPushInterface.ACTION_NOTIFICATION_CLICK_ACTION);
                content += "\n NOTIFICATION_RECEIVED_PROXY = " + bundle.getString(JPushInterface.ACTION_NOTIFICATION_RECEIVED_PROXY);
                content += "\n STATUS = " + bundle.getString(JPushInterface.ACTION_STATUS);

                content += "\n ACTION_ACTIVITY_OPENDED = " + bundle.getString(JPushInterface.ACTION_ACTIVITY_OPENDED);
                content += "\n CONNECTION_CHANGE = " + bundle.getString(JPushInterface.EXTRA_CONNECTION_CHANGE);
                content += "\n REGISTRATION_ID = " + bundle.getString(JPushInterface.EXTRA_REGISTRATION_ID);
                content += "\n APPKEY = " + bundle.getString(JPushInterface.EXTRA_APP_KEY);
                content += "\n NOTIFICATION_DEVELOPER_ARG0 = " + bundle.getString(JPushInterface.EXTRA_NOTIFICATION_DEVELOPER_ARG0);

                content += "\n NOTIFICATION_CONTENT_TITLE = " + bundle.getString(JPushInterface.EXTRA_NOTIFICATION_TITLE);
                content += "\n PUSH_ID = " + bundle.getString(JPushInterface.EXTRA_PUSH_ID);
                content += "\n MSG_ID = " + bundle.getString(JPushInterface.EXTRA_MSG_ID);
                content += "\n ALERT = " + bundle.getString(JPushInterface.EXTRA_ALERT);
                content += "\n ALERT_TYPE = " + bundle.getString(JPushInterface.EXTRA_ALERT_TYPE);

                content += "\n MESSAGE = " + bundle.getString(JPushInterface.EXTRA_MESSAGE);
                content += "\n CONTENT_TYPE = " + bundle.getString(JPushInterface.EXTRA_CONTENT_TYPE);
                content += "\n TITLE = " + bundle.getString(JPushInterface.EXTRA_TITLE);
                content += "\n BIG_TEXT = " + bundle.getString(JPushInterface.EXTRA_BIG_TEXT);
                content += "\n INBOX = " + bundle.getString(JPushInterface.EXTRA_INBOX);

                content += "\n BIG_PIC_PATH = " + bundle.getString(JPushInterface.EXTRA_BIG_PIC_PATH);
                content += "\n EXTRA = " + bundle.getString(JPushInterface.EXTRA_EXTRA);
                content += "\n NOTI_PRIORITY = " + bundle.getString(JPushInterface.EXTRA_NOTI_PRIORITY);
                content += "\n NOTI_CATEGORY = " + bundle.getString(JPushInterface.EXTRA_NOTI_CATEGORY);
                content += "\n NOTIFICATION_ID = " + bundle.getString(JPushInterface.EXTRA_NOTIFICATION_ID);

                content += "\n NOTIFIACATION_ACTION_EXTRA = " + bundle.getString(JPushInterface.EXTRA_NOTIFICATION_ACTION_EXTRA);
                content += "\n ACTIVITY_PARAM = " + bundle.getString(JPushInterface.EXTRA_ACTIVITY_PARAM);
                content += "\n FILE_PATH = " + bundle.getString(JPushInterface.EXTRA_RICHPUSH_FILE_PATH);
                content += "\n FILE_TYPE = " + bundle.getString(JPushInterface.EXTRA_RICHPUSH_FILE_TYPE);
                content += "\n HTML_PATH = " + bundle.getString(JPushInterface.EXTRA_RICHPUSH_HTML_PATH);

                content += "\n HTML_RES = " + bundle.getString(JPushInterface.EXTRA_RICHPUSH_HTML_RES);
                content += "\n STATUS = " + bundle.getString(JPushInterface.EXTRA_STATUS);

            }
            mTitle.setText(title);
            mContent.setText(content);
        }

    }

    private void initView() {
        mTitle = (TextView) findViewById(R.id.Title);
        mContent = (TextView) findViewById(R.id.Content);
    }
}

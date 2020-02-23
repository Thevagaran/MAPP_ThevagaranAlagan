package edu.sp.p1827848;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.util.Log;

import android.os.Bundle;

public class P04SecondActivity extends AppCompatActivity {

    public	static	final	String	EXTRA_REPLY	= "edu.sp.p0123456.helloworld.extra.REPLY";
    private	EditText	mReply;
    @Override

    protected	void	onCreate(Bundle	savedInstanceState)	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p04_second);
        mReply	=	findViewById(R.id.editText_second);
        Intent	intent	=	getIntent();
        String	message	=	intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView	textView	=	findViewById(R.id.text_message);
        textView.setText(message);
    }
    public	void	returnReply(View	view)	{
        Log.d("SecondActivity",	"2nd	button	clicked!");
        String	reply	=	mReply.getText().toString();
        Intent	replyIntent	=	new	Intent();
        replyIntent.putExtra(EXTRA_REPLY,	reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
  }


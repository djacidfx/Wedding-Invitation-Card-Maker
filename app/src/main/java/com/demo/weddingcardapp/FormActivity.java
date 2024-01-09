package com.demo.weddingcardapp;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;



import java.util.Calendar;


public class FormActivity extends AppCompatActivity {
    EditText Rsvp;
    TextView addmorefunction1;
    TextView addmorefunction2;
    ImageView back;
    RadioButton boysSide;
    TextView bridedetail;
    ImageView closefun1;
    ImageView closefun2;
    Context context;
    EditText date1;
    EditText date2;
    EditText date3;
    EditText date_other;
    EditText fatherNAmeG;
    EditText fatherNameB;
    EditText firstNameG;
    EditText firstnameB;
    TextView functiondetail;
    EditText functionname1;
    EditText functionname2;
    EditText functionname3;
    public String getRsvp;
    public String getdate1;
    public String getdate2;
    public String getdate3;
    public String getdate_other;
    public String getfatherNAmeG;
    public String getfatherNameB;
    public String getfirstNameG;
    public String getfirstnameB;
    public String getfunctionname1;
    public String getfunctionname2;
    public String getfunctionname3;
    public String getgrandFatherNameB;
    public String getgrandFathernameG;
    public String getgrandMothernameB;
    public String getgrandMothernameG;
    public String getlastNameB;
    public String getlastNameG;
    public String getmotherNameB;
    public String getmotherNameG;
    public String gettime1;
    public String gettime2;
    public String gettime3;
    public String getvenue1;
    public String getvenue2;
    public String getvenue3;
    public String getvenue_other;
    RadioButton girlsSide;
    EditText grandFatherNameB;
    EditText grandFathernameG;
    EditText grandMothernameB;
    EditText grandMothernameG;
    TextView groomdetail;
    EditText lastNameB;
    EditText lastNameG;
    LinearLayout layout_toolbar;
    LinearLayout layoutbride;
    LinearLayout layoutgroom;
    LinearLayout layouttop;
    LinearLayout lenearfun2;
    LinearLayout lenearfun3;
    LinearLayout linearMain;
    private int mDay;
    private int mMonth;
    private int mYear;
    EditText motherNameB;
    EditText motherNameG;
    TextView otherdetail;
    ImageView preview;
    EditText time1;
    EditText time2;
    EditText time3;
    EditText venue1;
    EditText venue2;
    EditText venue3;
    EditText venue_other;
    String visibleornot3;
    String visibleotnot2;
    String F = "null";
    String relation = "Daughter Of";
    String grandrelation = "Grand Daughter Of";
    String secondrelation = "Son Of";
    String secondgrandrelation = "Grand Son Of";
    TextView[] tvArray = new TextView[31];

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_form);



        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);
        
        initToolbar(R.color.color_bg1, R.drawable.pinkbar);
        this.context = this;
        final Integer valueOf = Integer.valueOf(getIntent().getExtras().getInt("position"));
        this.boysSide = (RadioButton) findViewById(R.id.boysSide);
        this.girlsSide = (RadioButton) findViewById(R.id.girlsSide);
        if (valueOf != null) {
            Log.d("position", valueOf.toString());
        }
        this.layouttop = (LinearLayout) findViewById(R.id.layouttop);
        this.linearMain = (LinearLayout) findViewById(R.id.linearMain);
        this.layoutgroom = (LinearLayout) findViewById(R.id.layoutgroom);
        this.layoutbride = (LinearLayout) findViewById(R.id.layoutbride);
        this.bridedetail = (TextView) findViewById(R.id.bridedetail);
        this.firstNameG = (EditText) findViewById(R.id.firstNameG);
        this.lastNameG = (EditText) findViewById(R.id.lastNameG);
        this.fatherNAmeG = (EditText) findViewById(R.id.fatherNAmeG);
        this.motherNameG = (EditText) findViewById(R.id.motherNameG);
        this.grandFathernameG = (EditText) findViewById(R.id.grandFathernameG);
        this.grandMothernameG = (EditText) findViewById(R.id.grandMothernameG);
        this.groomdetail = (TextView) findViewById(R.id.groomdetail);
        this.firstnameB = (EditText) findViewById(R.id.firstnameB);
        this.lastNameB = (EditText) findViewById(R.id.lastNameB);
        this.fatherNameB = (EditText) findViewById(R.id.fatherNameB);
        this.motherNameB = (EditText) findViewById(R.id.motherNameB);
        this.grandFatherNameB = (EditText) findViewById(R.id.grandFatherNameB);
        this.grandMothernameB = (EditText) findViewById(R.id.grandMothernameB);
        this.functiondetail = (TextView) findViewById(R.id.functiondetail);
        this.functionname1 = (EditText) findViewById(R.id.Functionname1);
        this.date1 = (EditText) findViewById(R.id.date1);
        this.time1 = (EditText) findViewById(R.id.time1);
        this.venue1 = (EditText) findViewById(R.id.venue1);
        this.addmorefunction1 = (TextView) findViewById(R.id.addmorefunction1);
        this.lenearfun2 = (LinearLayout) findViewById(R.id.lenearfun2);
        this.closefun1 = (ImageView) findViewById(R.id.closebtn1);
        this.functionname2 = (EditText) findViewById(R.id.Functionname2);
        this.date2 = (EditText) findViewById(R.id.date2);
        this.time2 = (EditText) findViewById(R.id.time2);
        this.venue2 = (EditText) findViewById(R.id.venue2);
        this.addmorefunction2 = (TextView) findViewById(R.id.addmorefunction2);
        this.lenearfun3 = (LinearLayout) findViewById(R.id.lenearfun3);
        this.closefun2 = (ImageView) findViewById(R.id.closebtn2);
        this.functionname3 = (EditText) findViewById(R.id.Functionname3);
        this.date3 = (EditText) findViewById(R.id.date3);
        this.time3 = (EditText) findViewById(R.id.time3);
        this.venue3 = (EditText) findViewById(R.id.venue3);
        this.otherdetail = (TextView) findViewById(R.id.otherdetail);
        this.Rsvp = (EditText) findViewById(R.id.Rsvp);
        this.date_other = (EditText) findViewById(R.id.date_other);
        this.venue_other = (EditText) findViewById(R.id.venue_other);
        this.preview = (ImageView) findViewById(R.id.preview);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        this.lenearfun2.setLayoutParams(layoutParams);
        this.lenearfun3.setLayoutParams(layoutParams);
        this.addmorefunction2.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        deepChangeTextColor(this.layouttop, R.color.color_brideform);
        this.girlsSide.performClick();
        this.boysSide.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                FormActivity formActivity = FormActivity.this;
                formActivity.deepChangeTextColor(formActivity.layouttop, R.color.color_groomform);
                FormActivity.this.relation = "Daughter Of";
                FormActivity.this.grandrelation = "Grand Daughter Of";
                FormActivity.this.linearMain.removeAllViews();
                FormActivity.this.linearMain.addView(FormActivity.this.layoutgroom);
                FormActivity.this.linearMain.addView(FormActivity.this.layoutbride);
            }
        });
        this.girlsSide.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                FormActivity formActivity = FormActivity.this;
                formActivity.deepChangeTextColor(formActivity.layouttop, R.color.color_brideform);
                FormActivity.this.relation = "Son Of";
                FormActivity.this.grandrelation = "Grand Son Of";
                FormActivity.this.linearMain.removeAllViews();
                FormActivity.this.linearMain.addView(FormActivity.this.layoutbride);
                FormActivity.this.linearMain.addView(FormActivity.this.layoutgroom);
            }
        });
        this.date1.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                FormActivity.this.mYear = calendar.get(1);
                FormActivity.this.mMonth = calendar.get(2);
                FormActivity.this.mDay = calendar.get(5);
                new DatePickerDialog(FormActivity.this, new DatePickerDialog.OnDateSetListener() { 
                    @Override 
                    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                        FormActivity.this.date1.setText(i3 + " - " + (i2 + 1) + " - " + i);
                    }
                }, FormActivity.this.mYear, FormActivity.this.mMonth, FormActivity.this.mDay).show();
            }
        });
        this.time1.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                TimePickerDialog timePickerDialog = new TimePickerDialog(FormActivity.this, new TimePickerDialog.OnTimeSetListener() { 
                    @Override 
                    public void onTimeSet(TimePicker timePicker, int i, int i2) {
                        String str = i >= 12 ? "PM" : "AM";
                        FormActivity.this.time1.setText(i + ":" + i2 + " " + str);
                    }
                }, calendar.get(11), calendar.get(12), false);
                timePickerDialog.setTitle("Select Time");
                timePickerDialog.show();
            }
        });
        this.date2.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                FormActivity.this.mYear = calendar.get(1);
                FormActivity.this.mMonth = calendar.get(2);
                FormActivity.this.mDay = calendar.get(5);
                new DatePickerDialog(FormActivity.this, new DatePickerDialog.OnDateSetListener() { 
                    @Override 
                    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                        EditText editText = FormActivity.this.date2;
                        editText.setText(i3 + " - " + (i2 + 1) + " - " + i);
                    }
                }, FormActivity.this.mYear, FormActivity.this.mMonth, FormActivity.this.mDay).show();
            }
        });
        this.time2.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                TimePickerDialog timePickerDialog = new TimePickerDialog(FormActivity.this, new TimePickerDialog.OnTimeSetListener() { 
                    @Override 
                    public void onTimeSet(TimePicker timePicker, int i, int i2) {
                        String str = i >= 12 ? "PM" : "AM";
                        EditText editText = FormActivity.this.time2;
                        editText.setText(i + ":" + i2 + " " + str);
                    }
                }, calendar.get(11), calendar.get(12), false);
                timePickerDialog.setTitle("Select Time");
                timePickerDialog.show();
            }
        });
        this.date3.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                FormActivity.this.mYear = calendar.get(1);
                FormActivity.this.mMonth = calendar.get(2);
                FormActivity.this.mDay = calendar.get(5);
                new DatePickerDialog(FormActivity.this, new DatePickerDialog.OnDateSetListener() { 
                    @Override 
                    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                        EditText editText = FormActivity.this.date3;
                        editText.setText(i3 + " - " + (i2 + 1) + " - " + i);
                    }
                }, FormActivity.this.mYear, FormActivity.this.mMonth, FormActivity.this.mDay).show();
            }
        });
        this.time3.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                TimePickerDialog timePickerDialog = new TimePickerDialog(FormActivity.this, new TimePickerDialog.OnTimeSetListener() { 
                    @Override 
                    public void onTimeSet(TimePicker timePicker, int i, int i2) {
                        String str = i >= 12 ? "PM" : "AM";
                        EditText editText = FormActivity.this.time3;
                        editText.setText(i + ":" + i2 + " " + str);
                    }
                }, calendar.get(11), calendar.get(12), false);
                timePickerDialog.setTitle("Select Time");
                timePickerDialog.show();
            }
        });
        this.date_other.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                FormActivity.this.mYear = calendar.get(1);
                FormActivity.this.mMonth = calendar.get(2);
                FormActivity.this.mDay = calendar.get(5);
                new DatePickerDialog(FormActivity.this, new DatePickerDialog.OnDateSetListener() { 
                    @Override 
                    public void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                        EditText editText = FormActivity.this.date_other;
                        editText.setText(i3 + " - " + (i2 + 1) + " - " + i);
                    }
                }, FormActivity.this.mYear, FormActivity.this.mMonth, FormActivity.this.mDay).show();
            }
        });
        this.addmorefunction1.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                FormActivity.this.lenearfun2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                FormActivity.this.addmorefunction2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                FormActivity.this.lenearfun2.setVisibility(View.VISIBLE);
                FormActivity.this.visibleotnot2 = "VISIBLE";
                FormActivity.this.addmorefunction1.setVisibility(View.GONE);
                FormActivity.this.addmorefunction2.setVisibility(View.VISIBLE);
            }
        });
        this.closefun1.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                FormActivity.this.lenearfun2.setVisibility(View.GONE);
                FormActivity.this.visibleotnot2 = "GONE";
                FormActivity.this.addmorefunction1.setVisibility(View.VISIBLE);
                FormActivity.this.addmorefunction2.setVisibility(View.GONE);
            }
        });
        this.addmorefunction2.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                FormActivity.this.lenearfun3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                FormActivity.this.lenearfun3.setVisibility(View.VISIBLE);
                FormActivity.this.visibleornot3 = "VISIBLE";
                FormActivity.this.addmorefunction2.setVisibility(View.GONE);
            }
        });
        this.closefun2.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                FormActivity.this.lenearfun3.setVisibility(View.GONE);
                FormActivity.this.visibleornot3 = "GONE";
                if (FormActivity.this.addmorefunction1.getVisibility() == View.VISIBLE) {
                    FormActivity.this.addmorefunction2.setVisibility(View.GONE);
                }
            }
        });
        this.preview.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                FormActivity formActivity = FormActivity.this;
                formActivity.getfunctionname1 = formActivity.functionname1.getText().toString();
                FormActivity formActivity2 = FormActivity.this;
                formActivity2.getdate1 = formActivity2.date1.getText().toString();
                FormActivity formActivity3 = FormActivity.this;
                formActivity3.gettime1 = formActivity3.time1.getText().toString();
                FormActivity formActivity4 = FormActivity.this;
                formActivity4.getvenue1 = formActivity4.venue1.getText().toString();
                FormActivity formActivity5 = FormActivity.this;
                formActivity5.getfunctionname2 = formActivity5.functionname2.getText().toString();
                FormActivity formActivity6 = FormActivity.this;
                formActivity6.getdate2 = formActivity6.date2.getText().toString();
                FormActivity formActivity7 = FormActivity.this;
                formActivity7.gettime2 = formActivity7.time2.getText().toString();
                FormActivity formActivity8 = FormActivity.this;
                formActivity8.getvenue2 = formActivity8.venue2.getText().toString();
                FormActivity formActivity9 = FormActivity.this;
                formActivity9.getfunctionname3 = formActivity9.functionname3.getText().toString();
                FormActivity formActivity10 = FormActivity.this;
                formActivity10.getdate3 = formActivity10.date3.getText().toString();
                FormActivity formActivity11 = FormActivity.this;
                formActivity11.gettime3 = formActivity11.time3.getText().toString();
                FormActivity formActivity12 = FormActivity.this;
                formActivity12.getvenue3 = formActivity12.venue3.getText().toString();
                FormActivity formActivity13 = FormActivity.this;
                formActivity13.getfirstNameG = formActivity13.firstNameG.getText().toString();
                FormActivity formActivity14 = FormActivity.this;
                formActivity14.getlastNameG = formActivity14.lastNameG.getText().toString();
                FormActivity formActivity15 = FormActivity.this;
                formActivity15.getfatherNAmeG = formActivity15.fatherNAmeG.getText().toString();
                FormActivity formActivity16 = FormActivity.this;
                formActivity16.getmotherNameG = formActivity16.motherNameG.getText().toString();
                FormActivity formActivity17 = FormActivity.this;
                formActivity17.getgrandFathernameG = formActivity17.grandFathernameG.getText().toString();
                FormActivity formActivity18 = FormActivity.this;
                formActivity18.getgrandMothernameG = formActivity18.grandMothernameG.getText().toString();
                FormActivity formActivity19 = FormActivity.this;
                formActivity19.getfirstnameB = formActivity19.firstnameB.getText().toString();
                FormActivity formActivity20 = FormActivity.this;
                formActivity20.getlastNameB = formActivity20.lastNameB.getText().toString();
                FormActivity formActivity21 = FormActivity.this;
                formActivity21.getfatherNameB = formActivity21.fatherNameB.getText().toString();
                FormActivity formActivity22 = FormActivity.this;
                formActivity22.getmotherNameB = formActivity22.motherNameB.getText().toString();
                FormActivity formActivity23 = FormActivity.this;
                formActivity23.getgrandFatherNameB = formActivity23.grandFatherNameB.getText().toString();
                FormActivity formActivity24 = FormActivity.this;
                formActivity24.getgrandMothernameB = formActivity24.grandMothernameB.getText().toString();
                FormActivity formActivity25 = FormActivity.this;
                formActivity25.getRsvp = formActivity25.Rsvp.getText().toString();
                FormActivity formActivity26 = FormActivity.this;
                formActivity26.getdate_other = formActivity26.date_other.getText().toString();
                FormActivity formActivity27 = FormActivity.this;
                formActivity27.getvenue_other = formActivity27.venue_other.getText().toString();
                if (FormActivity.this.getfirstNameG.length() == 0) {
                    FormActivity.this.firstNameG.requestFocus();
                    FormActivity.this.firstNameG.setError("FIRSTNAME FIELD CANNOT BE EMPTY");
                    FormActivity.this.F = "false";
                } else if (FormActivity.this.getlastNameG.length() == 0) {
                    FormActivity.this.lastNameG.requestFocus();
                    FormActivity.this.lastNameG.setError("LAST NAME FIELD CANNOT BE EMPTY");
                    FormActivity.this.F = "false";
                } else if (FormActivity.this.getfatherNAmeG.length() == 0) {
                    FormActivity.this.fatherNAmeG.requestFocus();
                    FormActivity.this.fatherNAmeG.setError("FATHER NAME FIELD CANNOT BE EMPTY");
                    FormActivity.this.F = "false";
                } else if (FormActivity.this.getmotherNameG.length() == 0) {
                    FormActivity.this.motherNameG.requestFocus();
                    FormActivity.this.motherNameG.setError("MOTHER NAME FIELD CANNOT BE EMPTY");
                    FormActivity.this.F = "false";
                } else if (FormActivity.this.getfirstnameB.length() == 0) {
                    FormActivity.this.firstnameB.requestFocus();
                    FormActivity.this.firstnameB.setError("FIRST NAMEb FIELD CANNOT BE EMPTY");
                    FormActivity.this.F = "false";
                } else if (FormActivity.this.getlastNameB.length() == 0) {
                    FormActivity.this.lastNameB.requestFocus();
                    FormActivity.this.lastNameB.setError("LASTNAMEb FIELD CANNOT BE EMPTY");
                    FormActivity.this.F = "false";
                } else if (FormActivity.this.getfatherNameB.length() == 0) {
                    FormActivity.this.fatherNameB.requestFocus();
                    FormActivity.this.fatherNameB.setError("FATHERNAMEb FIELD CANNOT BE EMPTY");
                    FormActivity.this.F = "false";
                } else if (FormActivity.this.getmotherNameB.length() == 0) {
                    FormActivity.this.motherNameB.requestFocus();
                    FormActivity.this.motherNameB.setError("MOTHERNAMEB FIELD CANNOT BE EMPTY");
                    FormActivity.this.F = "false";
                } else if (FormActivity.this.getfunctionname1.length() == 0) {
                    FormActivity.this.functionname1.requestFocus();
                    FormActivity.this.functionname1.setError("FUNCTION1 FIELD CANNOT BE EMPTY");
                    FormActivity.this.F = "false";
                } else if (FormActivity.this.getdate1.length() == 0) {
                    FormActivity.this.date1.requestFocus();
                    FormActivity.this.date1.setError("DATE1 FIELD CANNOT BE EMPTY");
                    FormActivity.this.F = "false";
                } else if (FormActivity.this.gettime1.length() == 0) {
                    FormActivity.this.time1.requestFocus();
                    FormActivity.this.time1.setError("TIME1 FIELD CANNOT BE EMPTY");
                    FormActivity.this.F = "false";
                } else if (FormActivity.this.getvenue1.length() == 0) {
                    FormActivity.this.venue1.requestFocus();
                    FormActivity.this.venue1.setError("VENUE1 FIELD CANNOT BE EMPTY");
                    FormActivity.this.F = "false";
                } else if (FormActivity.this.visibleotnot2 == "VISIBLE") {
                    if (FormActivity.this.getfunctionname2.length() == 0) {
                        FormActivity.this.F = "false";
                        FormActivity.this.functionname2.requestFocus();
                        FormActivity.this.functionname2.setError("FUNCTION2 FIELD CANNOT BE EMPTY");
                    } else if (FormActivity.this.getdate2.length() == 0) {
                        FormActivity.this.F = "false";
                        FormActivity.this.date2.requestFocus();
                        FormActivity.this.date2.setError("DATE2 FIELD CANNOT BE EMPTY");
                    } else if (FormActivity.this.gettime2.length() == 0) {
                        FormActivity.this.F = "false";
                        FormActivity.this.time2.requestFocus();
                        FormActivity.this.time2.setError("TIME2 FIELD CANNOT BE EMPTY");
                    } else if (FormActivity.this.getvenue2.length() == 0) {
                        FormActivity.this.F = "false";
                        FormActivity.this.venue2.requestFocus();
                        FormActivity.this.venue2.setError("VENUE2 FIELD CANNOT BE EMPTY");
                    } else if (FormActivity.this.visibleornot3 == "VISIBLE") {
                        if (FormActivity.this.getfunctionname3.length() == 0) {
                            FormActivity.this.F = "false";
                            FormActivity.this.functionname3.requestFocus();
                            FormActivity.this.functionname3.setError("FUNCTION3 FIELD CANNOT BE EMPTY");
                        } else if (FormActivity.this.getdate3.length() == 0) {
                            FormActivity.this.F = "false";
                            FormActivity.this.date3.requestFocus();
                            FormActivity.this.date3.setError("DATE3 FIELD CANNOT BE EMPTY");
                        } else if (FormActivity.this.gettime3.length() == 0) {
                            FormActivity.this.F = "false";
                            FormActivity.this.time3.requestFocus();
                            FormActivity.this.time3.setError("TIME3 FIELD CANNOT BE EMPTY");
                        } else if (FormActivity.this.getvenue3.length() == 0) {
                            FormActivity.this.F = "false";
                            FormActivity.this.venue3.requestFocus();
                            FormActivity.this.venue3.setError("VENUE3 FIELD CANNOT BE EMPTY");
                        } else if (FormActivity.this.getdate_other.length() == 0) {
                            FormActivity.this.F = "false";
                            FormActivity.this.date_other.requestFocus();
                            FormActivity.this.date_other.setError("DATEO FIELD CANNOT BE EMPTY");
                        } else if (FormActivity.this.getvenue_other.length() == 0) {
                            FormActivity.this.F = "false";
                            FormActivity.this.venue_other.requestFocus();
                            FormActivity.this.venue_other.setError("VENUEO FIELD CANNOT BE EMPTY");
                        } else {
                            FormActivity.this.F = "null";
                        }
                    }
                } else if (FormActivity.this.visibleornot3 == "VISIBLE") {
                    if (FormActivity.this.getfunctionname3.length() == 0) {
                        FormActivity.this.F = "false";
                        FormActivity.this.functionname3.requestFocus();
                        FormActivity.this.functionname3.setError("FUNCTION3 FIELD CANNOT BE EMPTY");
                    } else if (FormActivity.this.getdate3.length() == 0) {
                        FormActivity.this.F = "false";
                        FormActivity.this.date3.requestFocus();
                        FormActivity.this.date3.setError("DATE3 FIELD CANNOT BE EMPTY");
                    } else if (FormActivity.this.gettime3.length() == 0) {
                        FormActivity.this.F = "false";
                        FormActivity.this.time3.requestFocus();
                        FormActivity.this.time3.setError("TIME3 FIELD CANNOT BE EMPTY");
                    } else if (FormActivity.this.getvenue3.length() == 0) {
                        FormActivity.this.F = "false";
                        FormActivity.this.venue3.requestFocus();
                        FormActivity.this.venue3.setError("VENUE3 FIELD CANNOT BE EMPTY");
                    } else if (FormActivity.this.getdate_other.length() == 0) {
                        FormActivity.this.F = "false";
                        FormActivity.this.date_other.requestFocus();
                        FormActivity.this.date_other.setError("DATEO FIELD CANNOT BE EMPTY");
                    } else if (FormActivity.this.getvenue_other.length() == 0) {
                        FormActivity.this.F = "false";
                        FormActivity.this.venue_other.requestFocus();
                        FormActivity.this.venue_other.setError("VENUEO FIELD CANNOT BE EMPTY");
                    } else {
                        FormActivity.this.F = "null";
                    }
                } else if (FormActivity.this.getdate_other.length() == 0) {
                    FormActivity.this.F = "false";
                    FormActivity.this.date_other.requestFocus();
                    FormActivity.this.date_other.setError("DATEO FIELD CANNOT BE EMPTY");
                } else if (FormActivity.this.getvenue_other.length() == 0) {
                    FormActivity.this.F = "false";
                    FormActivity.this.venue_other.requestFocus();
                    FormActivity.this.venue_other.setError("VENUEO FIELD CANNOT BE EMPTY");
                } else {
                    FormActivity.this.F = "null";
                }
                if (FormActivity.this.F == "null") {
                    Intent intent = new Intent(FormActivity.this, PreviewActivity.class);
                    Bundle bundle2 = new Bundle();
                    intent.putExtra("position", valueOf);
                    bundle2.putString("relation", FormActivity.this.relation);
                    bundle2.putString("grandrelation", FormActivity.this.grandrelation);
                    bundle2.putString("secondrelation", FormActivity.this.secondrelation);
                    bundle2.putString("secondgrandrelation", FormActivity.this.secondgrandrelation);
                    bundle2.putString("getfunctionname1", FormActivity.this.getfunctionname1);
                    bundle2.putString("getdate1", FormActivity.this.getdate1);
                    bundle2.putString("gettime1", FormActivity.this.gettime1);
                    bundle2.putString("getvenue1", FormActivity.this.getvenue1);
                    if (FormActivity.this.lenearfun2.getVisibility() == View.VISIBLE) {
                        bundle2.putString("getfunctionname2", FormActivity.this.getfunctionname2);
                        bundle2.putString("getdate2", FormActivity.this.getdate2);
                        bundle2.putString("gettime2", FormActivity.this.gettime2);
                        bundle2.putString("getvenue2", FormActivity.this.getvenue2);
                    }
                    if (FormActivity.this.lenearfun3.getVisibility() == View.VISIBLE) {
                        bundle2.putString("getfunctionname3", FormActivity.this.getfunctionname3);
                        bundle2.putString("getdate3", FormActivity.this.getdate3);
                        bundle2.putString("gettime3", FormActivity.this.gettime3);
                        bundle2.putString("getvenue3", FormActivity.this.getvenue3);
                    }
                    bundle2.putString("getfirstNameG", FormActivity.this.getfirstNameG);
                    bundle2.putString("getlastNameG", FormActivity.this.getlastNameG);
                    bundle2.putString("getfatherNAmeG", FormActivity.this.getfatherNAmeG);
                    bundle2.putString("getmotherNameG", FormActivity.this.getmotherNameG);
                    if (FormActivity.this.getgrandMothernameG != null && FormActivity.this.getgrandFathernameG != null) {
                        bundle2.putString("getgrandFathernameG", FormActivity.this.getgrandFathernameG);
                        bundle2.putString("getgrandMothernameG", FormActivity.this.getgrandMothernameG);
                    }
                    bundle2.putString("getfirstnameB", FormActivity.this.getfirstnameB);
                    bundle2.putString("getlastNameB", FormActivity.this.getlastNameB);
                    bundle2.putString("getfatherNameB", FormActivity.this.getfatherNameB);
                    bundle2.putString("getmotherNameB", FormActivity.this.getmotherNameB);
                    if (FormActivity.this.getgrandMothernameB != null && FormActivity.this.getgrandFatherNameB != null) {
                        bundle2.putString("getgrandFatherNameB", FormActivity.this.getgrandFatherNameB);
                        bundle2.putString("getgrandMothernameB", FormActivity.this.getgrandMothernameB);
                    }
                    bundle2.putString("getRsvp", FormActivity.this.getRsvp);
                    bundle2.putString("getdate_other", FormActivity.this.getdate_other);
                    bundle2.putString("getvenue_other", FormActivity.this.getvenue_other);
                    if (FormActivity.this.lenearfun2.getVisibility() == View.VISIBLE) {
                        bundle2.putString("lenearfun2", "VISIBLE");
                    }
                    if (FormActivity.this.lenearfun3.getVisibility() == View.VISIBLE) {
                        bundle2.putString("lenearfun3", "VISIBLE");
                    }
                    intent.putExtras(bundle2);
                    FormActivity.this.startActivity(intent);
                    return;
                }
                Log.d("fail", "please fill all the details");
            }
        });
    }

    public void deepChangeTextColor(ViewGroup viewGroup, int i) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof EditText) {
                EditText editText = (EditText) childAt;
                editText.getBackground().mutate().setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
                editText.setTextColor(i);
            } else if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(i);
            } else if (childAt instanceof ViewGroup) {
                if (this.girlsSide.isChecked()) {
                    deepChangeTextColor((ViewGroup) childAt, getResources().getColor(R.color.color_brideform));
                    this.preview.setImageResource(R.drawable.preview_bride);
                    initToolbar(R.color.color_brideform, R.drawable.pinkbar);
                }
                if (this.boysSide.isChecked()) {
                    deepChangeTextColor((ViewGroup) childAt, getResources().getColor(R.color.color_groomform));
                    this.preview.setImageResource(R.drawable.preview_groom);
                    initToolbar(R.color.color_groomform, R.drawable.bluebar);
                }
                setBlackColor();
            }
        }
    }

    private void setBlackColor() {
        this.groomdetail.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.bridedetail.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.functiondetail.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.otherdetail.setTextColor(ViewCompat.MEASURED_STATE_MASK);
    }

    private void initToolbar(int i, int i2) {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT >= 21) {
            window.setStatusBarColor(ContextCompat.getColor(this, i));
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_toolbar);
        this.layout_toolbar = linearLayout;
        linearLayout.setBackgroundResource(i2);
        ImageView imageView = (ImageView) findViewById(R.id.back);
        this.back = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                FormActivity.this.onBackPressed();
            }
        });
    }

    public void backdialog() {
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { 
            @Override 
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i == -3) {
                    dialogInterface.dismiss();
                } else if (i != -1) {
                } else {
                    FormActivity.this.finish();
                }
            }
        };
        new AlertDialog.Builder(this).setMessage("Discard editing?").setPositiveButton("Ok", onClickListener).setTitle("").setNeutralButton("Cancel", onClickListener).show();
    }

    @Override 
    public void onBackPressed() {
        backdialog();
    }
}

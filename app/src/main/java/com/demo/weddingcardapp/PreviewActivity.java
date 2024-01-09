package com.demo.weddingcardapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfDocument;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class PreviewActivity extends AppCompatActivity {
    public static long saved_filenm;
    ImageView back;
    Bitmap bmp;
    private Button btnNext;
    private Button btnSkip;
    Display display1;
    private TextView[] dots;
    private LinearLayout dotsLayout;
    ImageView download;
    int height;
    LinearLayout layout_toolbar;
    private int[] layouts;
    public String lenear2;
    public String lenear3;
    private MyViewPagerAdapter0 myViewPagerAdapter0;
    private MyViewPagerAdapter1 myViewPagerAdapter1;
    private MyViewPagerAdapter10 myViewPagerAdapter10;
    private MyViewPagerAdapter11 myViewPagerAdapter11;
    private MyViewPagerAdapter2 myViewPagerAdapter2;
    private MyViewPagerAdapter3 myViewPagerAdapter3;
    private MyViewPagerAdapter4 myViewPagerAdapter4;
    private MyViewPagerAdapter5 myViewPagerAdapter5;
    private MyViewPagerAdapter6 myViewPagerAdapter6;
    private MyViewPagerAdapter7 myViewPagerAdapter7;
    private MyViewPagerAdapter8 myViewPagerAdapter8;
    private MyViewPagerAdapter9 myViewPagerAdapter9;
    float newHeight;
    public String p_getRsvp;
    public String p_getdate1;
    public String p_getdate2;
    public String p_getdate3;
    public String p_getdate_other;
    public String p_getfatherNAmeG;
    public String p_getfatherNameB;
    public String p_getfirstNameG;
    public String p_getfirstnameB;
    public String p_getfunctionname1;
    public String p_getfunctionname2;
    public String p_getfunctionname3;
    public String p_getgrandrelation;
    public String p_getlastNameB;
    public String p_getlastNameG;
    public String p_getmotherNameB;
    public String p_getmotherNameG;
    public String p_getrelation;
    public String p_getsecondgrandrelation;
    public String p_getsecondrelation;
    public String p_gettime1;
    public String p_gettime2;
    public String p_gettime3;
    public String p_getvenue1;
    public String p_getvenue2;
    public String p_getvenue3;
    public String p_getvenue_other;
    int position;
    private PrefManager prefManager;
    RelativeLayout relative0;
    RelativeLayout relative1;
    RelativeLayout relative2;
    RelativeLayout relative3;
    float screenWidth;
    private ViewPager viewPager;
    int width;
    public String p_getgrandFathernameG = null;
    public String p_getgrandMothernameG = null;
    public String p_getgrandFatherNameB = null;
    public String p_getgrandMothernameB = null;
    public String json_0 = "{\n     \"Items\": [\n\n        {\n            \"User_Images\":\n            [{\n                \"id\": \"image_0\",\n                \"w\": 400,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n            \n        \n            \"Main_Images\":\n            [{\n                \"Name\": \"W_0_Up_Img_0\"\n            }],\n\n\n            \"Labels\":\n            [\n                {\n                    \"id\": \"Label_0\",\n                    \"w\": 400,\n                    \"h\": 47.644,\n                    \"x\": 298,\n                    \"y\": 202.243,\n                    \"LblText\": \"|| Shree Ganesh ||\",\n                    \"Font_Name\": \"SamarkanNormal\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#d8a966\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 400,\n                    \"h\": 20.433,\n                    \"x\": 298.202,\n                    \"y\": 317.234,\n                    \"LblText\": \"THE WEDDING OF\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 18.38,\n                    \"Font_Color\": \"#cbb14f\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 300,\n                    \"h\": 73,\n                    \"x\": 298,\n                    \"y\": 462.452,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 56.07,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 400,\n                    \"h\": 59.149,\n                    \"x\": 298,\n                    \"y\": 505.234,\n                    \"LblText\": \"&\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 45.4,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 300,\n                    \"h\": 73,\n                    \"x\": 298,\n                    \"y\": 545,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 56.07,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 400,\n                    \"h\": 38.955,\n                    \"x\": 298,\n                    \"y\": 720.319,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 35.05,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 400,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 750.426,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                }\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 400,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_0_Up_Img_1\"\n            }],\n\n\n            \"Labels\": [\n                {\n                    \"id\": \"Label_0\",\n                    \"w\": 400,\n                    \"h\": 44.46,\n                    \"x\": 298,\n                    \"y\": 122.489,\n                    \"LblText\": \"Family\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 400,\n                    \"h\": 73.058,\n                    \"x\": 298,\n                    \"y\": 230.621,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 56.07,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 400,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 284.107,\n                    \"LblText\": \"Change_D_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 400,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 307.094,\n                    \"LblText\": \"Change_Daughter_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 400,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 359.107,\n                    \"LblText\": \"Change_G_D_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 400,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 382.094,\n                    \"LblText\": \"Change_Grand_Daughter_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 400,\n                    \"h\": 73.058,\n                    \"x\": 298,\n                    \"y\": 512.524,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 56.07,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 400,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 559.107,\n                    \"LblText\": \"Change_S_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 400,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 582.094,\n                    \"LblText\": \"Change_Son_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n\n                    \"id\": \"Label_9\",\n                    \"w\": 400,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 634.107,\n                    \"LblText\": \"Change_G_S_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_10\",\n                    \"w\": 400,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 657.094,\n                    \"LblText\": \"Change_Grand_Son_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_11\",\n                    \"w\": 400,\n                    \"h\": 33.345,\n                    \"x\": 298,\n                    \"y\": 756.438,\n                    \"LblText\": \"All Are Welcome\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 30,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n\n        },\n        {\n            \"User_Images\":\n            [\n                {\n                \"id\": \"image_0\",\n                \"w\": 400,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\":\n            [\n                {\n                \"Name\": \"W_0_Up_Img_2\"\n            }],\n\n\n            \"Labels\":\n            [\n                {\n                    \"id\": \"Label_0\",\n                    \"w\": 400,\n                    \"h\": 44.46,\n                    \"x\": 298,\n                    \"y\": 122.489,\n                    \"LblText\": \"Functions\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 400,\n                    \"h\": 73.058,\n                    \"x\": 298,\n                    \"y\": 255.613,\n                    \"LblText\": \"Change_Function_Name1\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 56.07,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 400,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 301.799,\n                    \"LblText\": \"Change_Function_Date_And_Time1\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 400,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 326.271,\n                    \"LblText\": \"Change_Function_Venue1\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 400,\n                    \"h\": 73.059,\n                    \"x\": 298,\n                    \"y\": 441.042,\n                    \"LblText\": \"Change_Function_Name2\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 56.07,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 400,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 496.8,\n                    \"LblText\": \"Change_Function_Date_And_Time2\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 400,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 521.271,\n                    \"LblText\": \"Change_Function_Venue2\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 400,\n                    \"h\": 73.058,\n                    \"x\": 298,\n                    \"y\": 626.471,\n                    \"LblText\": \"Change_Function_Name3\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 56.07,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 400,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 676.8,\n                    \"LblText\": \"Change_Function_Date_And_Time3\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 400,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 701.271,\n                    \"LblText\": \"Change_Function_Venue3\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 400,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_0_Up_Img_3\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_1\",\n                    \"w\": 400,\n                    \"h\": 47.644,\n                    \"x\": 298,\n                    \"y\": 350.164,\n                    \"LblText\": \"|| Shree Ganesh ||\",\n                    \"Font_Name\": \"SamarkanNormal\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 400,\n                    \"h\": 73.059,\n                    \"x\": 298,\n                    \"y\": 449.546,\n                    \"LblText\": \"Venue\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 56.07,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 400,\n                    \"h\": 22.23,\n                    \"x\": 298,\n                    \"y\": 494.445,\n                    \"LblText\": \"Change_Venue_3_Page\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 400,\n                    \"h\": 73.059,\n                    \"x\": 298,\n                    \"y\": 568.098,\n                    \"LblText\": \"C_Rsvp\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 56.07,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 400,\n                    \"h\": 22.23,\n                    \"x\": 298,\n                    \"y\": 612.997,\n                    \"LblText\": \"Change_Rsvp_Name\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 400,\n                    \"h\": 38.955,\n                    \"x\": 298,\n                    \"y\": 720.319,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 35.05,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 400,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 750.426,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#af8c53\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n            ]\n\n        }\n    ]\n}\n";
    public String json_1 = " {\n    \"Items\": [\n\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n\n            \"Main_Images\": [{\n                \"Name\": \"W_1_Up_Img_0\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 350,\n                    \"h\": 21.78,\n                    \"x\": 257.336,\n                    \"y\": 155.113,\n                    \"LblText\": \"Invitation Card\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 350,\n                    \"h\": 111.059,\n                    \"x\": 261.749,\n                    \"y\": 231,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 85.23,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 350,\n                    \"h\": 111.059,\n                    \"x\": 255.835,\n                    \"y\": 327.733,\n                    \"LblText\": \"&\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 85.23,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 350,\n                    \"h\": 111.06,\n                    \"x\": 243.453,\n                    \"y\": 424,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 85.23,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 208.712,\n                    \"h\": 65.569,\n                    \"x\": 260.226,\n                    \"y\": 555.871,\n                    \"LblText\": \"REQUEST THE HONOR OF YOUR PRESENCE AT THEIR MARRIAGE\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 350,\n                    \"h\": 29.519,\n                    \"x\": 257.338,\n                    \"y\": 670.724,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 27.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 350,\n                    \"h\": 18.165,\n                    \"x\": 257.335,\n                    \"y\": 705.792,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_1_Up_Img_1\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 144.749,\n                    \"h\": 32.669,\n                    \"x\": 250.169,\n                    \"y\": 129.381,\n                    \"LblText\": \"Family\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 30,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 350,\n                    \"h\": 73.058,\n                    \"x\": 251.366,\n                    \"y\": 238.326,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 56.07,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 350,\n                    \"h\": 19.021,\n                    \"x\": 259.562,\n                    \"y\": 288.53,\n                    \"LblText\": \"Change_D_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 350,\n                    \"h\": 19.021,\n                    \"x\": 258.21,\n                    \"y\": 311.516,\n                    \"LblText\": \"Change_Daughter_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 350,\n                    \"h\": 19.021,\n                    \"x\": 259.562,\n                    \"y\": 363.53,\n                    \"LblText\": \"Change_G_D_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 350,\n                    \"h\": 19.021,\n                    \"x\": 258.21,\n                    \"y\": 386.516,\n                    \"LblText\": \"Change_Grand_Daughter_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 350,\n                    \"h\": 73.059,\n                    \"x\": 241.532,\n                    \"y\": 467.191,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 56.07,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 350,\n                    \"h\": 19.021,\n                    \"x\": 254.375,\n                    \"y\": 521.92,\n                    \"LblText\": \"Change_S_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 350,\n                    \"h\": 19.021,\n                    \"x\": 253.023,\n                    \"y\": 544.906,\n                    \"LblText\": \"Change_Son_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 350,\n                    \"h\": 19.021,\n                    \"x\": 254.375,\n                    \"y\": 594.92,\n                    \"LblText\": \"Change_G_S_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_10\",\n                    \"w\": 350,\n                    \"h\": 19.021,\n                    \"x\": 253.023,\n                    \"y\": 619.906,\n                    \"LblText\": \"Change_Grand_Son_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_11\",\n                    \"w\": 350,\n                    \"h\": 21.78,\n                    \"x\": 249.998,\n                    \"y\": 733.708,\n                    \"LblText\": \"- All Are Welcome -\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n\n            ]\n\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_1_Up_Img_2\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 350,\n                    \"h\": 32.669,\n                    \"x\": 260.514,\n                    \"y\": 129.381,\n                    \"LblText\": \"- Function -\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 30,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 350,\n                    \"h\": 73.058,\n                    \"x\": 258.002,\n                    \"y\": 217.029,\n                    \"LblText\": \"Change_Function_Name1\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 56.07,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 350,\n                    \"h\": 19.021,\n                    \"x\": 258.689,\n                    \"y\": 262.87,\n                    \"LblText\": \"Change_Function_Date_And_Time1\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 350,\n                    \"h\": 19.021,\n                    \"x\": 258.553,\n                    \"y\": 287.342,\n                    \"LblText\": \"Change_Function_Venue1\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 350,\n                    \"h\": 73.058,\n                    \"x\": 258.003,\n                    \"y\": 430.804,\n                    \"LblText\": \"Change_Function_Name2\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 56.07,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 350,\n                    \"h\": 19.021,\n                    \"x\": 258.182,\n                    \"y\": 476.8,\n                    \"LblText\": \"Change_Function_Date_And_Time2\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 350,\n                    \"h\": 19.021,\n                    \"x\": 258.046,\n                    \"y\": 501.271,\n                    \"LblText\": \"Change_Function_Venue2\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 350,\n                    \"h\": 73.059,\n                    \"x\": 258.002,\n                    \"y\": 644.58,\n                    \"LblText\": \"Change_Function_Name3\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 56.07,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 350,\n                    \"h\": 19.021,\n                    \"x\": 258.182,\n                    \"y\": 689.25,\n                    \"LblText\": \"Change_Function_Date_And_Time3\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 350,\n                    \"h\": 19.021,\n                    \"x\": 258.046,\n                    \"y\": 713.722,\n                    \"LblText\": \"Change_Function_Venue3\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_1_Up_Img_3\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 350,\n                    \"h\": 78.336,\n                    \"x\": 256.355,\n                    \"y\": 180.727,\n                    \"LblText\": \"Venue\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 60.12,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 350,\n                    \"h\": 23.836,\n                    \"x\": 256.355,\n                    \"y\": 228.869,\n                    \"LblText\": \"Change_Venue_3_Page\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 21.44,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 350,\n                    \"h\": 78.336,\n                    \"x\": 256.356,\n                    \"y\": 340.669,\n                    \"LblText\": \"C_Rsvp\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 60.12,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 350,\n                    \"h\": 23.836,\n                    \"x\": 256.238,\n                    \"y\": 388.812,\n                    \"LblText\": \"Change_Rsvp_Name\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 21.44,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 350,\n                    \"h\": 92.632,\n                    \"x\": 252.501,\n                    \"y\": 650.646,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 45.09,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 350,\n                    \"h\": 38.955,\n                    \"x\": 256.356,\n                    \"y\": 734.638,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 35.05,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n            ]\n\n        }\n    ]\n}\n";
    public String json_2 = "{\n    \"Items\": [\n\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n\n            \"Main_Images\": [{\n                \"Name\": \"W_2_Up_Img_0\"\n            }],\n\n\n            \"Labels\": [\n                {\n                    \"id\": \"Label_0\",\n                    \"w\": 167,\n                    \"h\": 9.654,\n                    \"x\": 298,\n                    \"y\": 289.021,\n                    \"LblText\": \"THE WEDDING OF\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\":15.49,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 270,\n                    \"h\": 45.872,\n                    \"x\": 298,\n                    \"y\": 360.853,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"TimesNewRomanPS-BoldMT\",\n                    \"Font_Size\": 40.32,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 66.438,\n                    \"h\": 109.303,\n                    \"x\": 298,\n                    \"y\": 408.021,\n                    \"LblText\": \"&\",\n                    \"Font_Name\": \"Adinda\",\n                    \"Font_Size\": 94.11,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 270,\n                    \"h\": 45.871,\n                    \"x\": 298,\n                    \"y\": 466.081,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"TimesNewRomanPS-BoldMT\",\n                    \"Font_Size\": 40.32,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 250.279,\n                    \"h\": 16.273,\n                    \"x\": 298,\n                    \"y\": 538.993,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"TimesNewRomanPS-BoldMT\",\n                    \"Font_Size\": 14.3,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_2_Up_Img_1\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 370.492,\n                    \"h\": 90.44,\n                    \"x\": 298,\n                    \"y\": 72.686,\n                    \"LblText\": \"Family\",\n                    \"Font_Name\": \"EmbassyBT-Regular\",\n                    \"Font_Size\": 78.2,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 370.344,\n                    \"h\": 45.872,\n                    \"x\": 298,\n                    \"y\": 244.172,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"TimesNewRomanPS-BoldMT\",\n                    \"Font_Size\": 40.32,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 370.39,\n                    \"h\": 17.448,\n                    \"x\": 298,\n                    \"y\": 285.639,\n                    \"LblText\": \"Change_D_Of\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 15.34,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 370.787,\n                    \"h\": 17.448,\n                    \"x\": 298,\n                    \"y\": 308.625,\n                    \"LblText\": \"Change_Daughter_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 15.34,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 370.576,\n                    \"h\": 17.448,\n                    \"x\": 298,\n                    \"y\": 360.639,\n                    \"LblText\": \"Change_G_D_Of\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 15.34,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 370.787,\n                    \"h\": 17.448,\n                    \"x\": 298,\n                    \"y\": 383.625,\n                    \"LblText\": \"Change_Grand_Daughter_Of\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 15.34,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 370.954,\n                    \"h\": 45.871,\n                    \"x\": 298,\n                    \"y\": 499.395,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"TimesNewRomanPS-BoldMT\",\n                    \"Font_Size\": 40.32,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 370.173,\n                    \"h\": 17.448,\n                    \"x\": 298,\n                    \"y\": 544.381,\n                    \"LblText\": \"Change_S_Of\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 15.34,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 370.787,\n                    \"h\": 17.448,\n                    \"x\": 298,\n                    \"y\": 567.367,\n                    \"LblText\": \"Change_Son_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 15.34,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 370.36,\n                    \"h\": 17.448,\n                    \"x\": 298,\n                    \"y\": 619.381,\n                    \"LblText\": \"Change_G_S_Of\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 15.34,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_10\",\n                    \"w\": 370.787,\n                    \"h\": 17.448,\n                    \"x\": 298,\n                    \"y\": 642.367,\n                    \"LblText\": \"Change_Grand_Son_Of\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 15.34,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_11\",\n                    \"w\": 370.809,\n                    \"h\": 33.345,\n                    \"x\": 298,\n                    \"y\": 782.984,\n                    \"LblText\": \"All Are Welcome\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 30,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n            ]\n\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_2_Up_Img_2\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 255.313,\n                    \"h\": 90.44,\n                    \"x\": 298,\n                    \"y\": 100.066,\n                    \"LblText\": \"Function\",\n                    \"Font_Name\": \"EmbassyBT-Regular\",\n                    \"Font_Size\": 78.2,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 370.872,\n                    \"h\": 36,\n                    \"x\": 298,\n                    \"y\": 225,\n                    \"LblText\": \"Change_Function_Name1\",\n                    \"Font_Name\": \"TimesNewRomanPS-BoldMT\",\n                    \"Font_Size\": 32,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 370.674,\n                    \"h\": 18,\n                    \"x\": 298,\n                    \"y\": 254.46,\n                    \"LblText\": \"Change_Function_Date_And_Time1\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 370.0,\n                    \"h\": 18,\n                    \"x\": 298,\n                    \"y\": 278.932,\n                    \"LblText\": \"Change_Function_Venue1\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 370,\n                    \"h\": 36,\n                    \"x\": 298,\n                    \"y\": 408.038,\n                    \"LblText\": \"Change_Function_Name2\",\n                    \"Font_Name\": \"TimesNewRomanPS-BoldMT\",\n                    \"Font_Size\": 32,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 370,\n                    \"h\": 18,\n                    \"x\": 298,\n                    \"y\": 438.517,\n                    \"LblText\": \"Change_Function_Date_And_Time2\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 370,\n                    \"h\": 18,\n                    \"x\": 298,\n                    \"y\": 463.988,\n                    \"LblText\": \"Change_Function_Venue2\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 370,\n                    \"h\": 36,\n                    \"x\": 298,\n                    \"y\": 591,\n                    \"LblText\": \"Change_Function_Name3\",\n                    \"Font_Name\": \"TimesNewRomanPS-BoldMT\",\n                    \"Font_Size\": 32,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 370,\n                    \"h\": 18,\n                    \"x\": 298,\n                    \"y\": 620,\n                    \"LblText\": \"Change_Function_Date_And_Time3\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 370,\n                    \"h\": 18,\n                    \"x\": 298,\n                    \"y\": 645,\n                    \"LblText\": \"Change_Function_Venue3\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_2_Up_Img_3\"\n            }],\n\n\n            \"Labels\": [\n                {\n                    \"id\": \"Label_0\",\n                    \"w\": 370,\n                    \"h\": 34.131,\n                    \"x\": 298,\n                    \"y\": 334.235,\n                    \"LblText\": \"|| Shree Ganesh ||\",\n                    \"Font_Name\": \"TimesNewRomanPS-BoldMT\",\n                    \"Font_Size\": 30,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 115.44,\n                    \"h\": 38.285,\n                    \"x\": 298,\n                    \"y\": 461.701,\n                    \"LblText\": \"Venue\",\n                    \"Font_Name\": \"TimesNewRomanPS-BoldMT\",\n                    \"Font_Size\": 33.65,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 370,\n                    \"h\": 22.754,\n                    \"x\": 298,\n                    \"y\": 501.39,\n                    \"LblText\": \"Change_Venue_3_Page\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 370,\n                    \"h\": 38.284,\n                    \"x\": 298,\n                    \"y\": 580.253,\n                    \"LblText\": \"C_Rsvp\",\n                    \"Font_Name\": \"TimesNewRomanPS-BoldMT\",\n                    \"Font_Size\": 33.65,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 370,\n                    \"h\": 23.892,\n                    \"x\": 298,\n                    \"y\": 619.679,\n                    \"LblText\": \"Change_Rsvp_Name\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 21,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 370,\n                    \"h\": 38.955,\n                    \"x\": 298,\n                    \"y\": 747.254,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 35.05,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 370,\n                    \"h\": 22.23,\n                    \"x\": 298,\n                    \"y\": 776.601,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#2d3129\",\n                    \"Font_Rotation\": 0\n\n                }\n            ]\n\n        }\n    ]\n}\n";
    public String json_3 = " {\n    \"Items\": [\n\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n\n            \"Main_Images\":\n            [{\n                \"Name\": \"W_3_Up_Img_0\"\n            }],\n\n\n            \"Labels\":\n            [{\n                    \"id\": \"Label_0\",\n                    \"w\": 440,\n                    \"h\": 90.302,\n                    \"x\": 298,\n                    \"y\": 551.346,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"AlexBrush-Regular\",\n                    \"Font_Size\": 72.56,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 47.284,\n                    \"h\": 79.648,\n                    \"x\": 298,\n                    \"y\": 616.346,\n                    \"LblText\": \"&\",\n                    \"Font_Name\": \"AlexBrush-Regular\",\n                    \"Font_Size\": 64,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 440,\n                    \"h\": 90.302,\n                    \"x\": 298,\n                    \"y\": 681.346,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"AlexBrush-Regular\",\n                    \"Font_Size\": 72.56,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n\n\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 440,\n                    \"h\": 23.892,\n                    \"x\": 298,\n                    \"y\": 735.865,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"TimesNewRomanPSMT\",\n                    \"Font_Size\": 21,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 440,\n                    \"h\": 23.892,\n                    \"x\": 298,\n                    \"y\": 758.622,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 21,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                }\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 440,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_3_Up_Img_1\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 440,\n                    \"h\": 93.338,\n                    \"x\": 298,\n                    \"y\": 119.856,\n                    \"LblText\": \"Family\",\n                    \"Font_Name\": \"AlexBrush-Regular\",\n                    \"Font_Size\": 75,\n                    \"Font_Color\": \"#c0943b\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 440,\n                    \"h\": 74.67,\n                    \"x\": 298,\n                    \"y\": 208.593,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"AlexBrush-Regular\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#c0943b\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 440,\n                    \"h\": 17.923,\n                    \"x\": 298,\n                    \"y\": 270.536,\n                    \"LblText\": \"Change_D_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 16.12,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 440,\n                    \"h\": 17.923,\n                    \"x\": 298,\n                    \"y\": 293.522,\n                    \"LblText\": \"Change_Daughter_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 16.12,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 440,\n                    \"h\": 17.527,\n                    \"x\": 298,\n                    \"y\": 345.041,\n                    \"LblText\": \"Change_G_D_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 16.12,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 440,\n                    \"h\": 17.923,\n                    \"x\": 298,\n                    \"y\": 368.522,\n                    \"LblText\": \"Change_Grand_Daughter_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 16.12,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 440,\n                    \"h\": 74.671,\n                    \"x\": 298,\n                    \"y\": 496.782,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"AlexBrush-Regular\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#c0943b\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 440,\n                    \"h\": 17.923,\n                    \"x\": 298,\n                    \"y\": 549.559,\n                    \"LblText\": \"Change_S_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 16.12,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 440,\n                    \"h\": 17.923,\n                    \"x\": 298,\n                    \"y\": 572.545,\n                    \"LblText\": \"Change_Son_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 16.12,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 440,\n                    \"h\": 17.923,\n                    \"x\": 298,\n                    \"y\": 624.559,\n                    \"LblText\": \"Change_G_S_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 16.12,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_10\",\n                    \"w\": 440,\n                    \"h\": 17.923,\n                    \"x\": 298,\n                    \"y\": 647.545,\n                    \"LblText\": \"Change_Grand_Son_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 16.12,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_11\",\n                    \"w\": 440,\n                    \"h\": 65.959,\n                    \"x\": 298,\n                    \"y\": 729.844,\n                    \"LblText\": \"All are Welcome\",\n                    \"Font_Name\": \"AlexBrush-Regular\",\n                    \"Font_Size\": 53,\n                    \"Font_Color\": \"#c0943b\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_3_Up_Img_2\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 440,\n                    \"h\": 78.404,\n                    \"x\": 298,\n                    \"y\": 122.258,\n                    \"LblText\": \"Function\",\n                    \"Font_Name\": \"AlexBrush-Regular\",\n                    \"Font_Size\": 63,\n                    \"Font_Color\": \"#c0943b\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 440,\n                    \"h\": 74.67,\n                    \"x\": 298,\n                    \"y\": 222.984,\n                    \"LblText\": \"Change_Function_Name1\",\n                    \"Font_Name\": \"AlexBrush-Regular\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 440,\n                    \"h\": 23.341,\n                    \"x\": 298,\n                    \"y\": 274.671,\n                    \"LblText\": \"Change_Function_Date_And_Time1\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 21,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 440,\n                    \"h\": 48.542,\n                    \"x\": 298,\n                    \"y\": 294.622,\n                    \"LblText\": \"Change_Function_Venue1\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 21,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 440,\n                    \"h\": 74.67,\n                    \"x\": 298,\n                    \"y\": 407.344,\n                    \"LblText\": \"Change_Function_Name2\",\n                    \"Font_Name\": \"AlexBrush-Regular\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 440,\n                    \"h\": 23.341,\n                    \"x\": 298,\n                    \"y\": 459.03,\n                    \"LblText\": \"Change_Function_Date_And_Time2\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 21,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 440,\n                    \"h\": 48.542,\n                    \"x\": 298,\n                    \"y\": 478.981,\n                    \"LblText\": \"Change_Function_Venue2\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 21,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 440,\n                    \"h\": 74.67,\n                    \"x\": 298,\n                    \"y\": 601.364,\n                    \"LblText\": \"Change_Function_Name3\",\n                    \"Font_Name\": \"AlexBrush-Regular\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 440,\n                    \"h\": 23.342,\n                    \"x\": 298,\n                    \"y\": 653.051,\n                    \"LblText\": \"Change_Function_Date_And_Time3\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 21,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 440,\n                    \"h\": 48.542,\n                    \"x\": 298,\n                    \"y\": 673.001,\n                    \"LblText\": \"Change_Function_Venue3\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 21,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_3_Up_Img_3\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 440,\n                    \"h\": 78.404,\n                    \"x\": 298,\n                    \"y\": 195.216,\n                    \"LblText\": \"Venue\",\n                    \"Font_Name\": \"AlexBrush-Regular\",\n                    \"Font_Size\": 63,\n                    \"Font_Color\": \"#c0943b\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 440,\n                    \"h\": 23.342,\n                    \"x\": 298,\n                    \"y\": 258.986,\n                    \"LblText\": \"Change_Venue_3_Page\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 21,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 440,\n                    \"h\": 78.404,\n                    \"x\": 298,\n                    \"y\": 367.64,\n                    \"LblText\": \"C_Rsvp\",\n                    \"Font_Name\": \"AlexBrush-Regular\",\n                    \"Font_Size\": 63,\n                    \"Font_Color\": \"#c0943b\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 440,\n                    \"h\": 23.342,\n                    \"x\": 298,\n                    \"y\": 434.563,\n                    \"LblText\": \"Change_Rsvp_Name\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 21,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 440,\n                    \"h\": 34.456,\n                    \"x\": 298,\n                    \"y\": 688.546,\n                    \"LblText\": \"SAVE THE DATE\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 31,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 440,\n                    \"h\": 23.342,\n                    \"x\": 298,\n                    \"y\": 724.599,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 21,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n        }\n    ]\n}\n";
    String json_4 = " {\n    \"Items\": [\n\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n\n            \"Main_Images\": [{\n                \"Name\": \"W_4_Up_Img_0\"\n            }],\n\n\n            \"Labels\":\n            [{\n                    \"id\": \"Label_0\",\n                    \"w\": 152,\n                    \"h\": 56.95,\n                    \"x\": 298,\n                    \"y\": 249.248,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"PlayfairDisplay-Regular\",\n                    \"Font_Size\": 42,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 39.932,\n                    \"h\": 49.284,\n                    \"x\": 298,\n                    \"y\": 293.408,\n                    \"LblText\": \"&\",\n                    \"Font_Name\": \"PlayfairDisplay-Regular\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 152,\n                    \"h\": 56.95,\n                    \"x\": 298,\n                    \"y\": 333.614,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"PlayfairDisplay-Regular\",\n                    \"Font_Size\": 42,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 239.008,\n                    \"h\": 118.049,\n                    \"x\": 298,\n                    \"y\": 527.08,\n                    \"LblText\": \"You are invited to our wedding. Please join us with our family and friends.\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 19.95,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 370,\n                    \"h\": 37.145,\n                    \"x\": 298,\n                    \"y\": 633.476,\n                    \"LblText\": \"SAVE THE DATE\",\n                    \"Font_Name\": \"PlayfairDisplay-Regular\",\n                    \"Font_Size\": 33.92,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 370,\n                    \"h\": 22.289,\n                    \"x\": 298,\n                    \"y\": 680.514,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 19.95,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                }\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_4_Up_Img_1\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 370,\n                    \"h\": 56.95,\n                    \"x\": 298,\n                    \"y\": 146.045,\n                    \"LblText\": \"Family\",\n                    \"Font_Name\": \"PlayfairDisplay-Regular\",\n                    \"Font_Size\": 52,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 370,\n                    \"h\": 38.333,\n                    \"x\": 298,\n                    \"y\": 209.704,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"PlayfairDisplay-Regular\",\n                    \"Font_Size\": 35,\n                    \"Font_Color\": \"#d5a04f\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 370,\n                    \"h\": 17.876,\n                    \"x\": 298,\n                    \"y\": 255.877,\n                    \"LblText\": \"Change_D_Of\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 370,\n                    \"h\": 17.876,\n                    \"x\": 298,\n                    \"y\": 278.863,\n                    \"LblText\": \"Change_Daughter_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 370,\n                    \"h\": 17.876,\n                    \"x\": 298,\n                    \"y\": 330.877,\n                    \"LblText\": \"Change_G_D_Of\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 370,\n                    \"h\": 17.876,\n                    \"x\": 298,\n                    \"y\": 353.863,\n                    \"LblText\": \"Change_Grand_Daughter_Of\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#585b5c\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 370,\n                    \"h\": 38.333,\n                    \"x\": 298,\n                    \"y\": 460.903,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"PlayfairDisplay-Regular\",\n                    \"Font_Size\": 35,\n                    \"Font_Color\": \"#d5a04f\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 370,\n                    \"h\": 17.876,\n                    \"x\": 298,\n                    \"y\": 506.554,\n                    \"LblText\": \"Change_S_Of\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 370,\n                    \"h\": 17.876,\n                    \"x\": 298,\n                    \"y\": 529.541,\n                    \"LblText\": \"Change_Son_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 370,\n                    \"h\": 17.876,\n                    \"x\": 298,\n                    \"y\": 581.554,\n                    \"LblText\": \"Change_G_S_Of\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_10\",\n                    \"w\": 370,\n                    \"h\": 17.876,\n                    \"x\": 298,\n                    \"y\": 604.541,\n                    \"LblText\": \"Change_Grand_Son_Of\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_11\",\n                    \"w\": 370,\n                    \"h\": 35.047,\n                    \"x\": 298,\n                    \"y\": 710.012,\n                    \"LblText\": \"ALL ARE WELCOME\",\n                    \"Font_Name\": \"PlayfairDisplay-Regular\",\n                    \"Font_Size\": 32,\n                    \"Font_Color\": \"#d5a04f\",\n                    \"Font_Rotation\": 0\n\n                }\n            ]\n\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_4_Up_Img_2\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 370,\n                    \"h\": 43.809,\n                    \"x\": 290.789,\n                    \"y\": 167.035,\n                    \"LblText\": \"Function\",\n                    \"Font_Name\": \"PlayfairDisplay-Regular\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 370,\n                    \"h\": 38.333,\n                    \"x\": 298,\n                    \"y\": 251.315,\n                    \"LblText\": \"Change_Function_Name1\",\n                    \"Font_Name\": \"PlayfairDisplay-Regular\",\n                    \"Font_Size\": 35,\n                    \"Font_Color\": \"#d5a04f\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 370,\n                    \"h\": 17.876,\n                    \"x\": 298,\n                    \"y\": 302.687,\n                    \"LblText\": \"Change_Function_Date_And_Time1\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 370,\n                    \"h\": 37.076,\n                    \"x\": 298,\n                    \"y\": 319.637,\n                    \"LblText\": \"Change_Function_Venue1\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 370,\n                    \"h\": 38.333,\n                    \"x\": 298,\n                    \"y\": 415.675,\n                    \"LblText\": \"Change_Function_Name2\",\n                    \"Font_Name\": \"PlayfairDisplay-Regular\",\n                    \"Font_Size\": 35,\n                    \"Font_Color\": \"#d5a04f\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 370,\n                    \"h\": 17.876,\n                    \"x\": 298,\n                    \"y\": 467.046,\n                    \"LblText\": \"Change_Function_Date_And_Time2\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 370,\n                    \"h\": 37.076,\n                    \"x\": 298,\n                    \"y\": 483.996,\n                    \"LblText\": \"Change_Function_Venue2\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 370,\n                    \"h\": 38.333,\n                    \"x\": 298,\n                    \"y\": 589.696,\n                    \"LblText\": \"Change_Function_Name3\",\n                    \"Font_Name\": \"PlayfairDisplay-Regular\",\n                    \"Font_Size\": 35,\n                    \"Font_Color\": \"#d5a04f\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 370,\n                    \"h\": 17.876,\n                    \"x\": 298,\n                    \"y\": 641.067,\n                    \"LblText\": \"Change_Function_Date_And_Time3\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 370,\n                    \"h\": 37.076,\n                    \"x\": 298,\n                    \"y\": 658.018,\n                    \"LblText\": \"Change_Function_Venue3\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n            ]\n\n        },\n        {\n            \"User_Images\":\n            [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\":\n            [{\n                \"Name\": \"W_4_Up_Img_3\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 370,\n                    \"h\": 38.333,\n                    \"x\": 298,\n                    \"y\": 196.919,\n                    \"LblText\": \"Venue\",\n                    \"Font_Name\": \"PlayfairDisplay-Regular\",\n                    \"Font_Size\": 35,\n                    \"Font_Color\": \"#d5a04f\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 370,\n                    \"h\": 17.876,\n                    \"x\": 298,\n                    \"y\": 259.782,\n                    \"LblText\": \"Change_Venue_3_Page\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 370,\n                    \"h\": 38.332,\n                    \"x\": 298,\n                    \"y\": 369.343,\n                    \"LblText\": \"C_Rsvp\",\n                    \"Font_Name\": \"PlayfairDisplay-Regular\",\n                    \"Font_Size\": 35,\n                    \"Font_Color\": \"#d5a04f\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 370,\n                    \"h\": 17.876,\n                    \"x\": 298,\n                    \"y\": 435.358,\n                    \"LblText\": \"Change_Rsvp_Name\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 16,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 370,\n                    \"h\": 32.4,\n                    \"x\": 298,\n                    \"y\": 688.133,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 29,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 370,\n                    \"h\": 23.462,\n                    \"x\": 298,\n                    \"y\": 723.918,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Lato-Light\",\n                    \"Font_Size\": 21,\n                    \"Font_Color\": \"#434143\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n        }\n    ]\n}\n";
    String json_5 = "{\n    \"Items\": [\n\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n\n            \"Main_Images\": [{\n                \"Name\": \"W_5_Up_Img_0\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 400,\n                    \"h\": 60.085,\n                    \"x\": 298,\n                    \"y\": 128.583,\n                    \"LblText\": \"TOGETHER WITH THEIR FAMILIES\",\n                    \"Font_Name\": \"QuestaGrande-Regular\",\n                    \"Font_Size\": 25.85,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 480,\n                    \"h\": 65.661,\n                    \"x\": 298,\n                    \"y\": 253.547,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"QuestaGrande-Regular\",\n                    \"Font_Size\": 59.66,\n                    \"Font_Color\": \"#f8e0bd\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 480,\n                    \"h\": 65.661,\n                    \"x\": 298,\n                    \"y\": 334.024,\n                    \"LblText\": \"&\",\n                    \"Font_Name\": \"QuestaGrande-Regular\",\n                    \"Font_Size\": 59.66,\n                    \"Font_Color\": \"#f8e0bd\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 480,\n                    \"h\": 65.66,\n                    \"x\": 298,\n                    \"y\": 409.291,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"QuestaGrande-Regular\",\n                    \"Font_Size\": 59.66,\n                    \"Font_Color\": \"#f8e0bd\",\n                    \"Font_Rotation\": 0\n\n                },\n\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 265.014,\n                    \"h\": 74.921,\n                    \"x\": 298,\n                    \"y\": 552.14,\n                    \"LblText\": \"REQUEST THE HONOR OF YOUR PRESENCE AT THEIR MARRIAGE\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 21.88,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 480,\n                    \"h\": 29.403,\n                    \"x\": 298,\n                    \"y\": 692.548,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 27.71,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 480,\n                    \"h\": 29.403,\n                    \"x\": 298,\n                    \"y\": 724.432,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 27.71,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_5_Up_Img_1\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 480,\n                    \"h\": 66.029,\n                    \"x\": 298,\n                    \"y\": 103.198,\n                    \"LblText\": \"Family\",\n                    \"Font_Name\": \"QuestaGrande-Regular\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 480,\n                    \"h\": 40.718,\n                    \"x\": 298,\n                    \"y\": 216.238,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"QuestaGrande-Regular\",\n                    \"Font_Size\": 37,\n                    \"Font_Color\": \"#f8e0bd\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 480,\n                    \"h\": 23.212,\n                    \"x\": 298,\n                    \"y\": 257.69,\n                    \"LblText\": \"Change_D_Of\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 21.88,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 480,\n                    \"h\": 23.212,\n                    \"x\": 298,\n                    \"y\": 280.676,\n                    \"LblText\": \"Change_Daughter_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 21.88,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 480,\n                    \"h\": 23.212,\n                    \"x\": 298,\n                    \"y\": 332.69,\n                    \"LblText\": \"Change_G_D_Of\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 21.88,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 480,\n                    \"h\": 23.212,\n                    \"x\": 298,\n                    \"y\": 355.676,\n                    \"LblText\": \"Change_Grand_Daughter_Of\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 21.88,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 52.703,\n                    \"h\": 35.215,\n                    \"x\": 298,\n                    \"y\": 465.5,\n                    \"LblText\": \"and\",\n                    \"Font_Name\": \"QuestaGrande-Regular\",\n                    \"Font_Size\": 32,\n                    \"Font_Color\": \"#d19947\",\n                    \"Font_Rotation\": 0\n\n                },\n\n\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 480,\n                    \"h\": 40.719,\n                    \"x\": 298,\n                    \"y\": 574.809,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"QuestaGrande-Regular\",\n                    \"Font_Size\": 37,\n                    \"Font_Color\": \"#f8e0bd\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 480,\n                    \"h\": 23.212,\n                    \"x\": 298,\n                    \"y\": 618.639,\n                    \"LblText\": \"Change_S_Of\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 21.88,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 480,\n                    \"h\": 23.212,\n                    \"x\": 298,\n                    \"y\": 641.625,\n                    \"LblText\": \"Change_Son_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 21.88,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_10\",\n                    \"w\": 480,\n                    \"h\": 23.212,\n                    \"x\": 298,\n                    \"y\": 693.639,\n                    \"LblText\": \"Change_G_S_Of\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 21.88,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_11\",\n                    \"w\": 480,\n                    \"h\": 23.212,\n                    \"x\": 298,\n                    \"y\": 716.625,\n                    \"LblText\": \"Change_Grand_Son_Of\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 21.88,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_5_Up_Img_2\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 480,\n                    \"h\": 66.029,\n                    \"x\": 298,\n                    \"y\": 97.528,\n                    \"LblText\": \"Functions\",\n                    \"Font_Name\": \"QuestaGrande-Regular\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 480,\n                    \"h\": 44.02,\n                    \"x\": 298,\n                    \"y\": 203.821,\n                    \"LblText\": \"Change_Function_Name1\",\n                    \"Font_Name\": \"QuestaGrande-Regular\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#f8e0bd\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 480,\n                    \"h\": 23.211,\n                    \"x\": 298,\n                    \"y\": 248.208,\n                    \"LblText\": \"Change_Function_Date_And_Time1\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 21.88,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 480,\n                    \"h\": 23.212,\n                    \"x\": 298,\n                    \"y\": 272.679,\n                    \"LblText\": \"Change_Function_Venue1\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 21.88,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 480,\n                    \"h\": 44.02,\n                    \"x\": 298,\n                    \"y\": 417.931,\n                    \"LblText\": \"Change_Function_Name2\",\n                    \"Font_Name\": \"QuestaGrande-Regular\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#f8e0bd\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 480,\n                    \"h\": 23.211,\n                    \"x\": 298,\n                    \"y\": 460.616,\n                    \"LblText\": \"Change_Function_Date_And_Time2\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 21.88,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 480,\n                    \"h\": 23.212,\n                    \"x\": 298,\n                    \"y\": 485.087,\n                    \"LblText\": \"Change_Function_Venue2\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 21.88,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 480,\n                    \"h\": 44.02,\n                    \"x\": 298,\n                    \"y\": 646.215,\n                    \"LblText\": \"Change_Function_Name3\",\n                    \"Font_Name\": \"QuestaGrande-Regular\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#f8e0bd\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 480,\n                    \"h\": 23.211,\n                    \"x\": 298,\n                    \"y\": 692.842,\n                    \"LblText\": \"Change_Function_Date_And_Time3\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 21.88,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 480,\n                    \"h\": 23.212,\n                    \"x\": 298,\n                    \"y\": 717.313,\n                    \"LblText\": \"Change_Function_Venue3\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 21.88,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_5_Up_Img_3\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 480,\n                    \"h\": 50.136,\n                    \"x\": 298,\n                    \"y\": 151.418,\n                    \"LblText\": \"Venue\",\n                    \"Font_Name\": \"QuestaGrande-Regular\",\n                    \"Font_Size\": 45.56,\n                    \"Font_Color\": \"#f8e0bd\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 480,\n                    \"h\": 30.212,\n                    \"x\": 298,\n                    \"y\": 208.584,\n                    \"LblText\": \"Change_Venue_3_Page\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 28.48,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 480,\n                    \"h\": 49.977,\n                    \"x\": 298,\n                    \"y\": 340.496,\n                    \"LblText\": \"C_Rsvp\",\n                    \"Font_Name\": \"QuestaGrande-Regular\",\n                    \"Font_Size\": 45.41,\n                    \"Font_Color\": \"#f8e0bd\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 480,\n                    \"h\": 30.117,\n                    \"x\": 298,\n                    \"y\": 397.48,\n                    \"LblText\": \"Change_Rsvp_Name\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 28.39,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 480,\n                    \"h\": 42.919,\n                    \"x\": 298,\n                    \"y\": 711.499,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"QuestaGrande-Regular\",\n                    \"Font_Size\": 39,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 480,\n                    \"h\": 23.212,\n                    \"x\": 298,\n                    \"y\": 744.341,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Quicksand-Light\",\n                    \"Font_Size\": 21.88,\n                    \"Font_Color\": \"#fec472\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n        }\n    ]\n}\n";
    String json_6 = "{\n    \"Items\": [\n\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n\n            \"Main_Images\": [{\n                \"Name\": \"W_6_Up_Img_0\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 460,\n                    \"h\": 45.93,\n                    \"x\": 298,\n                    \"y\": 58.397,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Freehand521BT-RegularC\",\n                    \"Font_Size\": 38.28,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 460,\n                    \"h\": 62.39,\n                    \"x\": 298,\n                    \"y\": 147.52,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"Freehand521BT-RegularC\",\n                    \"Font_Size\": 52,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 460,\n                    \"h\": 62.39,\n                    \"x\": 298,\n                    \"y\": 208.155,\n                    \"LblText\": \"&\",\n                    \"Font_Name\": \"Freehand521BT-RegularC\",\n                    \"Font_Size\": 52,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 460,\n                    \"h\": 62.39,\n                    \"x\": 298,\n                    \"y\": 273.991,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"Freehand521BT-RegularC\",\n                    \"Font_Size\": 52,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 460,\n                    \"h\": 39.457,\n                    \"x\": 298,\n                    \"y\": 331.8,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 18,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_6_Up_Img_1\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 460,\n                    \"h\": 74.123,\n                    \"x\": 298,\n                    \"y\": 132.787,\n                    \"LblText\": \"Family\",\n                    \"Font_Name\": \"Freehand521BT-RegularC\",\n                    \"Font_Size\": 61.78,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 460,\n                    \"h\": 55.063,\n                    \"x\": 298,\n                    \"y\": 240.532,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"Freehand521BT-RegularC\",\n                    \"Font_Size\": 45.89,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 460,\n                    \"h\": 22.563,\n                    \"x\": 298,\n                    \"y\": 293.159,\n                    \"LblText\": \"Change_D_Of\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 20.3,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 460,\n                    \"h\": 22.563,\n                    \"x\": 298,\n                    \"y\": 316.145,\n                    \"LblText\": \"Change_Daughter_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 20.3,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 460,\n                    \"h\": 22.563,\n                    \"x\": 298,\n                    \"y\": 368.159,\n                    \"LblText\": \"Change_G_D_Of\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 20.3,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 460,\n                    \"h\": 22.563,\n                    \"x\": 298,\n                    \"y\": 391.145,\n                    \"LblText\": \"Change_Grand_Daughter_Of\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 20.3,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 460,\n                    \"h\": 55.063,\n                    \"x\": 298,\n                    \"y\": 487.387,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"Freehand521BT-RegularC\",\n                    \"Font_Size\": 45.89,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 460,\n                    \"h\": 22.563,\n                    \"x\": 298,\n                    \"y\": 538.718,\n                    \"LblText\": \"Change_S_Of\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 20.3,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 460,\n                    \"h\": 22.563,\n                    \"x\": 298,\n                    \"y\": 561.704,\n                    \"LblText\": \"Change_Son_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 20.3,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n\n                    \"id\": \"Label_9\",\n                    \"w\": 460,\n                    \"h\": 22.563,\n                    \"x\": 298,\n                    \"y\": 613.718,\n                    \"LblText\": \"Change_G_S_Of\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 20.3,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_10\",\n                    \"w\": 460,\n                    \"h\": 22.563,\n                    \"x\": 298,\n                    \"y\": 636.704,\n                    \"LblText\": \"Change_Grand_Son_Of\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 20.3,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_11\",\n                    \"w\": 460,\n                    \"h\": 52.73,\n                    \"x\": 298,\n                    \"y\": 745.262,\n                    \"LblText\": \"All are Welcome\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 45.89,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_6_Up_Img_2\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 460,\n                    \"h\": 74.389,\n                    \"x\": 298,\n                    \"y\": 150.387,\n                    \"LblText\": \"Function\",\n                    \"Font_Name\": \"Freehand521BT-RegularC\",\n                    \"Font_Size\": 62,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 460,\n                    \"h\": 62.39,\n                    \"x\": 298,\n                    \"y\": 242.604,\n                    \"LblText\": \"Change_Function_Name1\",\n                    \"Font_Name\": \"Freehand521BT-RegularC\",\n                    \"Font_Size\": 52,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 460,\n                    \"h\": 25.564,\n                    \"x\": 298,\n                    \"y\": 305.713,\n                    \"LblText\": \"Change_Function_Date_And_Time1\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 23,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 460,\n                    \"h\": 25.564,\n                    \"x\": 298,\n                    \"y\": 330.071,\n                    \"LblText\": \"Change_Function_Venue1\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 23,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 460,\n                    \"h\": 62.39,\n                    \"x\": 298,\n                    \"y\": 426.964,\n                    \"LblText\": \"Change_Function_Name2\",\n                    \"Font_Name\": \"Freehand521BT-RegularC\",\n                    \"Font_Size\": 52,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 460,\n                    \"h\": 25.564,\n                    \"x\": 298,\n                    \"y\": 490.072,\n                    \"LblText\": \"Change_Function_Date_And_Time2\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 23,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 460,\n                    \"h\": 25.564,\n                    \"x\": 298,\n                    \"y\": 515.585,\n                    \"LblText\": \"Change_Function_Venue2\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 23,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 460,\n                    \"h\": 62.39,\n                    \"x\": 298,\n                    \"y\": 610.985,\n                    \"LblText\": \"Change_Function_Name3\",\n                    \"Font_Name\": \"Freehand521BT-RegularC\",\n                    \"Font_Size\": 52,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 460,\n                    \"h\": 25.564,\n                    \"x\": 298,\n                    \"y\": 674.093,\n                    \"LblText\": \"Change_Function_Date_And_Time3\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 23,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 460,\n                    \"h\": 25.564,\n                    \"x\": 298,\n                    \"y\": 701.347,\n                    \"LblText\": \"Change_Function_Venue3\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 23,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_6_Up_Img_3\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 460,\n                    \"h\": 74.389,\n                    \"x\": 298,\n                    \"y\": 186.125,\n                    \"LblText\": \"Venue\",\n                    \"Font_Name\": \"Freehand521BT-RegularC\",\n                    \"Font_Size\": 62,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 460,\n                    \"h\": 25.564,\n                    \"x\": 298,\n                    \"y\": 257.679,\n                    \"LblText\": \"Change_Venue_3_Pagee\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 23,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 460,\n                    \"h\": 74.389,\n                    \"x\": 298,\n                    \"y\": 362.702,\n                    \"LblText\": \"C_Rsvp\",\n                    \"Font_Name\": \"Freehand521BT-RegularC\",\n                    \"Font_Size\": 62,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 460,\n                    \"h\": 25.564,\n                    \"x\": 298,\n                    \"y\": 433.255,\n                    \"LblText\": \"Change_Rsvp_Name\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 23,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 460,\n                    \"h\": 28.899,\n                    \"x\": 298,\n                    \"y\": 688.976,\n                    \"LblText\": \"SAVE THE DATE\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 26,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 460,\n                    \"h\": 25.564,\n                    \"x\": 298,\n                    \"y\": 723.291,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Andada-Regular\",\n                    \"Font_Size\": 23,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n        }\n    ]\n}\n";
    String json_7 = "{\n    \"Items\": [\n\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n\n            \"Main_Images\": [{\n                \"Name\": \"W_7_Up_Img_0\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 500,\n                    \"h\": 31.604,\n                    \"x\": 298,\n                    \"y\": 456.678,\n                    \"LblText\": \"Welcome to The Wedding Of\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 27.51,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 500,\n                    \"h\": 80.43,\n                    \"x\": 298,\n                    \"y\": 533.766,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 70,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 500,\n                    \"h\": 45.96,\n                    \"x\": 298,\n                    \"y\": 585.832,\n                    \"LblText\": \"Weds\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 500,\n                    \"h\": 80.43,\n                    \"x\": 298,\n                    \"y\": 637.098,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 70,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 500,\n                    \"h\": 45.96,\n                    \"x\": 298,\n                    \"y\": 724.067,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 500,\n                    \"h\": 45.96,\n                    \"x\": 298,\n                    \"y\": 770.124,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_7_Up_Img_1\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 500,\n                    \"h\": 91.92,\n                    \"x\": 298,\n                    \"y\": 120.503,\n                    \"LblText\": \"Family\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 80,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 500,\n                    \"h\": 74.685,\n                    \"x\": 298,\n                    \"y\": 234.529,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 65,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 500,\n                    \"h\": 29.7,\n                    \"x\": 298,\n                    \"y\": 287.251,\n                    \"LblText\": \"Change_D_Of\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 500,\n                    \"h\": 29.7,\n                    \"x\": 298,\n                    \"y\": 310.237,\n                    \"LblText\": \"Change_Daughter_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 500,\n                    \"h\": 29.7,\n                    \"x\": 298,\n                    \"y\": 362.251,\n                    \"LblText\": \"Change_G_D_Of\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 500,\n                    \"h\": 29.7,\n                    \"x\": 298,\n                    \"y\": 385.237,\n                    \"LblText\": \"Change_Grand_Daughter_Of\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 500,\n                    \"h\": 74.685,\n                    \"x\": 298,\n                    \"y\": 463.394,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 65,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 500,\n                    \"h\": 29.7,\n                    \"x\": 298,\n                    \"y\": 500.641,\n                    \"LblText\": \"Change_S_Of\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 500,\n                    \"h\": 29.7,\n                    \"x\": 298,\n                    \"y\": 543.627,\n                    \"LblText\": \"Change_Son_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n\n                    \"id\": \"Label_9\",\n                    \"w\": 500,\n                    \"h\": 29.7,\n                    \"x\": 298,\n                    \"y\": 595.641,\n                    \"LblText\": \"Change_G_S_Of\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#e1bb58\",\n\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_10\",\n                    \"w\": 500,\n                    \"h\": 29.7,\n                    \"x\": 298,\n                    \"y\": 618.627,\n                    \"LblText\": \"Change_Grand_Son_Of\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_11\",\n                    \"w\": 500,\n                    \"h\": 51.705,\n                    \"x\": 298,\n                    \"y\": 714.929,\n                    \"LblText\": \"All are Welcome\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 45,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_7_Up_Img_2\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 500,\n                    \"h\": 80.43,\n                    \"x\": 298,\n                    \"y\": 143.686,\n                    \"LblText\": \"Function\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 70,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 500,\n                    \"h\": 57.45,\n                    \"x\": 298,\n                    \"y\": 244.197,\n                    \"LblText\": \"Change_Function_Name1\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 500,\n                    \"h\": 29.7,\n                    \"x\": 298,\n                    \"y\": 305.149,\n                    \"LblText\": \"Change_Function_Date_And_Time1\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 500,\n                    \"h\": 29.7,\n                    \"x\": 298,\n                    \"y\": 329.621,\n                    \"LblText\": \"Change_Function_Venue1\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 500,\n                    \"h\": 57.45,\n                    \"x\": 298,\n                    \"y\": 415.773,\n                    \"LblText\": \"Change_Function_Name2\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 500,\n                    \"h\": 29.7,\n                    \"x\": 298,\n                    \"y\": 477.037,\n                    \"LblText\": \"Change_Function_Date_And_Time2\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 500,\n                    \"h\": 29.7,\n                    \"x\": 298,\n                    \"y\": 501.508,\n                    \"LblText\": \"Change_Function_Venue2\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 500,\n                    \"h\": 57.45,\n                    \"x\": 298,\n                    \"y\": 579.596,\n                    \"LblText\": \"Change_Function_Name3\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 500,\n                    \"h\": 29.7,\n                    \"x\": 298,\n                    \"y\": 637.238,\n                    \"LblText\": \"Change_Function_Date_And_Time3\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 500,\n                    \"h\": 29.7,\n                    \"x\": 298,\n                    \"y\": 661.709,\n                    \"LblText\": \"Change_Function_Venue3\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_7_Up_Img_3\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 500,\n                    \"h\": 80.43,\n                    \"x\": 298,\n                    \"y\": 188.74,\n                    \"LblText\": \"Venue\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 70,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 500,\n                    \"h\": 29.7,\n                    \"x\": 298,\n                    \"y\": 240.898,\n                    \"LblText\": \"Change_Venue_3_Page\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 500,\n                    \"h\": 80.43,\n                    \"x\": 298,\n                    \"y\": 348.683,\n                    \"LblText\": \"C_Rsvp\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 70,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 500,\n                    \"h\": 29.7,\n                    \"x\": 298,\n                    \"y\": 400.841,\n                    \"LblText\": \"Change_Rsvp_Name\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 500,\n                    \"h\": 57.45,\n                    \"x\": 298,\n                    \"y\": 635.771,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 500,\n                    \"h\": 35.641,\n                    \"x\": 298,\n                    \"y\": 692.805,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 30,\n                    \"Font_Color\": \"#e1bb58\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n        }\n    ]\n}\n";
    String json_8 = "{\n    \"Items\": [\n\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n\n            \"Main_Images\": [{\n                \"Name\": \"W_8_Up_Img_0\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 400,\n                    \"h\": 75.631,\n                    \"x\": 298,\n                    \"y\": 201.544,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 77.49,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 400,\n                    \"h\": 39.039,\n                    \"x\": 298,\n                    \"y\": 266.563,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 400,\n                    \"h\": 58.56,\n                    \"x\": 298,\n                    \"y\": 326.772,\n                    \"LblText\": \"the\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 400,\n                    \"h\": 58.56,\n                    \"x\": 298,\n                    \"y\": 401.308,\n                    \"LblText\": \"Wedding\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 400,\n                    \"h\": 58.559,\n                    \"x\": 298,\n                    \"y\": 472.801,\n                    \"LblText\": \"of\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 400,\n                    \"h\": 78.079,\n                    \"x\": 298,\n                    \"y\": 552.433,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 80,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n\n\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 400,\n                    \"h\": 78.079,\n                    \"x\": 298,\n                    \"y\": 615.44,\n                    \"LblText\": \"&\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 80,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 400,\n                    \"h\": 78.32,\n                    \"x\": 298,\n                    \"y\": 678.098,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 80,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_8_Up_Img_1\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 400,\n                    \"h\": 77.581,\n                    \"x\": 298,\n                    \"y\": 176.991,\n                    \"LblText\": \"Family\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 79.49,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 400,\n                    \"h\": 63.439,\n                    \"x\": 298,\n                    \"y\": 264.129,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 65,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 400,\n                    \"h\": 23.923,\n                    \"x\": 298,\n                    \"y\": 311.052,\n                    \"LblText\": \"Change_D_Of\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 20.14,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 400,\n                    \"h\": 23.923,\n                    \"x\": 298,\n                    \"y\": 334.038,\n                    \"LblText\": \"Change_Daughter_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 20.14,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 400,\n                    \"h\": 23.923,\n                    \"x\": 298,\n                    \"y\": 369.043,\n                    \"LblText\": \"Change_G_D_Of\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 20.14,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 400,\n                    \"h\": 23.923,\n                    \"x\": 298,\n                    \"y\": 392.03,\n                    \"LblText\": \"Change_Grand_Daughter_Of\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 20.14,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 400,\n                    \"h\": 63.636,\n                    \"x\": 298,\n                    \"y\": 475.888,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 65,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 400,\n                    \"h\": 23.923,\n                    \"x\": 298,\n                    \"y\": 521.764,\n                    \"LblText\": \"Change_S_Of\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 20.14,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 400,\n                    \"h\": 23.923,\n                    \"x\": 298,\n                    \"y\": 539.081,\n                    \"LblText\": \"Change_Son_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 20.14,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 400,\n                    \"h\": 23.923,\n                    \"x\": 298,\n                    \"y\": 579.756,\n                    \"LblText\": \"Change_G_S_Of\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 20.14,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_10\",\n                    \"w\": 400,\n                    \"h\": 23.923,\n                    \"x\": 298,\n                    \"y\": 602.743,\n                    \"LblText\": \"Change_Grand_Son_Of\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 20.14,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_11\",\n                    \"w\": 400,\n                    \"h\": 43.92,\n                    \"x\": 298,\n                    \"y\": 684.504,\n                    \"LblText\": \"All Are Welcome\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 45,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_8_Up_Img_2\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 400,\n                    \"h\": 78.08,\n                    \"x\": 298,\n                    \"y\": 202.2,\n                    \"LblText\": \"Function\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 80,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 400,\n                    \"h\": 58.56,\n                    \"x\": 298,\n                    \"y\": 293.016,\n                    \"LblText\": \"Change_Function_Name1\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 400,\n                    \"h\": 25.725,\n                    \"x\": 298,\n                    \"y\": 328.463,\n                    \"LblText\": \"Change_Function_Date_And_Time1\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 21.65,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 400,\n                    \"h\": 25.725,\n                    \"x\": 298,\n                    \"y\": 352.935,\n                    \"LblText\": \"Change_Function_Venue1\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 21.65,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 400,\n                    \"h\": 58.56,\n                    \"x\": 298,\n                    \"y\": 425.728,\n                    \"LblText\": \"Change_Function_Name2\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 400,\n                    \"h\": 25.725,\n                    \"x\": 298,\n                    \"y\": 462.328,\n                    \"LblText\": \"Change_Function_Date_And_Time2\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 21.65,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 400,\n                    \"h\": 25.725,\n                    \"x\": 298,\n                    \"y\": 486.8,\n                    \"LblText\": \"Change_Function_Venue2\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 21.65,\n                    \"Font_Color\": \"#ffffff\",\n\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 400,\n                    \"h\": 58.56,\n                    \"x\": 298,\n                    \"y\": 562.183,\n                    \"LblText\": \"Change_Function_Name3\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 400,\n                    \"h\": 25.725,\n                    \"x\": 298,\n                    \"y\": 603.011,\n                    \"LblText\": \"Change_Function_Date_And_Time3\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 21.65,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 400,\n                    \"h\": 25.725,\n                    \"x\": 298,\n                    \"y\": 627.482,\n                    \"LblText\": \"Change_Function_Venue3\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 21.65,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_8_Up_Img_3\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 400,\n                    \"h\": 72.38,\n                    \"x\": 298,\n                    \"y\": 233.643,\n                    \"LblText\": \"Venue\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 70,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 400,\n                    \"h\": 29.786,\n                    \"x\": 298,\n                    \"y\": 280.359,\n                    \"LblText\": \"Change_Venue_3_Page\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25.07,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 400,\n                    \"h\": 68.319,\n                    \"x\": 298,\n                    \"y\": 381.443,\n                    \"LblText\": \"C_Rsvp\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 70,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 400,\n                    \"h\": 29.786,\n                    \"x\": 298,\n                    \"y\": 426.128,\n                    \"LblText\": \"Change_Rsvp_Name\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 25.07,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 400,\n                    \"h\": 61.178,\n                    \"x\": 298,\n                    \"y\": 616.704,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Cookie\",\n                    \"Font_Size\": 62.68,\n                    \"Font_Color\": \"#b5a265\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 400,\n                    \"h\": 35.641,\n                    \"x\": 298,\n                    \"y\": 675.178,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Minion\",\n                    \"Font_Size\": 30,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n        }\n    ]\n}\n";
    String json_9 = "{\n    \"Items\": [\n\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n\n            \"Main_Images\": [{\n                \"Name\": \"W_9_Up_Img_0\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 388,\n                    \"h\": 45.96,\n                    \"x\": 298,\n                    \"y\": 39.426,\n                    \"LblText\": \"Invitation Card\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#7e8a37\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 388,\n                    \"h\": 57.45,\n                    \"x\": 298,\n                    \"y\": 107.471,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#f3806c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 388,\n                    \"h\": 57.45,\n                    \"x\": 298,\n                    \"y\": 169.025,\n                    \"LblText\": \"&\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#f3806c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 388,\n                    \"h\": 57.45,\n                    \"x\": 298,\n                    \"y\": 230.578,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#f3806c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 388,\n                    \"h\": 29.519,\n                    \"x\": 298,\n                    \"y\": 785.935,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 27.11,\n                    \"Font_Color\": \"#f3806c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 388,\n                    \"h\": 18.165,\n                    \"x\": 298,\n                    \"y\": 821.003,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#f3806c\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_9_Up_Img_1\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 510,\n                    \"h\": 57.45,\n                    \"x\": 298,\n                    \"y\": 193.44,\n                    \"LblText\": \"Family\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#7e8a37\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 510,\n                    \"h\": 57.45,\n                    \"x\": 298,\n                    \"y\": 274.253,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#f3806c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 510,\n                    \"h\": 18.165,\n                    \"x\": 298,\n                    \"y\": 315.536,\n                    \"LblText\": \"Change_D_Of\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 510,\n                    \"h\": 18.165,\n                    \"x\": 298,\n                    \"y\": 338.521,\n                    \"LblText\": \"Change_Daughter_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 510,\n                    \"h\": 18.165,\n                    \"x\": 298,\n                    \"y\": 390.536,\n                    \"LblText\": \"Change_G_D_Of\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 510,\n                    \"h\": 18.166,\n                    \"x\": 298,\n                    \"y\": 413.522,\n                    \"LblText\": \"Change_Grand_Daughter_Of\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 510,\n                    \"h\": 57.45,\n                    \"x\": 298,\n                    \"y\": 493.371,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#f3806c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 510,\n                    \"h\": 18.165,\n                    \"x\": 298,\n                    \"y\": 532.616,\n                    \"LblText\": \"Change_S_Of\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 510,\n                    \"h\": 18.165,\n                    \"x\": 298,\n                    \"y\": 555.601,\n                    \"LblText\": \"Change_Son_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n\n                    \"id\": \"Label_9\",\n                    \"w\": 510,\n                    \"h\": 18.165,\n                    \"x\": 298,\n                    \"y\": 607.616,\n                    \"LblText\": \"Change_G_S_Of\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_10\",\n                    \"w\": 510,\n                    \"h\": 18.165,\n                    \"x\": 298,\n                    \"y\": 630.601,\n                    \"LblText\": \"Change_Grand_Son_Of\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_9_Up_Img_2\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 510,\n                    \"h\": 68.94,\n                    \"x\": 298,\n                    \"y\": 172.273,\n                    \"LblText\": \"Function\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#7e8a37\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 510,\n                    \"h\": 57.45,\n                    \"x\": 298,\n                    \"y\": 267.349,\n                    \"LblText\": \"Change_Function_Name1\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#f3806c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 510,\n                    \"h\": 18.166,\n                    \"x\": 298,\n                    \"y\": 312.27,\n                    \"LblText\": \"Change_Function_Date_And_Time1\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 510,\n                    \"h\": 18.165,\n                    \"x\": 298,\n                    \"y\": 336.742,\n                    \"LblText\": \"Change_Function_Venue1\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 510,\n                    \"h\": 57.45,\n                    \"x\": 298,\n                    \"y\": 411.125,\n                    \"LblText\": \"Change_Function_Name2\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#f3806c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 510,\n                    \"h\": 18.166,\n                    \"x\": 298,\n                    \"y\": 456.2,\n                    \"LblText\": \"Change_Function_Date_And_Time2\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 510,\n                    \"h\": 18.165,\n                    \"x\": 298,\n                    \"y\": 480.671,\n                    \"LblText\": \"Change_Function_Venue2\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 510,\n                    \"h\": 57.449,\n                    \"x\": 298,\n                    \"y\": 554.9,\n                    \"LblText\": \"Change_Function_Name3\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#f3806c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 510,\n                    \"h\": 18.165,\n                    \"x\": 298,\n                    \"y\": 598.651,\n                    \"LblText\": \"Change_Function_Date_And_Time3\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 510,\n                    \"h\": 18.165,\n                    \"x\": 298,\n                    \"y\": 623.122,\n                    \"LblText\": \"Change_Function_Venue3\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_9_Up_Img_3\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 510,\n                    \"h\": 68.94,\n                    \"x\": 298,\n                    \"y\": 209.739,\n                    \"LblText\": \"Venue\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#7e8a37\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 510,\n                    \"h\": 18.165,\n                    \"x\": 298,\n                    \"y\": 259.83,\n                    \"LblText\": \"Change_Venue_3_Page\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 510,\n                    \"h\": 68.94,\n                    \"x\": 298,\n                    \"y\": 369.681,\n                    \"LblText\": \"C_Rsvp\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#7e8a37\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 510,\n                    \"h\": 18.165,\n                    \"x\": 298,\n                    \"y\": 419.773,\n                    \"LblText\": \"Change_Rsvp_Name\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 16.68,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 510,\n                    \"h\": 57.45,\n                    \"x\": 298,\n                    \"y\": 563.321,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Playball\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#f3806c\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 510,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 623.145,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#000000\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n        }\n    ]\n}\n";
    String json_10 = "{\n    \"Items\": [\n\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n\n            \"Main_Images\": [{\n                \"Name\": \"W_10_Up_Img_0\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 440,\n                    \"h\": 26.575,\n                    \"x\": 298,\n                    \"y\": 174.134,\n                    \"LblText\": \"Invitation Card\",\n                    \"Font_Name\": \"Acre-Medium\",\n                    \"Font_Size\": 25,\n                    \"Font_Color\": \"#fdc272\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 440,\n                    \"h\": 93.76,\n                    \"x\": 298,\n                    \"y\": 279.238,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"Nickainley-Normal\",\n                    \"Font_Size\": 80,\n                    \"Font_Color\": \"#fafbfc\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 440,\n                    \"h\": 55.813,\n                    \"x\": 298,\n                    \"y\": 346.592,\n                    \"LblText\": \"Weds\",\n                    \"Font_Name\": \"Nickainley-Normal\",\n                    \"Font_Size\": 47,\n                    \"Font_Color\": \"#fdc272\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 440,\n                    \"h\": 93.76,\n                    \"x\": 298,\n                    \"y\": 408.296,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"Nickainley-Normal\",\n                    \"Font_Size\": 80,\n                    \"Font_Color\": \"#fafbfc\",\n                    \"Font_Rotation\": 0\n\n                },\n\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 440,\n                    \"h\": 69.26,\n                    \"x\": 298,\n                    \"y\": 524.05,\n                    \"LblText\": \"REQUEST THE HONOR OF YOUR PRESENCE AT THEIR MARRIAGE \",\n                    \"Font_Name\": \"Acre-Medium\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#fdc272\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 440,\n                    \"h\": 35.364,\n                    \"x\": 298,\n                    \"y\": 638.257,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Acre-Medium\",\n                    \"Font_Size\": 33.27,\n                    \"Font_Color\": \"#fdc272\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 440,\n                    \"h\": 29.764,\n                    \"x\": 298,\n                    \"y\": 671.819,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Acre-Medium\",\n                    \"Font_Size\": 28,\n                    \"Font_Color\": \"#fdc272\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_10_Up_Img_1\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 440,\n                    \"h\": 53.149,\n                    \"x\": 298,\n                    \"y\": 168.223,\n                    \"LblText\": \"Family\",\n                    \"Font_Name\": \"Acre-Medium\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#fdc272\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 440,\n                    \"h\": 70.32,\n                    \"x\": 298,\n                    \"y\": 243.365,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"Nickainley-Normal\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#fafbfc\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 440,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 293.53,\n                    \"LblText\": \"Change_D_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 440,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 316.516,\n                    \"LblText\":\"Change_Daughter_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 440,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 358.53,\n                    \"LblText\": \"Change_G_D_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 440,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 381.516,\n                    \"LblText\": \"Change_Grand_Daughter_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 440,\n                    \"h\": 70.32,\n                    \"x\": 298,\n                    \"y\": 472.23,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"Nickainley-Normal\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#fafbfc\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 440,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 526.92,\n                    \"LblText\": \"Change_S_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 440,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 549.906,\n                    \"LblText\": \"Change_Son_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n\n                    \"id\": \"Label_9\",\n                    \"w\": 440,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 591.92,\n                    \"LblText\": \"Change_G_S_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_10\",\n                    \"w\": 440,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 614.906,\n                    \"LblText\": \"Change_Grand_Son_Of\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_11\",\n                    \"w\": 440,\n                    \"h\": 29.764,\n                    \"x\": 298,\n                    \"y\": 664.61,\n                    \"LblText\": \"All Are Welcome\",\n                    \"Font_Name\": \"Acre-Medium\",\n                    \"Font_Size\": 28,\n                    \"Font_Color\": \"#fdc272\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_10_Up_Img_2\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 440,\n                    \"h\": 53.149,\n                    \"x\": 298,\n                    \"y\": 202.244,\n                    \"LblText\": \"Function\",\n                    \"Font_Name\": \"Acre-Medium\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#fdc272\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 440,\n                    \"h\": 64.46,\n                    \"x\": 298,\n                    \"y\": 305.227,\n                    \"LblText\": \"Change_Function_Name1\",\n                    \"Font_Name\": \"Nickainley-Normal\",\n                    \"Font_Size\": 55,\n                    \"Font_Color\": \"#fafbfc\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 440,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 350.588,\n                    \"LblText\": \"Change_Function_Date_And_Time1\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 440,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 375.06,\n                    \"LblText\": \"Change_Function_Venue1\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 440,\n                    \"h\": 64.46,\n                    \"x\": 298,\n                    \"y\": 450.971,\n                    \"LblText\": \"Change_Function_Name2\",\n                    \"Font_Name\": \"Nickainley-Normal\",\n                    \"Font_Size\": 55,\n                    \"Font_Color\": \"#fafbfc\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 440,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 491.504,\n                    \"LblText\": \"Change_Function_Date_And_Time2\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 440,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 515.976,\n                    \"LblText\": \"Change_Function_Venue2\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 440,\n                    \"h\": 64.46,\n                    \"x\": 298,\n                    \"y\": 596.714,\n                    \"LblText\": \"Change_Function_Name3\",\n                    \"Font_Name\": \"Nickainley-Normal\",\n                    \"Font_Size\": 55,\n                    \"Font_Color\": \"#fafbfc\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 440,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 638.377,\n                    \"LblText\": \"Change_Function_Date_And_Time3\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 440,\n                    \"h\": 19.021,\n                    \"x\": 298,\n                    \"y\": 662.849,\n                    \"LblText\": \"Change_Function_Venue3\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 17.11,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_10_Up_Img_3\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 440,\n                    \"h\": 70.32,\n                    \"x\": 298,\n                    \"y\": 189.696,\n                    \"LblText\": \"Venue\",\n                    \"Font_Name\": \"Nickainley-Normal\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#fafbfc\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 440,\n                    \"h\": 22.23,\n                    \"x\": 298,\n                    \"y\": 241.338,\n                    \"LblText\": \"Change_Venue_3_Page\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 440,\n                    \"h\": 70.32,\n                    \"x\": 298,\n                    \"y\": 343.969,\n                    \"LblText\": \"C_Rsvp\",\n                    \"Font_Name\": \"Nickainley-Normal\",\n                    \"Font_Size\": 60,\n                    \"Font_Color\": \"#fafbfc\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 440,\n                    \"h\": 22.23,\n                    \"x\": 298,\n                    \"y\": 395.611,\n                    \"LblText\": \"Change_Rsvp_Name\",\n                    \"Font_Name\": \"Alegreya-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#f3e5ca\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 440,\n                    \"h\": 70.32,\n                    \"x\": 298,\n                    \"y\": 578.001,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Nickainley-Normal\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#fafbfc\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 440,\n                    \"h\": 29.764,\n                    \"x\": 298,\n                    \"y\": 656.31,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Acre-Medium\",\n                    \"Font_Size\": 28,\n                    \"Font_Color\": \"#fdc272\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n        }\n    ]\n}\n";
    String json_11 = "{\n    \"Items\": [\n\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n\n            \"Main_Images\": [{\n                \"Name\": \"W_11_Up_Img_0\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 480,\n                    \"h\": 47.644,\n                    \"x\": 298,\n                    \"y\": 225.75,\n                    \"LblText\": \"|| Shree Ganesh ||\",\n                    \"Font_Name\": \"SamarkanNormal\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 480,\n                    \"h\": 111.059,\n                    \"x\": 298,\n                    \"y\": 370.789,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 85.23,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 480,\n                    \"h\": 65.149,\n                    \"x\": 298,\n                    \"y\": 474.173,\n                    \"LblText\": \"Weds\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 480,\n                    \"h\": 111.059,\n                    \"x\": 298,\n                    \"y\": 577.558,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 85.23,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 480,\n                    \"h\": 33.87,\n                    \"x\": 298,\n                    \"y\": 704.422,\n                    \"LblText\": \"Save The Date\",\n                    \"Font_Name\": \"Cinzel-Bold\",\n                    \"Font_Size\": 30,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 480,\n                    \"h\": 33.87,\n                    \"x\": 298,\n                    \"y\": 752.539,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"Cinzel-Bold\",\n                    \"Font_Size\": 30,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_11_Up_Img_1\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 480,\n                    \"h\": 56.45,\n                    \"x\": 298,\n                    \"y\": 117.609,\n                    \"LblText\": \"Family\",\n                    \"Font_Name\": \"Cinzel-Bold\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 480,\n                    \"h\": 84.694,\n                    \"x\": 298,\n                    \"y\": 225.427,\n                    \"LblText\": \"Change_Girl_Name\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 65,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 480,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 280.254,\n                    \"LblText\": \"Change_D_Of\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 480,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 303.24,\n                    \"LblText\": \"Change_Daughter_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 480,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 355.254,\n                    \"LblText\": \"Change_G_D_Of\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 480,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 378.24,\n                    \"LblText\": \"Change_Grand_Daughter_Of\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 480,\n                    \"h\": 84.694,\n                    \"x\": 298,\n                    \"y\": 466.292,\n                    \"LblText\": \"Change_Boy_Name\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 65,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 480,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 521.643,\n                    \"LblText\": \"Change_S_Of\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 480,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 544.629,\n                    \"LblText\": \"Change_Son_Of_Father_Mother_Name\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n\n                    \"id\": \"Label_9\",\n                    \"w\": 480,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 596.643,\n                    \"LblText\": \"Change_G_S_Of\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_10\",\n                    \"w\": 480,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 619.629,\n                    \"LblText\": \"Change_Grand_Son_Of\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_11\",\n                    \"w\": 480,\n                    \"h\": 33.87,\n                    \"x\": 298,\n                    \"y\": 732.59,\n                    \"LblText\": \"All Are Welcome\",\n                    \"Font_Name\": \"Cinzel-Bold\",\n                    \"Font_Size\": 30,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_11_Up_Img_2\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 480,\n                    \"h\": 56.45,\n                    \"x\": 298,\n                    \"y\": 143.131,\n                    \"LblText\": \"Function\",\n                    \"Font_Name\": \"Cinzel-Bold\",\n                    \"Font_Size\": 50,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 480,\n                    \"h\": 84.694,\n                    \"x\": 298,\n                    \"y\": 263.229,\n                    \"LblText\": \"Change_Function_Name1\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 65,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 480,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 319.693,\n                    \"LblText\": \"Change_Function_Date_And_Time1\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 480,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 344.165,\n                    \"LblText\": \"Change_Function_Venue1\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 480,\n                    \"h\": 84.695,\n                    \"x\": 298,\n                    \"y\": 427.004,\n                    \"LblText\": \"Change_Function_Name2\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 65,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 480,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 488.623,\n                    \"LblText\": \"Change_Function_Date_And_Time2\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_6\",\n                    \"w\": 480,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 513.094,\n                    \"LblText\": \"Change_Function_Venue2\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n\n                {\n                    \"id\": \"Label_7\",\n                    \"w\": 480,\n                    \"h\": 84.694,\n                    \"x\": 298,\n                    \"y\": 593.357,\n                    \"LblText\": \"Change_Function_Name3\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 65,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_8\",\n                    \"w\": 480,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 650.298,\n                    \"LblText\": \"Change_Function_Date_And_Time3\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_9\",\n                    \"w\": 480,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 674.77,\n                    \"LblText\": \"Change_Function_Venue3\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                }\n\n\n            ]\n\n        },\n        {\n            \"User_Images\": [{\n                \"id\": \"image_0\",\n                \"w\": 596,\n                \"h\": 842,\n                \"x\": 298,\n                \"y\": 421,\n                \"Is_Round\": \"NO\"\n            }],\n\n            \"Main_Images\": [{\n                \"Name\": \"W_11_Up_Img_3\"\n            }],\n\n\n            \"Labels\": [{\n                    \"id\": \"Label_0\",\n                    \"w\": 480,\n                    \"h\": 47.644,\n                    \"x\": 298,\n                    \"y\": 213.271,\n                    \"LblText\": \"|| Shree Ganesh ||\",\n                    \"Font_Name\": \"SamarkanNormal\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_0\",\n                    \"w\": 480,\n                    \"h\": 84.695,\n                    \"x\": 298,\n                    \"y\": 313.772,\n                    \"LblText\": \"Venue\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 65,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_1\",\n                    \"w\": 480,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 368.662,\n                    \"LblText\": \"Change_Venue_3_Page\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_2\",\n                    \"w\": 480,\n                    \"h\": 84.695,\n                    \"x\": 298,\n                    \"y\": 471.714,\n                    \"LblText\": \"C_Rsvp\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 65,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_3\",\n                    \"w\": 480,\n                    \"h\": 21.78,\n                    \"x\": 298,\n                    \"y\": 528.604,\n                    \"LblText\": \"Change_Rsvp_Name\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 20,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_4\",\n                    \"w\": 480,\n                    \"h\": 84.695,\n                    \"x\": 298,\n                    \"y\": 648.073,\n                    \"LblText\": \"Change_Save_The_Date\",\n                    \"Font_Name\": \"GreatVibes-Regular\",\n                    \"Font_Size\": 45,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                },\n                {\n                    \"id\": \"Label_5\",\n                    \"w\": 480,\n                    \"h\": 43.56,\n                    \"x\": 298,\n                    \"y\": 729.528,\n                    \"LblText\": \"SAVE THE DATE\",\n                    \"Font_Name\": \"Cinzel-Regular\",\n                    \"Font_Size\": 40,\n                    \"Font_Color\": \"#ffffff\",\n                    \"Font_Rotation\": 0\n\n                }\n\n            ]\n\n        }\n    ]\n}\n";
    String[] label0_0 = new String[7];
    double[] label0_0_w = new double[7];
    double[] label0_0_h = new double[7];
    double[] label0_0_x = new double[7];
    double[] label0_0_y = new double[7];
    String[] label0_0_Text = new String[7];
    String[] label0_0_Font_name = new String[7];
    double[] label0_0_font_size = new double[7];
    String[] label0_0_font_color = new String[7];
    String[] label0_1 = new String[12];
    double[] label0_1_w = new double[12];
    double[] label0_1_h = new double[12];
    double[] label0_1_x = new double[12];
    double[] label0_1_y = new double[12];
    String[] label0_1_Text = new String[12];
    String[] label0_1_Font_name = new String[12];
    double[] label0_1_font_size = new double[12];
    String[] label0_1_font_color = new String[12];
    String[] label0_2 = new String[10];
    double[] label0_2_w = new double[10];
    double[] label0_2_h = new double[10];
    double[] label0_2_x = new double[10];
    double[] label0_2_y = new double[10];
    String[] label0_2_Text = new String[10];
    String[] label0_2_Font_name = new String[10];
    double[] label0_2_font_size = new double[10];
    String[] label0_2_font_color = new String[10];
    String[] label0_3 = new String[7];
    double[] label0_3_w = new double[7];
    double[] label0_3_h = new double[7];
    double[] label0_3_x = new double[7];
    double[] label0_3_y = new double[7];
    String[] label0_3_Text = new String[7];
    String[] label0_3_Font_name = new String[7];
    double[] label0_3_font_size = new double[7];
    String[] label0_3_font_color = new String[7];
    String[] label1_0_Text = new String[7];
    String[] label1_0_Font_name = new String[7];
    String[] label1_0_font_color = new String[7];
    String[] label1_1_Text = new String[12];
    String[] label1_1_Font_name = new String[12];
    String[] label1_1_font_color = new String[12];
    String[] label1_2_Text = new String[10];
    String[] label1_2_Font_name = new String[10];
    String[] label1_2_font_color = new String[10];
    String[] label1_3_Text = new String[6];
    String[] label1_3_Font_name = new String[6];
    String[] label1_3_font_color = new String[6];
    String[] label2_0_Text = new String[5];
    String[] label2_0_Font_name = new String[5];
    String[] label2_0_font_color = new String[5];
    String[] label2_1_Text = new String[12];
    String[] label2_1_Font_name = new String[12];
    String[] label2_1_font_color = new String[12];
    String[] label2_2_Text = new String[10];
    String[] label2_2_Font_name = new String[10];
    String[] label2_2_font_color = new String[10];
    String[] label2_3_Text = new String[7];
    String[] label2_3_Font_name = new String[7];
    String[] label2_3_font_color = new String[7];
    String[] label3_0_Text = new String[5];
    String[] label3_0_Font_name = new String[5];
    String[] label3_0_font_color = new String[5];
    String[] label3_1_Text = new String[12];
    String[] label3_1_Font_name = new String[12];
    String[] label3_1_font_color = new String[12];
    String[] label3_2_Text = new String[10];
    String[] label3_2_Font_name = new String[10];
    String[] label3_2_font_color = new String[10];
    String[] label3_3_Text = new String[6];
    String[] label3_3_Font_name = new String[6];
    String[] label3_3_font_color = new String[6];
    String[] label4_0_Text = new String[6];
    String[] label4_0_Font_name = new String[6];
    String[] label4_0_font_color = new String[6];
    String[] label4_1_Text = new String[12];
    String[] label4_1_Font_name = new String[12];
    String[] label4_1_font_color = new String[12];
    String[] label4_2_Text = new String[10];
    String[] label4_2_Font_name = new String[10];
    String[] label4_2_font_color = new String[10];
    String[] label4_3_Text = new String[6];
    String[] label4_3_Font_name = new String[6];
    String[] label4_3_font_color = new String[6];
    String[] label5_0_Text = new String[7];
    String[] label5_0_Font_name = new String[7];
    String[] label5_0_font_color = new String[7];
    String[] label5_1_Text = new String[12];
    String[] label5_1_Font_name = new String[12];
    String[] label5_1_font_color = new String[12];
    String[] label5_2_Text = new String[10];
    String[] label5_2_Font_name = new String[10];
    String[] label5_2_font_color = new String[10];
    String[] label5_3_Text = new String[6];
    String[] label5_3_Font_name = new String[6];
    String[] label5_3_font_color = new String[6];
    String[] label6_0_Text = new String[5];
    String[] label6_0_Font_name = new String[5];
    String[] label6_0_font_color = new String[5];
    String[] label6_1_Text = new String[12];
    String[] label6_1_Font_name = new String[12];
    String[] label6_1_font_color = new String[12];
    String[] label6_2_Text = new String[10];
    String[] label6_2_Font_name = new String[10];
    String[] label6_2_font_color = new String[10];
    String[] label6_3_Text = new String[6];
    String[] label6_3_Font_name = new String[6];
    String[] label6_3_font_color = new String[6];
    String[] label7_0_Text = new String[6];
    String[] label7_0_Font_name = new String[6];
    String[] label7_0_font_color = new String[6];
    String[] label7_1_Text = new String[12];
    String[] label7_1_Font_name = new String[12];
    String[] label7_1_font_color = new String[12];
    String[] label7_2_Text = new String[10];
    String[] label7_2_Font_name = new String[10];
    String[] label7_2_font_color = new String[10];
    String[] label7_3_Text = new String[6];
    String[] label7_3_Font_name = new String[6];
    String[] label7_3_font_color = new String[6];
    String[] label8_0_Text = new String[8];
    String[] label8_0_Font_name = new String[8];
    String[] label8_0_font_color = new String[8];
    String[] label8_1_Text = new String[12];
    String[] label8_1_Font_name = new String[12];
    String[] label8_1_font_color = new String[12];
    String[] label8_2_Text = new String[10];
    String[] label8_2_Font_name = new String[10];
    String[] label8_2_font_color = new String[10];
    String[] label8_3_Text = new String[6];
    String[] label8_3_Font_name = new String[6];
    String[] label8_3_font_color = new String[6];
    String[] label9_0_Text = new String[6];
    String[] label9_0_Font_name = new String[6];
    String[] label9_0_font_color = new String[6];
    String[] label9_1_Text = new String[11];
    String[] label9_1_Font_name = new String[11];
    String[] label9_1_font_color = new String[11];
    String[] label9_2_Text = new String[10];
    String[] label9_2_Font_name = new String[10];
    String[] label9_2_font_color = new String[10];
    String[] label9_3_Text = new String[6];
    String[] label9_3_Font_name = new String[6];
    String[] label9_3_font_color = new String[6];
    String[] label10_0_Text = new String[7];
    String[] label10_0_Font_name = new String[7];
    String[] label10_0_font_color = new String[7];
    String[] label10_1_Text = new String[12];
    String[] label10_1_Font_name = new String[12];
    String[] label10_1_font_color = new String[12];
    String[] label10_2_Text = new String[10];
    String[] label10_2_Font_name = new String[10];
    String[] label10_2_font_color = new String[10];
    String[] label10_3_Text = new String[6];
    String[] label10_3_Font_name = new String[6];
    String[] label10_3_font_color = new String[6];
    String[] label11_0_Text = new String[6];
    String[] label11_0_Font_name = new String[6];
    String[] label11_0_font_color = new String[6];
    String[] label11_1_Text = new String[12];
    String[] label11_1_Font_name = new String[12];
    String[] label11_1_font_color = new String[12];
    String[] label11_2_Text = new String[10];
    String[] label11_2_Font_name = new String[10];
    String[] label11_2_font_color = new String[10];
    String[] label11_3_Text = new String[7];
    String[] label11_3_Font_name = new String[7];
    String[] label11_3_font_color = new String[7];
    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() { 
        @Override 
        public void onPageScrollStateChanged(int i) {
        }

        @Override 
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override 
        public void onPageSelected(int i) {
            PreviewActivity.this.addBottomDots(i);
            if (i == PreviewActivity.this.layouts.length - 1) {
                PreviewActivity.this.btnNext.setText(PreviewActivity.this.getString(R.string.start));
                PreviewActivity.this.btnSkip.setVisibility(View.GONE);
                return;
            }
            PreviewActivity.this.btnNext.setText(PreviewActivity.this.getString(R.string.next));
            PreviewActivity.this.btnSkip.setVisibility(View.VISIBLE);
        }
    };

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override 
    
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        JSONException jSONException;
        String str5;
        String str6;
        String str7 = "Name";
        String str8 = "Main_Images";
        String str9 = "Labels";
        String str10 = "Items";
        super.onCreate(bundle);
        setContentView(R.layout.activity_preview);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.FullscreenAd_Counter(this);


   
        initToolbar(R.color.color_groomform, R.drawable.bluebar);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        this.display1 = defaultDisplay;
        this.width = defaultDisplay.getWidth();
        this.height = this.display1.getHeight();
        PrefManager prefManager = new PrefManager(this);
        this.prefManager = prefManager;
        if (!prefManager.isFirstTimeLaunch()) {
            launchHomeScreen();
            finish();
        }
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        this.viewPager = viewPager;
        viewPager.setOffscreenPageLimit(4);
        this.dotsLayout = (LinearLayout) findViewById(R.id.layoutDots);
        this.btnSkip = (Button) findViewById(R.id.btn_skip);
        this.btnNext = (Button) findViewById(R.id.btn_next);
        int i = 0;
        this.position = getIntent().getIntExtra("position", 0);
        Bundle extras = getIntent().getExtras();
        this.p_getrelation = extras.getString("relation");
        this.p_getgrandrelation = extras.getString("grandrelation");
        this.p_getsecondrelation = extras.getString("secondrelation");
        this.p_getsecondgrandrelation = extras.getString("secondgrandrelation");
        this.p_getfunctionname1 = extras.getString("getfunctionname1");
        this.p_getdate1 = extras.getString("getdate1");
        this.p_gettime1 = extras.getString("gettime1");
        this.p_getvenue1 = extras.getString("getvenue1");
        this.p_getfunctionname2 = extras.getString("getfunctionname2");
        this.p_getdate2 = extras.getString("getdate2");
        this.p_gettime2 = extras.getString("gettime2");
        this.p_getvenue2 = extras.getString("getvenue2");
        this.p_getfunctionname3 = extras.getString("getfunctionname3");
        this.p_getdate3 = extras.getString("getdate3");
        this.p_gettime3 = extras.getString("gettime3");
        this.p_getvenue3 = extras.getString("getvenue3");
        this.p_getfirstNameG = extras.getString("getfirstNameG");
        this.p_getlastNameG = extras.getString("getlastNameG");
        this.p_getfatherNAmeG = extras.getString("getfatherNAmeG");
        this.p_getmotherNameG = extras.getString("getmotherNameG");
        this.p_getgrandFathernameG = extras.getString("getgrandFathernameG");
        this.p_getgrandMothernameG = extras.getString("getgrandMothernameG");
        this.p_getfirstnameB = extras.getString("getfirstnameB");
        this.p_getlastNameB = extras.getString("getlastNameB");
        this.p_getfatherNameB = extras.getString("getfatherNameB");
        this.p_getmotherNameB = extras.getString("getmotherNameB");
        this.p_getgrandFatherNameB = extras.getString("getgrandFatherNameB");
        this.p_getgrandMothernameB = extras.getString("getgrandMothernameB");
        this.p_getRsvp = extras.getString("getRsvp");
        this.p_getdate_other = extras.getString("getdate_other");
        this.p_getvenue_other = extras.getString("getvenue_other");
        this.lenear2 = extras.getString("lenearfun2");
        this.lenear3 = extras.getString("lenearfun3");
        this.layouts = new int[]{R.layout.relative0, R.layout.relative1, R.layout.relative2, R.layout.relative3};
        addBottomDots(0);

        Log.e("positionposition",""+position);




            str = "Name";
            str2 = "Main_Images";
            str3 = "Labels";
            str4 = "Items";

        if (this.position == 0) {


            try {




                JSONObject jSONObject = new JSONObject(this.json_0);
                jSONObject.getJSONArray("Items").getJSONObject(0).getJSONArray("Main_Images").getJSONObject(0).getString("Name");
                JSONArray jSONArray = jSONObject.getJSONArray("Items").getJSONObject(0).getJSONArray("Labels");
                while (true) {
                    str = str7;
                    str2 = str8;
                    str3 = str9;
                    if (i > 6) {
                        break;
                    }
                    try {
                        str6 = str10;
                        try {
                            this.label0_0[i] = jSONArray.getJSONObject(i).getString("id");
                            this.label0_0_w[i] = jSONArray.getJSONObject(i).getDouble("w");
                            this.label0_0_h[i] = jSONArray.getJSONObject(i).getDouble("h");
                            this.label0_0_x[i] = jSONArray.getJSONObject(i).getDouble("x");
                            this.label0_0_y[i] = jSONArray.getJSONObject(i).getDouble("y");
                            this.label0_0_Text[i] = jSONArray.getJSONObject(i).getString("LblText");
                            this.label0_0_Font_name[i] = jSONArray.getJSONObject(i).getString("Font_Name");
                            this.label0_0_font_size[i] = jSONArray.getJSONObject(i).getDouble("Font_Size");
                            this.label0_0_font_color[i] = jSONArray.getJSONObject(i).getString("Font_Color");
                            i++;
                            str7 = str;
                            str8 = str2;
                            str9 = str3;
                            str10 = str6;
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();

                        Log.e("dd","dd");

                    }

                }
                str4 = str10;



                String str11 = str3;
                try {
                    JSONArray jSONArray2 = jSONObject.getJSONArray(str4).getJSONObject(1).getJSONArray(str11);
                    int i2 = 0;
                    for (int i3 = 11; i2 <= i3; i3 = 11) {
                        String str12 = str4;
                        this.label0_1[i2] = jSONArray2.getJSONObject(i2).getString("id");
                        this.label0_1_w[i2] = jSONArray2.getJSONObject(i2).getDouble("w");
                        this.label0_1_h[i2] = jSONArray2.getJSONObject(i2).getDouble("h");
                        this.label0_1_x[i2] = jSONArray2.getJSONObject(i2).getDouble("x");
                        this.label0_1_y[i2] = jSONArray2.getJSONObject(i2).getDouble("y");
                        this.label0_1_Text[i2] = jSONArray2.getJSONObject(i2).getString("LblText");
                        this.label0_1_Font_name[i2] = jSONArray2.getJSONObject(i2).getString("Font_Name");
                        this.label0_1_font_size[i2] = jSONArray2.getJSONObject(i2).getDouble("Font_Size");
                        this.label0_1_font_color[i2] = jSONArray2.getJSONObject(i2).getString("Font_Color");
                        i2++;
                        str4 = str12;
                    }
                    JSONArray jSONArray3 = jSONObject.getJSONArray(str4).getJSONObject(2).getJSONArray(str11);
                    str3 = str11;
                    int i4 = 0;
                    for (int i5 = 9; i4 <= i5; i5 = 9) {
                        str6 = str4;
                        this.label0_2[i4] = jSONArray3.getJSONObject(i4).getString("id");
                        this.label0_2_w[i4] = jSONArray3.getJSONObject(i4).getDouble("w");
                        this.label0_2_h[i4] = jSONArray3.getJSONObject(i4).getDouble("h");
                        this.label0_2_x[i4] = jSONArray3.getJSONObject(i4).getDouble("x");
                        this.label0_2_y[i4] = jSONArray3.getJSONObject(i4).getDouble("y");
                        this.label0_2_Text[i4] = jSONArray3.getJSONObject(i4).getString("LblText");
                        this.label0_2_Font_name[i4] = jSONArray3.getJSONObject(i4).getString("Font_Name");
                        this.label0_2_font_size[i4] = jSONArray3.getJSONObject(i4).getDouble("Font_Size");
                        this.label0_2_font_color[i4] = jSONArray3.getJSONObject(i4).getString("Font_Color");
                        i4++;
                        str4 = str6;
                    }
                    str11 = str3;
                    JSONArray jSONArray4 = jSONObject.getJSONArray(str4).getJSONObject(3).getJSONArray(str11);
                    int i6 = 0;
                    while (i6 <= 6) {
                        String str13 = str11;
                        this.label0_3[i6] = jSONArray4.getJSONObject(i6).getString("id");
                        this.label0_3_w[i6] = jSONArray4.getJSONObject(i6).getDouble("w");
                        this.label0_3_h[i6] = jSONArray4.getJSONObject(i6).getDouble("h");
                        this.label0_3_x[i6] = jSONArray4.getJSONObject(i6).getDouble("x");
                        this.label0_3_y[i6] = jSONArray4.getJSONObject(i6).getDouble("y");
                        this.label0_3_Text[i6] = jSONArray4.getJSONObject(i6).getString("LblText");
                        this.label0_3_Font_name[i6] = jSONArray4.getJSONObject(i6).getString("Font_Name");
                        this.label0_3_font_size[i6] = jSONArray4.getJSONObject(i6).getDouble("Font_Size");
                        this.label0_3_font_color[i6] = jSONArray4.getJSONObject(i6).getString("Font_Color");
                        i6++;
                        str11 = str13;
                    }
                    str3 = str11;
                    addBottomDots(0);
                    MyViewPagerAdapter0 myViewPagerAdapter0 = new MyViewPagerAdapter0();
                    this.myViewPagerAdapter0 = myViewPagerAdapter0;
                    this.viewPager.setAdapter(myViewPagerAdapter0);
                    this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);
                    this.btnSkip.setOnClickListener(new View.OnClickListener() { 
                        @Override 
                        public void onClick(View view) {
                            PreviewActivity.this.launchHomeScreen();
                        }
                    });
                    this.btnNext.setOnClickListener(new View.OnClickListener() { 
                        @Override 
                        public void onClick(View view) {
                            int item = PreviewActivity.this.getItem(1);
                            if (item < PreviewActivity.this.layouts.length) {
                                PreviewActivity.this.viewPager.setCurrentItem(item);
                            } else {
                                PreviewActivity.this.launchHomeScreen();
                            }
                        }
                    });
                } catch (JSONException e4) {

                    str3 = str11;
                    e4.printStackTrace();
                    if (this.position != 1) {
                    }
                    if (this.position == 2) {
                    }
                    if (this.position == 3) {
                    }
                    if (this.position == 4) {
                    }
                    if (this.position == 5) {
                    }
                    if (this.position == 6) {
                    }
                    if (this.position == 7) {
                    }
                    if (this.position == 8) {
                    }
                    if (this.position == 9) {
                    }
                    if (this.position == 10) {
                    }
                    if (this.position == 11) {
                    }
                }
            } catch (Exception e5) {


                Log.e("dd",""+e5.getMessage());

            }
        } else {
            str = "Name";
            str2 = "Main_Images";
            str3 = "Labels";
            str4 = "Items";
        }


        try {
            if (this.position == 1) {
                JSONObject jSONObject2 = new JSONObject(this.json_1);
                jSONObject2.getJSONArray(str4).getJSONObject(0).getJSONArray(str2).getJSONObject(0).getString(str);
                str5 = str3;
                try {
                    JSONArray jSONArray5 = jSONObject2.getJSONArray(str4).getJSONObject(0).getJSONArray(str5);
                    for (int i7 = 0; i7 <= 6; i7++) {
                        this.label1_0_Text[i7] = jSONArray5.getJSONObject(i7).getString("LblText");
                        this.label1_0_Font_name[i7] = jSONArray5.getJSONObject(i7).getString("Font_Name");
                        this.label1_0_font_color[i7] = jSONArray5.getJSONObject(i7).getString("Font_Color");
                    }
                    JSONArray jSONArray6 = jSONObject2.getJSONArray(str4).getJSONObject(1).getJSONArray(str5);
                    for (int i8 = 0; i8 <= 11; i8++) {
                        this.label1_1_Text[i8] = jSONArray6.getJSONObject(i8).getString("LblText");
                        this.label1_1_Font_name[i8] = jSONArray6.getJSONObject(i8).getString("Font_Name");
                        this.label1_1_font_color[i8] = jSONArray6.getJSONObject(i8).getString("Font_Color");
                    }
                    JSONArray jSONArray7 = jSONObject2.getJSONArray(str4).getJSONObject(2).getJSONArray(str5);
                    for (int i9 = 0; i9 <= 9; i9++) {
                        this.label1_2_Text[i9] = jSONArray7.getJSONObject(i9).getString("LblText");
                        this.label1_2_Font_name[i9] = jSONArray7.getJSONObject(i9).getString("Font_Name");
                        this.label1_2_font_color[i9] = jSONArray7.getJSONObject(i9).getString("Font_Color");
                    }
                    JSONArray jSONArray8 = jSONObject2.getJSONArray(str4).getJSONObject(3).getJSONArray(str5);
                    for (int i10 = 0; i10 <= 5; i10++) {
                        this.label1_3_Text[i10] = jSONArray8.getJSONObject(i10).getString("LblText");
                        this.label1_3_Font_name[i10] = jSONArray8.getJSONObject(i10).getString("Font_Name");
                        this.label1_3_font_color[i10] = jSONArray8.getJSONObject(i10).getString("Font_Color");
                    }
                    addBottomDots(0);
                    MyViewPagerAdapter1 myViewPagerAdapter1 = new MyViewPagerAdapter1();
                    this.myViewPagerAdapter1 = myViewPagerAdapter1;
                    this.viewPager.setAdapter(myViewPagerAdapter1);
                    this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);
                    this.btnSkip.setOnClickListener(new View.OnClickListener() { 
                        @Override 
                        public void onClick(View view) {
                            PreviewActivity.this.launchHomeScreen();
                        }
                    });
                    this.btnNext.setOnClickListener(new View.OnClickListener() { 
                        @Override 
                        public void onClick(View view) {
                            int item = PreviewActivity.this.getItem(1);
                            if (item < PreviewActivity.this.layouts.length) {
                                PreviewActivity.this.viewPager.setCurrentItem(item);
                            } else {
                                PreviewActivity.this.launchHomeScreen();
                            }
                        }
                    });
                } catch (JSONException e6) {
                   
                    if (this.position == 2) {
                    }
                    if (this.position == 3) {
                    }
                    if (this.position == 4) {
                    }
                    if (this.position == 5) {
                    }
                    if (this.position == 6) {
                    }
                    if (this.position == 7) {
                    }
                    if (this.position == 8) {
                    }
                    if (this.position == 9) {
                    }
                    if (this.position == 10) {
                    }
                    if (this.position == 11) {
                    }
                }
            } else {
                str5 = str3;
            }
        } catch (JSONException e7) {
           
            str5 = str3;
        }
        try {
            if (this.position == 2) {
                JSONObject jSONObject3 = new JSONObject(this.json_2);
                JSONArray jSONArray9 = jSONObject3.getJSONArray(str4).getJSONObject(0).getJSONArray(str5);
                for (int i11 = 0; i11 <= 4; i11++) {
                    this.label2_0_Text[i11] = jSONArray9.getJSONObject(i11).getString("LblText");
                    this.label2_0_Font_name[i11] = jSONArray9.getJSONObject(i11).getString("Font_Name");
                    this.label2_0_font_color[i11] = jSONArray9.getJSONObject(i11).getString("Font_Color");
                }
                JSONArray jSONArray10 = jSONObject3.getJSONArray(str4).getJSONObject(1).getJSONArray(str5);
                for (int i12 = 0; i12 <= 11; i12++) {
                    this.label2_1_Text[i12] = jSONArray10.getJSONObject(i12).getString("LblText");
                    this.label2_1_Font_name[i12] = jSONArray10.getJSONObject(i12).getString("Font_Name");
                    this.label2_1_font_color[i12] = jSONArray10.getJSONObject(i12).getString("Font_Color");
                }
                JSONArray jSONArray11 = jSONObject3.getJSONArray(str4).getJSONObject(2).getJSONArray(str5);
                for (int i13 = 0; i13 <= 9; i13++) {
                    this.label2_2_Text[i13] = jSONArray11.getJSONObject(i13).getString("LblText");
                    this.label2_2_Font_name[i13] = jSONArray11.getJSONObject(i13).getString("Font_Name");
                    this.label2_2_font_color[i13] = jSONArray11.getJSONObject(i13).getString("Font_Color");
                }
                JSONArray jSONArray12 = jSONObject3.getJSONArray(str4).getJSONObject(3).getJSONArray(str5);
                for (int i14 = 0; i14 <= 6; i14++) {
                    this.label2_3_Text[i14] = jSONArray12.getJSONObject(i14).getString("LblText");
                    this.label2_3_Font_name[i14] = jSONArray12.getJSONObject(i14).getString("Font_Name");
                    this.label2_3_font_color[i14] = jSONArray12.getJSONObject(i14).getString("Font_Color");
                }
                MyViewPagerAdapter2 myViewPagerAdapter2 = new MyViewPagerAdapter2();
                this.myViewPagerAdapter2 = myViewPagerAdapter2;
                this.viewPager.setAdapter(myViewPagerAdapter2);
                this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);
                this.btnSkip.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        PreviewActivity.this.launchHomeScreen();
                    }
                });
                this.btnNext.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        int item = PreviewActivity.this.getItem(1);
                        if (item < PreviewActivity.this.layouts.length) {
                            PreviewActivity.this.viewPager.setCurrentItem(item);
                        } else {
                            PreviewActivity.this.launchHomeScreen();
                        }
                    }
                });
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        try {
            if (this.position == 3) {
                JSONObject jSONObject4 = new JSONObject(this.json_3);
                JSONArray jSONArray13 = jSONObject4.getJSONArray(str4).getJSONObject(0).getJSONArray(str5);
                for (int i15 = 0; i15 <= 4; i15++) {
                    this.label3_0_Text[i15] = jSONArray13.getJSONObject(i15).getString("LblText");
                    this.label3_0_Font_name[i15] = jSONArray13.getJSONObject(i15).getString("Font_Name");
                    this.label3_0_font_color[i15] = jSONArray13.getJSONObject(i15).getString("Font_Color");
                }
                JSONArray jSONArray14 = jSONObject4.getJSONArray(str4).getJSONObject(1).getJSONArray(str5);
                for (int i16 = 0; i16 <= 11; i16++) {
                    this.label3_1_Text[i16] = jSONArray14.getJSONObject(i16).getString("LblText");
                    this.label3_1_Font_name[i16] = jSONArray14.getJSONObject(i16).getString("Font_Name");
                    this.label3_1_font_color[i16] = jSONArray14.getJSONObject(i16).getString("Font_Color");
                }
                JSONArray jSONArray15 = jSONObject4.getJSONArray(str4).getJSONObject(2).getJSONArray(str5);
                for (int i17 = 0; i17 <= 9; i17++) {
                    this.label3_2_Text[i17] = jSONArray15.getJSONObject(i17).getString("LblText");
                    this.label3_2_Font_name[i17] = jSONArray15.getJSONObject(i17).getString("Font_Name");
                    this.label3_2_font_color[i17] = jSONArray15.getJSONObject(i17).getString("Font_Color");
                }
                JSONArray jSONArray16 = jSONObject4.getJSONArray(str4).getJSONObject(3).getJSONArray(str5);
                for (int i18 = 0; i18 <= 5; i18++) {
                    this.label3_3_Text[i18] = jSONArray16.getJSONObject(i18).getString("LblText");
                    this.label3_3_Font_name[i18] = jSONArray16.getJSONObject(i18).getString("Font_Name");
                    this.label3_3_font_color[i18] = jSONArray16.getJSONObject(i18).getString("Font_Color");
                }
                MyViewPagerAdapter3 myViewPagerAdapter3 = new MyViewPagerAdapter3();
                this.myViewPagerAdapter3 = myViewPagerAdapter3;
                this.viewPager.setAdapter(myViewPagerAdapter3);
                this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);
                this.btnSkip.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        PreviewActivity.this.launchHomeScreen();
                    }
                });
                this.btnNext.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        int item = PreviewActivity.this.getItem(1);
                        if (item < PreviewActivity.this.layouts.length) {
                            PreviewActivity.this.viewPager.setCurrentItem(item);
                        } else {
                            PreviewActivity.this.launchHomeScreen();
                        }
                    }
                });
            }
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
        try {
            if (this.position == 4) {
                JSONObject jSONObject5 = new JSONObject(this.json_4);
                JSONArray jSONArray17 = jSONObject5.getJSONArray(str4).getJSONObject(0).getJSONArray(str5);
                for (int i19 = 0; i19 <= 5; i19++) {
                    this.label4_0_Text[i19] = jSONArray17.getJSONObject(i19).getString("LblText");
                    this.label4_0_Font_name[i19] = jSONArray17.getJSONObject(i19).getString("Font_Name");
                    this.label4_0_font_color[i19] = jSONArray17.getJSONObject(i19).getString("Font_Color");
                }
                JSONArray jSONArray18 = jSONObject5.getJSONArray(str4).getJSONObject(1).getJSONArray(str5);
                for (int i20 = 0; i20 <= 11; i20++) {
                    this.label4_1_Text[i20] = jSONArray18.getJSONObject(i20).getString("LblText");
                    this.label4_1_Font_name[i20] = jSONArray18.getJSONObject(i20).getString("Font_Name");
                    this.label4_1_font_color[i20] = jSONArray18.getJSONObject(i20).getString("Font_Color");
                }
                JSONArray jSONArray19 = jSONObject5.getJSONArray(str4).getJSONObject(2).getJSONArray(str5);
                for (int i21 = 0; i21 <= 9; i21++) {
                    this.label4_2_Text[i21] = jSONArray19.getJSONObject(i21).getString("LblText");
                    this.label4_2_Font_name[i21] = jSONArray19.getJSONObject(i21).getString("Font_Name");
                    this.label4_2_font_color[i21] = jSONArray19.getJSONObject(i21).getString("Font_Color");
                }
                JSONArray jSONArray20 = jSONObject5.getJSONArray(str4).getJSONObject(3).getJSONArray(str5);
                for (int i22 = 0; i22 <= 5; i22++) {
                    this.label4_3_Text[i22] = jSONArray20.getJSONObject(i22).getString("LblText");
                    this.label4_3_Font_name[i22] = jSONArray20.getJSONObject(i22).getString("Font_Name");
                    this.label4_3_font_color[i22] = jSONArray20.getJSONObject(i22).getString("Font_Color");
                }
                MyViewPagerAdapter4 myViewPagerAdapter4 = new MyViewPagerAdapter4();
                this.myViewPagerAdapter4 = myViewPagerAdapter4;
                this.viewPager.setAdapter(myViewPagerAdapter4);
                this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);
                this.btnSkip.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        PreviewActivity.this.launchHomeScreen();
                    }
                });
                this.btnNext.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        int item = PreviewActivity.this.getItem(1);
                        if (item < PreviewActivity.this.layouts.length) {
                            PreviewActivity.this.viewPager.setCurrentItem(item);
                        } else {
                            PreviewActivity.this.launchHomeScreen();
                        }
                    }
                });
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        try {
            if (this.position == 5) {
                JSONObject jSONObject6 = new JSONObject(this.json_5);
                JSONArray jSONArray21 = jSONObject6.getJSONArray(str4).getJSONObject(0).getJSONArray(str5);
                for (int i23 = 0; i23 <= 6; i23++) {
                    this.label5_0_Text[i23] = jSONArray21.getJSONObject(i23).getString("LblText");
                    this.label5_0_Font_name[i23] = jSONArray21.getJSONObject(i23).getString("Font_Name");
                    this.label5_0_font_color[i23] = jSONArray21.getJSONObject(i23).getString("Font_Color");
                }
                JSONArray jSONArray22 = jSONObject6.getJSONArray(str4).getJSONObject(1).getJSONArray(str5);
                for (int i24 = 0; i24 <= 11; i24++) {
                    this.label5_1_Text[i24] = jSONArray22.getJSONObject(i24).getString("LblText");
                    this.label5_1_Font_name[i24] = jSONArray22.getJSONObject(i24).getString("Font_Name");
                    this.label5_1_font_color[i24] = jSONArray22.getJSONObject(i24).getString("Font_Color");
                }
                JSONArray jSONArray23 = jSONObject6.getJSONArray(str4).getJSONObject(2).getJSONArray(str5);
                for (int i25 = 0; i25 <= 9; i25++) {
                    this.label5_2_Text[i25] = jSONArray23.getJSONObject(i25).getString("LblText");
                    this.label5_2_Font_name[i25] = jSONArray23.getJSONObject(i25).getString("Font_Name");
                    this.label5_2_font_color[i25] = jSONArray23.getJSONObject(i25).getString("Font_Color");
                }
                JSONArray jSONArray24 = jSONObject6.getJSONArray(str4).getJSONObject(3).getJSONArray(str5);
                for (int i26 = 0; i26 <= 5; i26++) {
                    this.label5_3_Text[i26] = jSONArray24.getJSONObject(i26).getString("LblText");
                    this.label5_3_Font_name[i26] = jSONArray24.getJSONObject(i26).getString("Font_Name");
                    this.label5_3_font_color[i26] = jSONArray24.getJSONObject(i26).getString("Font_Color");
                }
                MyViewPagerAdapter5 myViewPagerAdapter5 = new MyViewPagerAdapter5();
                this.myViewPagerAdapter5 = myViewPagerAdapter5;
                this.viewPager.setAdapter(myViewPagerAdapter5);
                this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);
                this.btnSkip.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        PreviewActivity.this.launchHomeScreen();
                    }
                });
                this.btnNext.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        int item = PreviewActivity.this.getItem(1);
                        if (item < PreviewActivity.this.layouts.length) {
                            PreviewActivity.this.viewPager.setCurrentItem(item);
                        } else {
                            PreviewActivity.this.launchHomeScreen();
                        }
                    }
                });
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        try {
            if (this.position == 6) {
                JSONObject jSONObject7 = new JSONObject(this.json_6);
                JSONArray jSONArray25 = jSONObject7.getJSONArray(str4).getJSONObject(0).getJSONArray(str5);
                for (int i27 = 0; i27 <= 4; i27++) {
                    this.label6_0_Text[i27] = jSONArray25.getJSONObject(i27).getString("LblText");
                    this.label6_0_Font_name[i27] = jSONArray25.getJSONObject(i27).getString("Font_Name");
                    this.label6_0_font_color[i27] = jSONArray25.getJSONObject(i27).getString("Font_Color");
                }
                JSONArray jSONArray26 = jSONObject7.getJSONArray(str4).getJSONObject(1).getJSONArray(str5);
                for (int i28 = 0; i28 <= 11; i28++) {
                    this.label6_1_Text[i28] = jSONArray26.getJSONObject(i28).getString("LblText");
                    this.label6_1_Font_name[i28] = jSONArray26.getJSONObject(i28).getString("Font_Name");
                    this.label6_1_font_color[i28] = jSONArray26.getJSONObject(i28).getString("Font_Color");
                }
                JSONArray jSONArray27 = jSONObject7.getJSONArray(str4).getJSONObject(2).getJSONArray(str5);
                for (int i29 = 0; i29 <= 9; i29++) {
                    this.label6_2_Text[i29] = jSONArray27.getJSONObject(i29).getString("LblText");
                    this.label6_2_Font_name[i29] = jSONArray27.getJSONObject(i29).getString("Font_Name");
                    this.label6_2_font_color[i29] = jSONArray27.getJSONObject(i29).getString("Font_Color");
                }
                JSONArray jSONArray28 = jSONObject7.getJSONArray(str4).getJSONObject(3).getJSONArray(str5);
                for (int i30 = 0; i30 <= 5; i30++) {
                    this.label6_3_Text[i30] = jSONArray28.getJSONObject(i30).getString("LblText");
                    this.label6_3_Font_name[i30] = jSONArray28.getJSONObject(i30).getString("Font_Name");
                    this.label6_3_font_color[i30] = jSONArray28.getJSONObject(i30).getString("Font_Color");
                }
                MyViewPagerAdapter6 myViewPagerAdapter6 = new MyViewPagerAdapter6();
                this.myViewPagerAdapter6 = myViewPagerAdapter6;
                this.viewPager.setAdapter(myViewPagerAdapter6);
                this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);
                this.btnSkip.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        PreviewActivity.this.launchHomeScreen();
                    }
                });
                this.btnNext.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        int item = PreviewActivity.this.getItem(1);
                        if (item < PreviewActivity.this.layouts.length) {
                            PreviewActivity.this.viewPager.setCurrentItem(item);
                        } else {
                            PreviewActivity.this.launchHomeScreen();
                        }
                    }
                });
            }
        } catch (JSONException e12) {
            e12.printStackTrace();
        }
        try {
            if (this.position == 7) {
                JSONObject jSONObject8 = new JSONObject(this.json_7);
                JSONArray jSONArray29 = jSONObject8.getJSONArray(str4).getJSONObject(0).getJSONArray(str5);
                for (int i31 = 0; i31 <= 5; i31++) {
                    this.label7_0_Text[i31] = jSONArray29.getJSONObject(i31).getString("LblText");
                    this.label7_0_Font_name[i31] = jSONArray29.getJSONObject(i31).getString("Font_Name");
                    this.label7_0_font_color[i31] = jSONArray29.getJSONObject(i31).getString("Font_Color");
                }
                JSONArray jSONArray30 = jSONObject8.getJSONArray(str4).getJSONObject(1).getJSONArray(str5);
                for (int i32 = 0; i32 <= 11; i32++) {
                    this.label7_1_Text[i32] = jSONArray30.getJSONObject(i32).getString("LblText");
                    this.label7_1_Font_name[i32] = jSONArray30.getJSONObject(i32).getString("Font_Name");
                    this.label7_1_font_color[i32] = jSONArray30.getJSONObject(i32).getString("Font_Color");
                }
                JSONArray jSONArray31 = jSONObject8.getJSONArray(str4).getJSONObject(2).getJSONArray(str5);
                for (int i33 = 0; i33 <= 9; i33++) {
                    this.label7_2_Text[i33] = jSONArray31.getJSONObject(i33).getString("LblText");
                    this.label7_2_Font_name[i33] = jSONArray31.getJSONObject(i33).getString("Font_Name");
                    this.label7_2_font_color[i33] = jSONArray31.getJSONObject(i33).getString("Font_Color");
                }
                JSONArray jSONArray32 = jSONObject8.getJSONArray(str4).getJSONObject(3).getJSONArray(str5);
                for (int i34 = 0; i34 <= 5; i34++) {
                    this.label7_3_Text[i34] = jSONArray32.getJSONObject(i34).getString("LblText");
                    this.label7_3_Font_name[i34] = jSONArray32.getJSONObject(i34).getString("Font_Name");
                    this.label7_3_font_color[i34] = jSONArray32.getJSONObject(i34).getString("Font_Color");
                }
                MyViewPagerAdapter7 myViewPagerAdapter7 = new MyViewPagerAdapter7();
                this.myViewPagerAdapter7 = myViewPagerAdapter7;
                this.viewPager.setAdapter(myViewPagerAdapter7);
                this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);
                this.btnSkip.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        PreviewActivity.this.launchHomeScreen();
                    }
                });
                this.btnNext.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        int item = PreviewActivity.this.getItem(1);
                        if (item < PreviewActivity.this.layouts.length) {
                            PreviewActivity.this.viewPager.setCurrentItem(item);
                        } else {
                            PreviewActivity.this.launchHomeScreen();
                        }
                    }
                });
            }
        } catch (JSONException e13) {
            e13.printStackTrace();
        }
        try {
            if (this.position == 8) {
                JSONObject jSONObject9 = new JSONObject(this.json_8);
                JSONArray jSONArray33 = jSONObject9.getJSONArray(str4).getJSONObject(0).getJSONArray(str5);
                for (int i35 = 0; i35 <= 7; i35++) {
                    this.label8_0_Text[i35] = jSONArray33.getJSONObject(i35).getString("LblText");
                    this.label8_0_Font_name[i35] = jSONArray33.getJSONObject(i35).getString("Font_Name");
                    this.label8_0_font_color[i35] = jSONArray33.getJSONObject(i35).getString("Font_Color");
                }
                JSONArray jSONArray34 = jSONObject9.getJSONArray(str4).getJSONObject(1).getJSONArray(str5);
                for (int i36 = 0; i36 <= 11; i36++) {
                    this.label8_1_Text[i36] = jSONArray34.getJSONObject(i36).getString("LblText");
                    this.label8_1_Font_name[i36] = jSONArray34.getJSONObject(i36).getString("Font_Name");
                    this.label8_1_font_color[i36] = jSONArray34.getJSONObject(i36).getString("Font_Color");
                }
                JSONArray jSONArray35 = jSONObject9.getJSONArray(str4).getJSONObject(2).getJSONArray(str5);
                for (int i37 = 0; i37 <= 9; i37++) {
                    this.label8_2_Text[i37] = jSONArray35.getJSONObject(i37).getString("LblText");
                    this.label8_2_Font_name[i37] = jSONArray35.getJSONObject(i37).getString("Font_Name");
                    this.label8_2_font_color[i37] = jSONArray35.getJSONObject(i37).getString("Font_Color");
                }
                JSONArray jSONArray36 = jSONObject9.getJSONArray(str4).getJSONObject(3).getJSONArray(str5);
                for (int i38 = 0; i38 <= 5; i38++) {
                    this.label8_3_Text[i38] = jSONArray36.getJSONObject(i38).getString("LblText");
                    this.label8_3_Font_name[i38] = jSONArray36.getJSONObject(i38).getString("Font_Name");
                    this.label8_3_font_color[i38] = jSONArray36.getJSONObject(i38).getString("Font_Color");
                }
                MyViewPagerAdapter8 myViewPagerAdapter8 = new MyViewPagerAdapter8();
                this.myViewPagerAdapter8 = myViewPagerAdapter8;
                this.viewPager.setAdapter(myViewPagerAdapter8);
                this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);
                this.btnSkip.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        PreviewActivity.this.launchHomeScreen();
                    }
                });
                this.btnNext.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        int item = PreviewActivity.this.getItem(1);
                        if (item < PreviewActivity.this.layouts.length) {
                            PreviewActivity.this.viewPager.setCurrentItem(item);
                        } else {
                            PreviewActivity.this.launchHomeScreen();
                        }
                    }
                });
            }
        } catch (JSONException e14) {
            e14.printStackTrace();
        }
        try {
            if (this.position == 9) {
                JSONObject jSONObject10 = new JSONObject(this.json_9);
                JSONArray jSONArray37 = jSONObject10.getJSONArray(str4).getJSONObject(0).getJSONArray(str5);
                for (int i39 = 0; i39 <= 5; i39++) {
                    this.label9_0_Text[i39] = jSONArray37.getJSONObject(i39).getString("LblText");
                    this.label9_0_Font_name[i39] = jSONArray37.getJSONObject(i39).getString("Font_Name");
                    this.label9_0_font_color[i39] = jSONArray37.getJSONObject(i39).getString("Font_Color");
                }
                JSONArray jSONArray38 = jSONObject10.getJSONArray(str4).getJSONObject(1).getJSONArray(str5);
                for (int i40 = 0; i40 <= 10; i40++) {
                    this.label9_1_Text[i40] = jSONArray38.getJSONObject(i40).getString("LblText");
                    this.label9_1_Font_name[i40] = jSONArray38.getJSONObject(i40).getString("Font_Name");
                    this.label9_1_font_color[i40] = jSONArray38.getJSONObject(i40).getString("Font_Color");
                }
                JSONArray jSONArray39 = jSONObject10.getJSONArray(str4).getJSONObject(2).getJSONArray(str5);
                for (int i41 = 0; i41 <= 9; i41++) {
                    this.label9_2_Text[i41] = jSONArray39.getJSONObject(i41).getString("LblText");
                    this.label9_2_Font_name[i41] = jSONArray39.getJSONObject(i41).getString("Font_Name");
                    this.label9_2_font_color[i41] = jSONArray39.getJSONObject(i41).getString("Font_Color");
                }
                JSONArray jSONArray40 = jSONObject10.getJSONArray(str4).getJSONObject(3).getJSONArray(str5);
                for (int i42 = 0; i42 <= 5; i42++) {
                    this.label9_3_Text[i42] = jSONArray40.getJSONObject(i42).getString("LblText");
                    this.label9_3_Font_name[i42] = jSONArray40.getJSONObject(i42).getString("Font_Name");
                    this.label9_3_font_color[i42] = jSONArray40.getJSONObject(i42).getString("Font_Color");
                }
                MyViewPagerAdapter9 myViewPagerAdapter9 = new MyViewPagerAdapter9();
                this.myViewPagerAdapter9 = myViewPagerAdapter9;
                this.viewPager.setAdapter(myViewPagerAdapter9);
                this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);
                this.btnSkip.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        PreviewActivity.this.launchHomeScreen();
                    }
                });
                this.btnNext.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        int item = PreviewActivity.this.getItem(1);
                        if (item < PreviewActivity.this.layouts.length) {
                            PreviewActivity.this.viewPager.setCurrentItem(item);
                        } else {
                            PreviewActivity.this.launchHomeScreen();
                        }
                    }
                });
            }
        } catch (JSONException e15) {
            e15.printStackTrace();
        }
        try {
            if (this.position == 10) {
                JSONObject jSONObject11 = new JSONObject(this.json_10);
                JSONArray jSONArray41 = jSONObject11.getJSONArray(str4).getJSONObject(0).getJSONArray(str5);
                for (int i43 = 0; i43 <= 6; i43++) {
                    this.label10_0_Text[i43] = jSONArray41.getJSONObject(i43).getString("LblText");
                    this.label10_0_Font_name[i43] = jSONArray41.getJSONObject(i43).getString("Font_Name");
                    this.label10_0_font_color[i43] = jSONArray41.getJSONObject(i43).getString("Font_Color");
                }
                JSONArray jSONArray42 = jSONObject11.getJSONArray(str4).getJSONObject(1).getJSONArray(str5);
                for (int i44 = 0; i44 <= 11; i44++) {
                    this.label10_1_Text[i44] = jSONArray42.getJSONObject(i44).getString("LblText");
                    this.label10_1_Font_name[i44] = jSONArray42.getJSONObject(i44).getString("Font_Name");
                    this.label10_1_font_color[i44] = jSONArray42.getJSONObject(i44).getString("Font_Color");
                }
                JSONArray jSONArray43 = jSONObject11.getJSONArray(str4).getJSONObject(2).getJSONArray(str5);
                for (int i45 = 0; i45 <= 9; i45++) {
                    this.label10_2_Text[i45] = jSONArray43.getJSONObject(i45).getString("LblText");
                    this.label10_2_Font_name[i45] = jSONArray43.getJSONObject(i45).getString("Font_Name");
                    this.label10_2_font_color[i45] = jSONArray43.getJSONObject(i45).getString("Font_Color");
                }
                JSONArray jSONArray44 = jSONObject11.getJSONArray(str4).getJSONObject(3).getJSONArray(str5);
                for (int i46 = 0; i46 <= 5; i46++) {
                    this.label10_3_Text[i46] = jSONArray44.getJSONObject(i46).getString("LblText");
                    this.label10_3_Font_name[i46] = jSONArray44.getJSONObject(i46).getString("Font_Name");
                    this.label10_3_font_color[i46] = jSONArray44.getJSONObject(i46).getString("Font_Color");
                }
                MyViewPagerAdapter10 myViewPagerAdapter10 = new MyViewPagerAdapter10();
                this.myViewPagerAdapter10 = myViewPagerAdapter10;
                this.viewPager.setAdapter(myViewPagerAdapter10);
                this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);
                this.btnSkip.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        PreviewActivity.this.launchHomeScreen();
                    }
                });
                this.btnNext.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        int item = PreviewActivity.this.getItem(1);
                        if (item < PreviewActivity.this.layouts.length) {
                            PreviewActivity.this.viewPager.setCurrentItem(item);
                        } else {
                            PreviewActivity.this.launchHomeScreen();
                        }
                    }
                });
            }
        } catch (JSONException e16) {
            e16.printStackTrace();
        }
        try {
            if (this.position == 11) {
                JSONObject jSONObject12 = new JSONObject(this.json_11);
                JSONArray jSONArray45 = jSONObject12.getJSONArray(str4).getJSONObject(0).getJSONArray(str5);
                for (int i47 = 0; i47 <= 5; i47++) {
                    this.label11_0_Text[i47] = jSONArray45.getJSONObject(i47).getString("LblText");
                    this.label11_0_Font_name[i47] = jSONArray45.getJSONObject(i47).getString("Font_Name");
                    this.label11_0_font_color[i47] = jSONArray45.getJSONObject(i47).getString("Font_Color");
                }
                JSONArray jSONArray46 = jSONObject12.getJSONArray(str4).getJSONObject(1).getJSONArray(str5);
                for (int i48 = 0; i48 <= 11; i48++) {
                    this.label11_1_Text[i48] = jSONArray46.getJSONObject(i48).getString("LblText");
                    this.label11_1_Font_name[i48] = jSONArray46.getJSONObject(i48).getString("Font_Name");
                    this.label11_1_font_color[i48] = jSONArray46.getJSONObject(i48).getString("Font_Color");
                }
                JSONArray jSONArray47 = jSONObject12.getJSONArray(str4).getJSONObject(2).getJSONArray(str5);
                for (int i49 = 0; i49 <= 9; i49++) {
                    this.label11_2_Text[i49] = jSONArray47.getJSONObject(i49).getString("LblText");
                    this.label11_2_Font_name[i49] = jSONArray47.getJSONObject(i49).getString("Font_Name");
                    this.label11_2_font_color[i49] = jSONArray47.getJSONObject(i49).getString("Font_Color");
                }
                JSONArray jSONArray48 = jSONObject12.getJSONArray(str4).getJSONObject(3).getJSONArray(str5);
                for (int i50 = 0; i50 <= 6; i50++) {
                    this.label11_3_Text[i50] = jSONArray48.getJSONObject(i50).getString("LblText");
                    this.label11_3_Font_name[i50] = jSONArray48.getJSONObject(i50).getString("Font_Name");
                    this.label11_3_font_color[i50] = jSONArray48.getJSONObject(i50).getString("Font_Color");
                }
                MyViewPagerAdapter11 myViewPagerAdapter11 = new MyViewPagerAdapter11();
                this.myViewPagerAdapter11 = myViewPagerAdapter11;
                this.viewPager.setAdapter(myViewPagerAdapter11);
                this.viewPager.addOnPageChangeListener(this.viewPagerPageChangeListener);
                this.btnSkip.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        PreviewActivity.this.launchHomeScreen();
                    }
                });
                this.btnNext.setOnClickListener(new View.OnClickListener() { 
                    @Override 
                    public void onClick(View view) {
                        int item = PreviewActivity.this.getItem(1);
                        if (item < PreviewActivity.this.layouts.length) {
                            PreviewActivity.this.viewPager.setCurrentItem(item);
                        } else {
                            PreviewActivity.this.launchHomeScreen();
                        }
                    }
                });
            }
        } catch (JSONException e17) {
            e17.printStackTrace();
        }
    }

    
    public void addBottomDots(int i) {
        TextView[] textViewArr;
        this.dots = new TextView[this.layouts.length];
        int[] intArray = getResources().getIntArray(R.array.array_dot_active);
        int[] intArray2 = getResources().getIntArray(R.array.array_dot_inactive);
        this.dotsLayout.removeAllViews();
        int i2 = 0;
        while (true) {
            textViewArr = this.dots;
            if (i2 >= textViewArr.length) {
                break;
            }
            textViewArr[i2] = new TextView(this);
            this.dots[i2].setText(Html.fromHtml("&#8226;"));
            this.dots[i2].setTextSize(35.0f);
            this.dots[i2].setTextColor(intArray2[i]);
            this.dotsLayout.addView(this.dots[i2]);
            i2++;
        }
        if (textViewArr.length > 0) {
            textViewArr[i].setTextColor(intArray[i]);
        }
    }

    
    public int getItem(int i) {
        return this.viewPager.getCurrentItem() + i;
    }

    
    public void launchHomeScreen() {
        this.prefManager.setFirstTimeLaunch(false);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    
    public class MyViewPagerAdapter0 extends PagerAdapter {
        private LayoutInflater layoutInflater;

        @Override 
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public MyViewPagerAdapter0() {
        }

        @Override 
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = (LayoutInflater) PreviewActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.layoutInflater = layoutInflater;
            View inflate = layoutInflater.inflate(PreviewActivity.this.layouts[i], viewGroup, false);
            if (i == 0) {
                PreviewActivity.this.relative0 = (RelativeLayout) inflate.findViewById(R.id.rel0);
                ImageView imageView = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity = PreviewActivity.this;
                previewActivity.bmp = previewActivity.setBgImg(R.drawable.w_0_up_img_0);
                imageView.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams.setMargins(0, 0, 0, 0);
                imageView.setLayoutParams(layoutParams);
                PreviewActivity.this.relative0.addView(imageView, 0);
                TextView textView = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                layoutParams2.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._90sdp), 0, 0);
                layoutParams2.addRule(14);
                textView.setGravity(1);
                textView.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView.setText(PreviewActivity.this.label0_0_Text[0]);
                textView.setTextColor(Color.parseColor(PreviewActivity.this.label0_0_font_color[0]));
                AssetManager assets = PreviewActivity.this.getAssets();
                textView.setTypeface(Typeface.createFromAsset(assets, "fonts/" + PreviewActivity.this.label0_0_Font_name[0] + ".ttf"));
                textView.setLayoutParams(layoutParams2);
                PreviewActivity.this.relative0.addView(textView);
                TextView textView2 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._30sdp));
                layoutParams3.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._152sdp), 0, 0);
                layoutParams3.addRule(14);
                textView2.setGravity(1);
                textView2.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView2.setText(PreviewActivity.this.label0_0_Text[1]);
                textView2.setTextColor(Color.parseColor(PreviewActivity.this.label0_0_font_color[1]));
                AssetManager assets2 = PreviewActivity.this.getAssets();
                textView2.setTypeface(Typeface.createFromAsset(assets2, "fonts/" + PreviewActivity.this.label0_0_Font_name[1] + ".ttf"));
                textView2.setLayoutParams(layoutParams3);
                PreviewActivity.this.relative0.addView(textView2);
                TextView textView3 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                layoutParams4.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._210sdp), 0, 0);
                layoutParams4.addRule(14);
                textView3.setGravity(1);
                textView3.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView3.setText(PreviewActivity.this.p_getfirstNameG);
                textView3.setTextColor(Color.parseColor(PreviewActivity.this.label0_0_font_color[2]));
                AssetManager assets3 = PreviewActivity.this.getAssets();
                textView3.setTypeface(Typeface.createFromAsset(assets3, "fonts/" + PreviewActivity.this.label0_0_Font_name[2] + ".ttf"));
                textView3.setLayoutParams(layoutParams4);
                PreviewActivity.this.relative0.addView(textView3);
                TextView textView4 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                layoutParams5.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._240sdp), 0, 0);
                layoutParams5.addRule(14);
                textView4.setGravity(1);
                textView4.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView4.setText(PreviewActivity.this.label0_0_Text[3]);
                textView4.setTextColor(Color.parseColor(PreviewActivity.this.label0_0_font_color[3]));
                AssetManager assets4 = PreviewActivity.this.getAssets();
                textView4.setTypeface(Typeface.createFromAsset(assets4, "fonts/" + PreviewActivity.this.label0_0_Font_name[3] + ".ttf"));
                textView4.setLayoutParams(layoutParams5);
                PreviewActivity.this.relative0.addView(textView4);
                TextView textView5 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                layoutParams6.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._265sdp), 0, 0);
                layoutParams6.addRule(14);
                textView5.setGravity(1);
                textView5.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView5.setText(PreviewActivity.this.p_getfirstnameB);
                textView5.setTextColor(Color.parseColor(PreviewActivity.this.label0_0_font_color[4]));
                AssetManager assets5 = PreviewActivity.this.getAssets();
                textView5.setTypeface(Typeface.createFromAsset(assets5, "fonts/" + PreviewActivity.this.label0_0_Font_name[4] + ".ttf"));
                textView5.setLayoutParams(layoutParams6);
                PreviewActivity.this.relative0.addView(textView5);
                TextView textView6 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                layoutParams7.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._350sdp), 0, 0);
                layoutParams7.addRule(14);
                textView6.setGravity(1);
                textView6.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView6.setText(PreviewActivity.this.label0_0_Text[5]);
                textView6.setTextColor(Color.parseColor(PreviewActivity.this.label0_0_font_color[5]));
                AssetManager assets6 = PreviewActivity.this.getAssets();
                textView6.setTypeface(Typeface.createFromAsset(assets6, "fonts/" + PreviewActivity.this.label0_0_Font_name[5] + ".ttf"));
                textView6.setLayoutParams(layoutParams7);
                PreviewActivity.this.relative0.addView(textView6);
                TextView textView7 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                layoutParams8.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._370sdp), 0, 0);
                textView7.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView7.setText(PreviewActivity.this.p_getdate1);
                layoutParams8.addRule(14);
                textView7.setGravity(1);
                textView7.setTextColor(Color.parseColor(PreviewActivity.this.label0_0_font_color[6]));
                AssetManager assets7 = PreviewActivity.this.getAssets();
                textView7.setTypeface(Typeface.createFromAsset(assets7, "fonts/" + PreviewActivity.this.label0_0_Font_name[6] + ".ttf"));
                textView7.setLayoutParams(layoutParams8);
                PreviewActivity.this.relative0.addView(textView7);
            }
            if (i == 1) {
                PreviewActivity.this.relative1 = (RelativeLayout) inflate.findViewById(R.id.rel1);
                ImageView imageView2 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity2 = PreviewActivity.this;
                previewActivity2.bmp = previewActivity2.setBgImg(R.drawable.w_0_up_img_1);
                imageView2.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams9.setMargins(0, 0, 0, 0);
                imageView2.setLayoutParams(layoutParams9);
                imageView2.setLayoutParams(layoutParams9);
                PreviewActivity.this.relative1.addView(imageView2, 0);
                TextView textView8 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                layoutParams10.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0, 0);
                textView8.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                layoutParams10.addRule(14);
                textView8.setGravity(1);
                textView8.setText(PreviewActivity.this.label0_1_Text[0]);
                textView8.setTextColor(Color.parseColor(PreviewActivity.this.label0_1_font_color[0]));
                AssetManager assets8 = PreviewActivity.this.getAssets();
                textView8.setTypeface(Typeface.createFromAsset(assets8, "fonts/" + PreviewActivity.this.label0_1_Font_name[0] + ".ttf"));
                textView8.setLayoutParams(layoutParams10);
                PreviewActivity.this.relative1.addView(textView8);
                TextView textView9 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                layoutParams11.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._90sdp), 0, 0);
                textView9.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                layoutParams11.addRule(14);
                textView9.setGravity(1);
                textView9.setText(PreviewActivity.this.p_getfirstNameG);
                textView9.setTextColor(Color.parseColor(PreviewActivity.this.label0_1_font_color[1]));
                AssetManager assets9 = PreviewActivity.this.getAssets();
                textView9.setTypeface(Typeface.createFromAsset(assets9, "fonts/" + PreviewActivity.this.label0_1_Font_name[1] + ".ttf"));
                textView9.setLayoutParams(layoutParams11);
                PreviewActivity.this.relative1.addView(textView9);
                TextView textView10 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                layoutParams12.setMargins(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._62sdp), PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._125sdp), 0, 0);
                textView10.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                layoutParams12.addRule(14);
                textView10.setGravity(1);
                textView10.setText(PreviewActivity.this.p_getrelation);
                textView10.setTextColor(Color.parseColor(PreviewActivity.this.label0_1_font_color[2]));
                AssetManager assets10 = PreviewActivity.this.getAssets();
                textView10.setTypeface(Typeface.createFromAsset(assets10, "fonts/" + PreviewActivity.this.label0_1_Font_name[2] + ".ttf"));
                textView10.setLayoutParams(layoutParams12);
                PreviewActivity.this.relative1.addView(textView10);
                TextView textView11 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                layoutParams13.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._140sdp), 0, 0);
                textView11.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                layoutParams13.addRule(14);
                textView11.setGravity(1);
                textView11.setText("Mr. " + PreviewActivity.this.p_getfatherNAmeG + PreviewActivity.this.p_getlastNameG + " & Mrs. " + PreviewActivity.this.p_getmotherNameG + PreviewActivity.this.p_getlastNameG);
                textView11.setTextColor(Color.parseColor(PreviewActivity.this.label0_1_font_color[3]));
                AssetManager assets11 = PreviewActivity.this.getAssets();
                StringBuilder sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(PreviewActivity.this.label0_1_Font_name[3]);
                sb.append(".ttf");
                textView11.setTypeface(Typeface.createFromAsset(assets11, sb.toString()));
                textView11.setLayoutParams(layoutParams13);
                PreviewActivity.this.relative1.addView(textView11);
                if (!PreviewActivity.this.p_getgrandMothernameG.isEmpty() && !PreviewActivity.this.p_getgrandFathernameG.isEmpty()) {
                    TextView textView12 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                    layoutParams14.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._160sdp), 0, 0);
                    textView12.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    layoutParams14.addRule(14);
                    textView12.setGravity(1);
                    textView12.setText(PreviewActivity.this.p_getgrandrelation);
                    textView12.setTextColor(Color.parseColor(PreviewActivity.this.label0_1_font_color[4]));
                    AssetManager assets12 = PreviewActivity.this.getAssets();
                    textView12.setTypeface(Typeface.createFromAsset(assets12, "fonts/" + PreviewActivity.this.label0_1_Font_name[4] + ".ttf"));
                    textView12.setLayoutParams(layoutParams14);
                    PreviewActivity.this.relative1.addView(textView12);
                    TextView textView13 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                    layoutParams15.setMargins(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._62sdp), PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._175sdp), 0, 0);
                    textView13.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    layoutParams15.addRule(14);
                    textView13.setGravity(1);
                    textView13.setText("Mr. " + PreviewActivity.this.p_getgrandFathernameG + PreviewActivity.this.p_getlastNameG + " & Mrs. " + PreviewActivity.this.p_getgrandMothernameG + PreviewActivity.this.p_getlastNameG);
                    textView13.setTextColor(Color.parseColor(PreviewActivity.this.label0_1_font_color[5]));
                    AssetManager assets13 = PreviewActivity.this.getAssets();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fonts/");
                    sb2.append(PreviewActivity.this.label0_1_Font_name[5]);
                    sb2.append(".ttf");
                    textView13.setTypeface(Typeface.createFromAsset(assets13, sb2.toString()));
                    textView13.setLayoutParams(layoutParams15);
                    PreviewActivity.this.relative1.addView(textView13);
                }
                TextView textView14 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                layoutParams16.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._225sdp), 0, 0);
                textView14.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                layoutParams16.addRule(14);
                textView14.setGravity(1);
                textView14.setText(PreviewActivity.this.p_getfirstnameB);
                textView14.setTextColor(Color.parseColor(PreviewActivity.this.label0_1_font_color[6]));
                AssetManager assets14 = PreviewActivity.this.getAssets();
                textView14.setTypeface(Typeface.createFromAsset(assets14, "fonts/" + PreviewActivity.this.label0_1_Font_name[6] + ".ttf"));
                textView14.setLayoutParams(layoutParams16);
                PreviewActivity.this.relative1.addView(textView14);
                TextView textView15 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                layoutParams17.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._260sdp), 0, 0);
                textView15.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                layoutParams17.addRule(14);
                textView15.setGravity(1);
                textView15.setText(PreviewActivity.this.p_getsecondrelation);
                textView15.setTextColor(Color.parseColor(PreviewActivity.this.label0_1_font_color[7]));
                AssetManager assets15 = PreviewActivity.this.getAssets();
                textView15.setTypeface(Typeface.createFromAsset(assets15, "fonts/" + PreviewActivity.this.label0_1_Font_name[7] + ".ttf"));
                textView15.setLayoutParams(layoutParams17);
                PreviewActivity.this.relative1.addView(textView15);
                TextView textView16 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                layoutParams18.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._275sdp), 0, 0);
                layoutParams18.addRule(14);
                textView16.setGravity(1);
                textView16.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView16.setText("Mr. " + PreviewActivity.this.p_getfatherNameB + PreviewActivity.this.p_getlastNameB + " & Mrs. " + PreviewActivity.this.p_getmotherNameB + PreviewActivity.this.p_getlastNameB);
                textView16.setTextColor(Color.parseColor(PreviewActivity.this.label0_1_font_color[8]));
                AssetManager assets16 = PreviewActivity.this.getAssets();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("fonts/");
                sb3.append(PreviewActivity.this.label0_1_Font_name[8]);
                sb3.append(".ttf");
                textView16.setTypeface(Typeface.createFromAsset(assets16, sb3.toString()));
                textView16.setLayoutParams(layoutParams18);
                PreviewActivity.this.relative1.addView(textView16);
                if (!PreviewActivity.this.p_getgrandMothernameB.isEmpty() && !PreviewActivity.this.p_getgrandFatherNameB.isEmpty()) {
                    TextView textView17 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                    layoutParams19.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._300sdp), 0, 0);
                    textView17.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView17.setGravity(1);
                    textView17.setText(PreviewActivity.this.p_getsecondgrandrelation);
                    textView17.setTextColor(Color.parseColor(PreviewActivity.this.label0_1_font_color[9]));
                    AssetManager assets17 = PreviewActivity.this.getAssets();
                    textView17.setTypeface(Typeface.createFromAsset(assets17, "fonts/" + PreviewActivity.this.label0_1_Font_name[9] + ".ttf"));
                    textView17.setLayoutParams(layoutParams19);
                    PreviewActivity.this.relative1.addView(textView17);
                    TextView textView18 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams20 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                    layoutParams20.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._315sdp), 0, 0);
                    textView18.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    layoutParams20.addRule(14);
                    textView18.setGravity(1);
                    textView18.setText("Mr. " + PreviewActivity.this.p_getgrandFatherNameB + PreviewActivity.this.p_getlastNameB + " & Mrs. " + PreviewActivity.this.p_getgrandMothernameB + PreviewActivity.this.p_getlastNameB);
                    textView18.setTextColor(Color.parseColor(PreviewActivity.this.label0_1_font_color[10]));
                    AssetManager assets18 = PreviewActivity.this.getAssets();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("fonts/");
                    sb4.append(PreviewActivity.this.label0_1_Font_name[10]);
                    sb4.append(".ttf");
                    textView18.setTypeface(Typeface.createFromAsset(assets18, sb4.toString()));
                    textView18.setLayoutParams(layoutParams20);
                    PreviewActivity.this.relative1.addView(textView18);
                }
                TextView textView19 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams21 = new RelativeLayout.LayoutParams(-1, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp));
                layoutParams21.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._360sdp), 0, 0);
                textView19.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                layoutParams21.addRule(14);
                textView19.setGravity(1);
                textView19.setText(PreviewActivity.this.label0_1_Text[11]);
                textView19.setTextColor(Color.parseColor(PreviewActivity.this.label0_1_font_color[11]));
                AssetManager assets19 = PreviewActivity.this.getAssets();
                textView19.setTypeface(Typeface.createFromAsset(assets19, "fonts/" + PreviewActivity.this.label0_1_Font_name[11] + ".ttf"));
                textView19.setLayoutParams(layoutParams21);
                PreviewActivity.this.relative1.addView(textView19);
            }
            if (i == 2) {
                PreviewActivity.this.relative2 = (RelativeLayout) inflate.findViewById(R.id.rel2);
                ImageView imageView3 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity3 = PreviewActivity.this;
                previewActivity3.bmp = previewActivity3.setBgImg(R.drawable.w_0_up_img_2);
                imageView3.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams22.setMargins(0, 0, 0, 0);
                imageView3.setLayoutParams(layoutParams22);
                PreviewActivity.this.relative2.addView(imageView3, 0);
                TextView textView20 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams23 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams23.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._45sdp), 0, 0);
                textView20.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                layoutParams23.addRule(14);
                textView20.setGravity(1);
                textView20.setText(PreviewActivity.this.label0_2_Text[0]);
                textView20.setTextColor(Color.parseColor(PreviewActivity.this.label0_2_font_color[0]));
                AssetManager assets20 = PreviewActivity.this.getAssets();
                textView20.setTypeface(Typeface.createFromAsset(assets20, "fonts/" + PreviewActivity.this.label0_2_Font_name[0] + ".ttf"));
                textView20.setLayoutParams(layoutParams23);
                PreviewActivity.this.relative2.addView(textView20);
                if (PreviewActivity.this.lenear2 != null) {
                    TextView textView21 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams24.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._95sdp), 0, 0);
                    textView21.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                    layoutParams24.addRule(14);
                    textView21.setGravity(1);
                    textView21.setText(PreviewActivity.this.p_getfunctionname1);
                    textView21.setTextColor(Color.parseColor(PreviewActivity.this.label0_2_font_color[1]));
                    AssetManager assets21 = PreviewActivity.this.getAssets();
                    textView21.setTypeface(Typeface.createFromAsset(assets21, "fonts/" + PreviewActivity.this.label0_2_Font_name[1] + ".ttf"));
                    textView21.setLayoutParams(layoutParams24);
                    PreviewActivity.this.relative2.addView(textView21);
                    TextView textView22 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams25.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._140sdp), 0, 0);
                    textView22.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    layoutParams25.addRule(14);
                    textView22.setGravity(1);
                    textView22.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + "  Onwards");
                    textView22.setTextColor(Color.parseColor(PreviewActivity.this.label0_2_font_color[2]));
                    AssetManager assets22 = PreviewActivity.this.getAssets();
                    textView22.setTypeface(Typeface.createFromAsset(assets22, "fonts/" + PreviewActivity.this.label0_2_Font_name[2] + ".ttf"));
                    textView22.setLayoutParams(layoutParams25);
                    PreviewActivity.this.relative2.addView(textView22);
                    TextView textView23 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams26 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams26.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._150sdp), 0, 0);
                    textView23.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    layoutParams26.addRule(14);
                    textView23.setGravity(1);
                    textView23.setText(PreviewActivity.this.p_getvenue1);
                    textView23.setTextColor(Color.parseColor(PreviewActivity.this.label0_2_font_color[3]));
                    AssetManager assets23 = PreviewActivity.this.getAssets();
                    textView23.setTypeface(Typeface.createFromAsset(assets23, "fonts/" + PreviewActivity.this.label0_2_Font_name[3] + ".ttf"));
                    textView23.setLayoutParams(layoutParams26);
                    PreviewActivity.this.relative2.addView(textView23);
                } else {
                    TextView textView24 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams27.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._200sdp), 0, 0);
                    textView24.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                    layoutParams27.addRule(14);
                    textView24.setGravity(1);
                    textView24.setText(PreviewActivity.this.p_getfunctionname1);
                    textView24.setTextColor(Color.parseColor(PreviewActivity.this.label0_2_font_color[1]));
                    AssetManager assets24 = PreviewActivity.this.getAssets();
                    textView24.setTypeface(Typeface.createFromAsset(assets24, "fonts/" + PreviewActivity.this.label0_2_Font_name[1] + ".ttf"));
                    textView24.setLayoutParams(layoutParams27);
                    PreviewActivity.this.relative2.addView(textView24);
                    TextView textView25 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams28 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams28.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._245sdp), 0, 0);
                    textView25.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    layoutParams28.addRule(14);
                    textView25.setGravity(1);
                    textView25.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + "Onwards");
                    textView25.setTextColor(Color.parseColor(PreviewActivity.this.label0_2_font_color[2]));
                    AssetManager assets25 = PreviewActivity.this.getAssets();
                    textView25.setTypeface(Typeface.createFromAsset(assets25, "fonts/" + PreviewActivity.this.label0_2_Font_name[2] + ".ttf"));
                    textView25.setLayoutParams(layoutParams28);
                    PreviewActivity.this.relative2.addView(textView25);
                    TextView textView26 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams29 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams29.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._260sdp), 0, 0);
                    textView26.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    layoutParams29.addRule(14);
                    textView26.setGravity(1);
                    textView26.setText(PreviewActivity.this.p_getvenue1);
                    textView26.setTextColor(Color.parseColor(PreviewActivity.this.label0_2_font_color[3]));
                    AssetManager assets26 = PreviewActivity.this.getAssets();
                    textView26.setTypeface(Typeface.createFromAsset(assets26, "fonts/" + PreviewActivity.this.label0_2_Font_name[3] + ".ttf"));
                    textView26.setLayoutParams(layoutParams29);
                    PreviewActivity.this.relative2.addView(textView26);
                }
                if (PreviewActivity.this.p_getfunctionname2 != null) {
                    TextView textView27 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams30 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams30.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._200sdp), 0, 0);
                    textView27.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                    layoutParams30.addRule(14);
                    textView27.setGravity(1);
                    textView27.setText(PreviewActivity.this.p_getfunctionname2);
                    textView27.setTextColor(Color.parseColor(PreviewActivity.this.label0_2_font_color[4]));
                    AssetManager assets27 = PreviewActivity.this.getAssets();
                    textView27.setTypeface(Typeface.createFromAsset(assets27, "fonts/" + PreviewActivity.this.label0_2_Font_name[4] + ".ttf"));
                    textView27.setLayoutParams(layoutParams30);
                    PreviewActivity.this.relative2.addView(textView27);
                    TextView textView28 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams31 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams31.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._245sdp), 0, 0);
                    textView28.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    layoutParams31.addRule(14);
                    textView28.setGravity(1);
                    textView28.setText(PreviewActivity.this.p_getdate2 + ", " + PreviewActivity.this.p_gettime2 + "Onwards");
                    textView28.setTextColor(Color.parseColor(PreviewActivity.this.label0_2_font_color[5]));
                    AssetManager assets28 = PreviewActivity.this.getAssets();
                    textView28.setTypeface(Typeface.createFromAsset(assets28, "fonts/" + PreviewActivity.this.label0_2_Font_name[5] + ".ttf"));
                    textView28.setLayoutParams(layoutParams31);
                    PreviewActivity.this.relative2.addView(textView28);
                    TextView textView29 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams32 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams32.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._260sdp), 0, 0);
                    textView29.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    layoutParams32.addRule(14);
                    textView29.setGravity(1);
                    textView29.setText(PreviewActivity.this.p_getvenue2);
                    textView29.setTextColor(Color.parseColor(PreviewActivity.this.label0_2_font_color[6]));
                    AssetManager assets29 = PreviewActivity.this.getAssets();
                    textView29.setTypeface(Typeface.createFromAsset(assets29, "fonts/" + PreviewActivity.this.label0_2_Font_name[6] + ".ttf"));
                    textView29.setLayoutParams(layoutParams32);
                    PreviewActivity.this.relative2.addView(textView29);
                }
                if (PreviewActivity.this.p_getfunctionname3 != null) {
                    TextView textView30 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams33 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams33.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._290sdp), 0, 0);
                    textView30.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                    layoutParams33.addRule(14);
                    textView30.setGravity(1);
                    textView30.setText(PreviewActivity.this.p_getfunctionname3);
                    textView30.setTextColor(Color.parseColor(PreviewActivity.this.label0_2_font_color[7]));
                    AssetManager assets30 = PreviewActivity.this.getAssets();
                    textView30.setTypeface(Typeface.createFromAsset(assets30, "fonts/" + PreviewActivity.this.label0_2_Font_name[7] + ".ttf"));
                    textView30.setLayoutParams(layoutParams33);
                    PreviewActivity.this.relative2.addView(textView30);
                    TextView textView31 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams34 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams34.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._335sdp), 0, 0);
                    textView31.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    layoutParams34.addRule(14);
                    textView31.setGravity(1);
                    textView31.setText(PreviewActivity.this.p_getdate3 + ", " + PreviewActivity.this.p_gettime3 + " Onwards");
                    textView31.setTextColor(Color.parseColor(PreviewActivity.this.label0_2_font_color[8]));
                    AssetManager assets31 = PreviewActivity.this.getAssets();
                    textView31.setTypeface(Typeface.createFromAsset(assets31, "fonts/" + PreviewActivity.this.label0_2_Font_name[8] + ".ttf"));
                    textView31.setLayoutParams(layoutParams34);
                    PreviewActivity.this.relative2.addView(textView31);
                    TextView textView32 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams35 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams35.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._350sdp), 0, 0);
                    textView32.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    layoutParams35.addRule(14);
                    textView32.setGravity(1);
                    textView32.setText(PreviewActivity.this.p_getvenue3);
                    textView32.setTextColor(Color.parseColor(PreviewActivity.this.label0_2_font_color[9]));
                    AssetManager assets32 = PreviewActivity.this.getAssets();
                    textView32.setTypeface(Typeface.createFromAsset(assets32, "fonts/" + PreviewActivity.this.label0_2_Font_name[9] + ".ttf"));
                    textView32.setLayoutParams(layoutParams35);
                    PreviewActivity.this.relative2.addView(textView32);
                }
            }
            if (i == 3) {
                PreviewActivity.this.relative3 = (RelativeLayout) inflate.findViewById(R.id.rel3);
                ImageView imageView4 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity4 = PreviewActivity.this;
                previewActivity4.bmp = previewActivity4.setBgImg(R.drawable.w_0_up_img_3);
                imageView4.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams36 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams36.setMargins(0, 0, 0, 0);
                imageView4.setLayoutParams(layoutParams36);
                PreviewActivity.this.relative3.addView(imageView4, 0);
                TextView textView33 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams37 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams37.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._160sdp), 0, 0);
                textView33.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                layoutParams37.addRule(14);
                textView33.setGravity(1);
                textView33.setText(PreviewActivity.this.label0_3_Text[0]);
                textView33.setTextColor(Color.parseColor(PreviewActivity.this.label0_3_font_color[0]));
                AssetManager assets33 = PreviewActivity.this.getAssets();
                textView33.setTypeface(Typeface.createFromAsset(assets33, "fonts/" + PreviewActivity.this.label0_3_Font_name[0] + ".ttf"));
                textView33.setLayoutParams(layoutParams37);
                PreviewActivity.this.relative3.addView(textView33);
                TextView textView34 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams38 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams38.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._210sdp), 0, 0);
                textView34.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                layoutParams38.addRule(14);
                textView34.setGravity(1);
                textView34.setText(PreviewActivity.this.label0_3_Text[1]);
                textView34.setTextColor(Color.parseColor(PreviewActivity.this.label0_3_font_color[1]));
                AssetManager assets34 = PreviewActivity.this.getAssets();
                textView34.setTypeface(Typeface.createFromAsset(assets34, "fonts/" + PreviewActivity.this.label0_3_Font_name[1] + ".ttf"));
                textView34.setLayoutParams(layoutParams38);
                PreviewActivity.this.relative3.addView(textView34);
                TextView textView35 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams39 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams39.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._243sdp), 0, 0);
                textView35.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                layoutParams39.addRule(14);
                textView35.setGravity(1);
                textView35.setText(PreviewActivity.this.p_getvenue_other);
                textView35.setTextColor(Color.parseColor(PreviewActivity.this.label0_3_font_color[2]));
                AssetManager assets35 = PreviewActivity.this.getAssets();
                textView35.setTypeface(Typeface.createFromAsset(assets35, "fonts/" + PreviewActivity.this.label0_3_Font_name[2] + ".ttf"));
                textView35.setLayoutParams(layoutParams39);
                PreviewActivity.this.relative3.addView(textView35);
                TextView textView36 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams40 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams40.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._270sdp), 0, 0);
                textView36.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                layoutParams40.addRule(14);
                textView36.setGravity(1);
                textView36.setText("Rsvp");
                textView36.setTextColor(Color.parseColor(PreviewActivity.this.label0_3_font_color[3]));
                AssetManager assets36 = PreviewActivity.this.getAssets();
                textView36.setTypeface(Typeface.createFromAsset(assets36, "fonts/" + PreviewActivity.this.label0_3_Font_name[3] + ".ttf"));
                textView36.setLayoutParams(layoutParams40);
                PreviewActivity.this.relative3.addView(textView36);
                TextView textView37 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams41 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams41.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._305sdp), 0, 0);
                textView37.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                layoutParams41.addRule(14);
                textView37.setGravity(1);
                textView37.setText(PreviewActivity.this.p_getRsvp);
                textView37.setTextColor(Color.parseColor(PreviewActivity.this.label0_3_font_color[4]));
                AssetManager assets37 = PreviewActivity.this.getAssets();
                textView37.setTypeface(Typeface.createFromAsset(assets37, "fonts/" + PreviewActivity.this.label0_3_Font_name[4] + ".ttf"));
                textView37.setLayoutParams(layoutParams41);
                PreviewActivity.this.relative3.addView(textView37);
                TextView textView38 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams42 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams42.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._340sdp), 0, 0);
                textView38.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                layoutParams42.addRule(14);
                textView38.setGravity(1);
                textView38.setText(PreviewActivity.this.label0_3_Text[5]);
                textView38.setTextColor(Color.parseColor(PreviewActivity.this.label0_3_font_color[5]));
                AssetManager assets38 = PreviewActivity.this.getAssets();
                textView38.setTypeface(Typeface.createFromAsset(assets38, "fonts/" + PreviewActivity.this.label0_3_Font_name[5] + ".ttf"));
                textView38.setLayoutParams(layoutParams42);
                PreviewActivity.this.relative3.addView(textView38);
                TextView textView39 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams43 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams43.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._370sdp), 0, 0);
                textView39.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                layoutParams43.addRule(14);
                textView39.setGravity(1);
                textView39.setText(PreviewActivity.this.p_getdate_other);
                textView39.setTextColor(Color.parseColor(PreviewActivity.this.label0_3_font_color[6]));
                AssetManager assets39 = PreviewActivity.this.getAssets();
                textView39.setTypeface(Typeface.createFromAsset(assets39, "fonts/" + PreviewActivity.this.label0_3_Font_name[6] + ".ttf"));
                textView39.setLayoutParams(layoutParams43);
                PreviewActivity.this.relative3.addView(textView39);
            }
            viewGroup.addView(inflate);
            return inflate;
        }

        @Override 
        public int getCount() {
            return PreviewActivity.this.layouts.length;
        }

        @Override 
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    public Bitmap setBgImg(int i) {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), i);
        this.bmp = decodeResource;
        if (decodeResource != null) {
            decodeResource.getWidth();
            this.bmp.getHeight();
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            float f = displayMetrics.widthPixels;
            this.screenWidth = f;
            this.newHeight = f;
            if (this.bmp.getWidth() != 0 && this.bmp.getHeight() != 0) {
                this.newHeight = (this.screenWidth * this.bmp.getHeight()) / this.bmp.getWidth();
            }
            Log.d("final_bmp", this.bmp.getWidth() + "," + this.bmp.getHeight());
            Log.d("final_bmp", this.screenWidth + "," + this.newHeight);
            this.bmp = Bitmap.createScaledBitmap(this.bmp, (int) this.screenWidth, (int) this.newHeight, false);
            new BitmapDrawable(getResources(), this.bmp);
        }
        return this.bmp;
    }

    
    public class MyViewPagerAdapter1 extends PagerAdapter {
        private LayoutInflater layoutInflater;

        @Override 
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public MyViewPagerAdapter1() {
        }

        @Override 
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = (LayoutInflater) PreviewActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.layoutInflater = layoutInflater;
            View inflate = layoutInflater.inflate(PreviewActivity.this.layouts[i], viewGroup, false);
            if (i == 0) {
                PreviewActivity.this.relative0 = (RelativeLayout) inflate.findViewById(R.id.rel0);
                ImageView imageView = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity = PreviewActivity.this;
                previewActivity.bmp = previewActivity.setBgImg(R.drawable.w_1_up_img_0);
                imageView.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams.setMargins(0, 0, 0, 0);
                imageView.setLayoutParams(layoutParams);
                PreviewActivity.this.relative0.addView(imageView, 0);
                TextView textView = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._80sdp), 0, 0);
                textView.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._35sdp), 0);
                textView.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                layoutParams2.addRule(14);
                textView.setGravity(1);
                textView.setText(PreviewActivity.this.label1_0_Text[0]);
                textView.setTextColor(Color.parseColor(PreviewActivity.this.label1_0_font_color[0]));
                AssetManager assets = PreviewActivity.this.getAssets();
                textView.setTypeface(Typeface.createFromAsset(assets, "fonts/" + PreviewActivity.this.label1_0_Font_name[0] + ".ttf"));
                textView.setLayoutParams(layoutParams2);
                PreviewActivity.this.relative0.addView(textView);
                TextView textView2 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._100sdp), 0, 0);
                textView2.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._35sdp), 0);
                textView2.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                layoutParams3.addRule(14);
                textView2.setGravity(1);
                textView2.setText(PreviewActivity.this.p_getfirstNameG);
                textView2.setTextColor(Color.parseColor(PreviewActivity.this.label1_0_font_color[1]));
                AssetManager assets2 = PreviewActivity.this.getAssets();
                textView2.setTypeface(Typeface.createFromAsset(assets2, "fonts/" + PreviewActivity.this.label1_0_Font_name[1] + ".ttf"));
                textView2.setLayoutParams(layoutParams3);
                PreviewActivity.this.relative0.addView(textView2);
                TextView textView3 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams4.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._140sdp), 0, 0);
                textView3.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._35sdp), 0);
                textView3.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                layoutParams4.addRule(14);
                textView3.setGravity(1);
                textView3.setText(PreviewActivity.this.label1_0_Text[2]);
                textView3.setTextColor(Color.parseColor(PreviewActivity.this.label1_0_font_color[2]));
                AssetManager assets3 = PreviewActivity.this.getAssets();
                textView3.setTypeface(Typeface.createFromAsset(assets3, "fonts/" + PreviewActivity.this.label1_0_Font_name[2] + ".ttf"));
                textView3.setLayoutParams(layoutParams4);
                PreviewActivity.this.relative0.addView(textView3);
                TextView textView4 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams5.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._180sdp), 0, 0);
                textView4.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._35sdp), 0);
                textView4.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                layoutParams5.addRule(14);
                textView4.setGravity(1);
                textView4.setText(PreviewActivity.this.p_getfirstnameB);
                textView4.setTextColor(Color.parseColor(PreviewActivity.this.label1_0_font_color[3]));
                AssetManager assets4 = PreviewActivity.this.getAssets();
                textView4.setTypeface(Typeface.createFromAsset(assets4, "fonts/" + PreviewActivity.this.label1_0_Font_name[3] + ".ttf"));
                textView4.setLayoutParams(layoutParams5);
                PreviewActivity.this.relative0.addView(textView4);
                TextView textView5 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams6.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._240sdp), 0, 0);
                textView5.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._35sdp), 0);
                textView5.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                layoutParams6.addRule(14);
                textView5.setGravity(1);
                textView5.setText("REQUEST THE HONOR OF\n    YOUR PRESENCE AT \n      THEIR MARRIAGE");
                textView5.setTextColor(Color.parseColor(PreviewActivity.this.label1_0_font_color[4]));
                AssetManager assets5 = PreviewActivity.this.getAssets();
                textView5.setTypeface(Typeface.createFromAsset(assets5, "fonts/" + PreviewActivity.this.label1_0_Font_name[4] + ".ttf"));
                textView5.setLayoutParams(layoutParams6);
                PreviewActivity.this.relative0.addView(textView5);
                TextView textView6 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams7.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._310sdp), 0, 0);
                textView6.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._35sdp), 0);
                textView6.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                layoutParams7.addRule(14);
                textView6.setGravity(1);
                textView6.setText(PreviewActivity.this.p_getdate1);
                textView6.setTextColor(Color.parseColor(PreviewActivity.this.label1_0_font_color[5]));
                AssetManager assets6 = PreviewActivity.this.getAssets();
                textView6.setTypeface(Typeface.createFromAsset(assets6, "fonts/" + PreviewActivity.this.label1_0_Font_name[5] + ".ttf"));
                textView6.setLayoutParams(layoutParams7);
                PreviewActivity.this.relative0.addView(textView6);
                TextView textView7 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams8.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._340sdp), 0, 0);
                textView7.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._35sdp), 0);
                textView7.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                layoutParams8.addRule(14);
                textView7.setGravity(1);
                textView7.setText(PreviewActivity.this.label1_0_Text[6]);
                textView7.setTextColor(Color.parseColor(PreviewActivity.this.label1_0_font_color[6]));
                AssetManager assets7 = PreviewActivity.this.getAssets();
                textView7.setTypeface(Typeface.createFromAsset(assets7, "fonts/" + PreviewActivity.this.label1_0_Font_name[6] + ".ttf"));
                textView7.setLayoutParams(layoutParams8);
                PreviewActivity.this.relative0.addView(textView7);
            }
            if (i == 1) {
                PreviewActivity.this.relative1 = (RelativeLayout) inflate.findViewById(R.id.rel1);
                ImageView imageView2 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity2 = PreviewActivity.this;
                previewActivity2.bmp = previewActivity2.setBgImg(R.drawable.w_1_up_img_1);
                imageView2.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams9.setMargins(0, 0, 0, 0);
                imageView2.setLayoutParams(layoutParams9);
                PreviewActivity.this.relative1.addView(imageView2, 0);
                TextView textView8 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams10.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._55sdp), 0, 0);
                textView8.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                textView8.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                layoutParams10.addRule(14);
                textView8.setGravity(1);
                textView8.setText("-" + PreviewActivity.this.label1_1_Text[0] + "-");
                textView8.setTextColor(Color.parseColor(PreviewActivity.this.label1_1_font_color[0]));
                AssetManager assets8 = PreviewActivity.this.getAssets();
                textView8.setTypeface(Typeface.createFromAsset(assets8, "fonts/" + PreviewActivity.this.label1_1_Font_name[0] + ".ttf"));
                textView8.setLayoutParams(layoutParams10);
                PreviewActivity.this.relative1.addView(textView8);
                TextView textView9 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams11.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._95sdp), 0, 0);
                textView9.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                textView9.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                layoutParams11.addRule(14);
                textView9.setGravity(1);
                textView9.setText(PreviewActivity.this.p_getfirstNameG);
                textView9.setTextColor(Color.parseColor(PreviewActivity.this.label1_1_font_color[1]));
                AssetManager assets9 = PreviewActivity.this.getAssets();
                textView9.setTypeface(Typeface.createFromAsset(assets9, "fonts/" + PreviewActivity.this.label1_1_Font_name[1] + ".ttf"));
                textView9.setLayoutParams(layoutParams11);
                PreviewActivity.this.relative1.addView(textView9);
                TextView textView10 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams12.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._140sdp), 0, 0);
                textView10.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                textView10.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                layoutParams12.addRule(14);
                textView10.setGravity(1);
                textView10.setText(PreviewActivity.this.p_getrelation);
                textView10.setTextColor(Color.parseColor(PreviewActivity.this.label1_1_font_color[2]));
                AssetManager assets10 = PreviewActivity.this.getAssets();
                textView10.setTypeface(Typeface.createFromAsset(assets10, "fonts/" + PreviewActivity.this.label1_1_Font_name[2] + ".ttf"));
                textView10.setLayoutParams(layoutParams12);
                PreviewActivity.this.relative1.addView(textView10);
                TextView textView11 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams13.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._155sdp), 0, 0);
                textView11.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                textView11.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                layoutParams13.addRule(14);
                textView11.setGravity(1);
                textView11.setText("Mr. " + PreviewActivity.this.p_getfatherNAmeG + " " + PreviewActivity.this.p_getlastNameG + " & Mrs. " + PreviewActivity.this.p_getmotherNameG + " " + PreviewActivity.this.p_getlastNameG);
                textView11.setTextColor(Color.parseColor(PreviewActivity.this.label1_1_font_color[3]));
                AssetManager assets11 = PreviewActivity.this.getAssets();
                StringBuilder sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(PreviewActivity.this.label1_1_Font_name[3]);
                sb.append(".ttf");
                textView11.setTypeface(Typeface.createFromAsset(assets11, sb.toString()));
                textView11.setLayoutParams(layoutParams13);
                PreviewActivity.this.relative1.addView(textView11);
                if (!PreviewActivity.this.p_getgrandMothernameG.isEmpty() && !PreviewActivity.this.p_getgrandFathernameG.isEmpty()) {
                    TextView textView12 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams14.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._180sdp), 0, 0);
                    textView12.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                    textView12.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    layoutParams14.addRule(14);
                    textView12.setGravity(1);
                    textView12.setText(PreviewActivity.this.p_getgrandrelation);
                    textView12.setTextColor(Color.parseColor(PreviewActivity.this.label1_1_font_color[4]));
                    AssetManager assets12 = PreviewActivity.this.getAssets();
                    textView12.setTypeface(Typeface.createFromAsset(assets12, "fonts/" + PreviewActivity.this.label1_1_Font_name[4] + ".ttf"));
                    textView12.setLayoutParams(layoutParams14);
                    PreviewActivity.this.relative1.addView(textView12);
                    TextView textView13 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams15.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._195sdp), 0, 0);
                    textView13.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                    textView13.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    layoutParams15.addRule(14);
                    textView13.setGravity(1);
                    textView13.setText("Mr. " + PreviewActivity.this.p_getgrandFathernameG + " " + PreviewActivity.this.p_getlastNameG + " & Mrs. " + PreviewActivity.this.p_getgrandMothernameG + " " + PreviewActivity.this.p_getlastNameG);
                    textView13.setTextColor(Color.parseColor(PreviewActivity.this.label1_1_font_color[5]));
                    AssetManager assets13 = PreviewActivity.this.getAssets();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fonts/");
                    sb2.append(PreviewActivity.this.label1_1_Font_name[5]);
                    sb2.append(".ttf");
                    textView13.setTypeface(Typeface.createFromAsset(assets13, sb2.toString()));
                    textView13.setLayoutParams(layoutParams15);
                    PreviewActivity.this.relative1.addView(textView13);
                }
                TextView textView14 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams16.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._230sdp), 0, 0);
                textView14.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                textView14.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                layoutParams16.addRule(14);
                textView14.setGravity(1);
                textView14.setText(PreviewActivity.this.p_getfirstnameB);
                textView14.setTextColor(Color.parseColor(PreviewActivity.this.label1_1_font_color[6]));
                AssetManager assets14 = PreviewActivity.this.getAssets();
                textView14.setTypeface(Typeface.createFromAsset(assets14, "fonts/" + PreviewActivity.this.label1_1_Font_name[6] + ".ttf"));
                textView14.setLayoutParams(layoutParams16);
                PreviewActivity.this.relative1.addView(textView14);
                TextView textView15 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams17.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._270sdp), 0, 0);
                textView15.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                textView15.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                layoutParams17.addRule(14);
                textView15.setGravity(1);
                textView15.setText(PreviewActivity.this.p_getsecondrelation);
                textView15.setTextColor(Color.parseColor(PreviewActivity.this.label1_1_font_color[7]));
                AssetManager assets15 = PreviewActivity.this.getAssets();
                textView15.setTypeface(Typeface.createFromAsset(assets15, "fonts/" + PreviewActivity.this.label1_1_Font_name[7] + ".ttf"));
                textView15.setLayoutParams(layoutParams17);
                PreviewActivity.this.relative1.addView(textView15);
                TextView textView16 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams18.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._285sdp), 0, 0);
                textView16.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                textView16.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                layoutParams18.addRule(14);
                textView16.setGravity(1);
                textView16.setText("Mr. " + PreviewActivity.this.p_getfatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & Mrs. " + PreviewActivity.this.p_getmotherNameB + " " + PreviewActivity.this.p_getlastNameB);
                textView16.setTextColor(Color.parseColor(PreviewActivity.this.label1_1_font_color[8]));
                AssetManager assets16 = PreviewActivity.this.getAssets();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("fonts/");
                sb3.append(PreviewActivity.this.label1_1_Font_name[8]);
                sb3.append(".ttf");
                textView16.setTypeface(Typeface.createFromAsset(assets16, sb3.toString()));
                textView16.setLayoutParams(layoutParams18);
                PreviewActivity.this.relative1.addView(textView16);
                if (!PreviewActivity.this.p_getgrandMothernameB.isEmpty() && !PreviewActivity.this.p_getgrandFatherNameB.isEmpty()) {
                    TextView textView17 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams19.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._310sdp), 0, 0);
                    textView17.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                    textView17.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    layoutParams19.addRule(14);
                    textView17.setGravity(1);
                    textView17.setText(PreviewActivity.this.p_getsecondgrandrelation);
                    textView17.setTextColor(Color.parseColor(PreviewActivity.this.label1_1_font_color[9]));
                    AssetManager assets17 = PreviewActivity.this.getAssets();
                    textView17.setTypeface(Typeface.createFromAsset(assets17, "fonts/" + PreviewActivity.this.label1_1_Font_name[9] + ".ttf"));
                    textView17.setLayoutParams(layoutParams19);
                    PreviewActivity.this.relative1.addView(textView17);
                    TextView textView18 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams20 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams20.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._325sdp), 0, 0);
                    textView18.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                    textView18.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    layoutParams20.addRule(14);
                    textView18.setGravity(1);
                    textView18.setText("Mr. " + PreviewActivity.this.p_getgrandFatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & Mrs. " + PreviewActivity.this.p_getgrandMothernameB + " " + PreviewActivity.this.p_getlastNameB);
                    textView18.setTextColor(Color.parseColor(PreviewActivity.this.label1_1_font_color[10]));
                    AssetManager assets18 = PreviewActivity.this.getAssets();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("fonts/");
                    sb4.append(PreviewActivity.this.label1_1_Font_name[10]);
                    sb4.append(".ttf");
                    textView18.setTypeface(Typeface.createFromAsset(assets18, sb4.toString()));
                    textView18.setLayoutParams(layoutParams20);
                    PreviewActivity.this.relative1.addView(textView18);
                }
                TextView textView19 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams21 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams21.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._360sdp), 0, 0);
                textView19.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                textView19.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                layoutParams21.addRule(14);
                textView19.setGravity(1);
                textView19.setText(PreviewActivity.this.label1_1_Text[11]);
                textView19.setTextColor(Color.parseColor(PreviewActivity.this.label1_1_font_color[11]));
                AssetManager assets19 = PreviewActivity.this.getAssets();
                textView19.setTypeface(Typeface.createFromAsset(assets19, "fonts/" + PreviewActivity.this.label1_1_Font_name[11] + ".ttf"));
                textView19.setLayoutParams(layoutParams21);
                PreviewActivity.this.relative1.addView(textView19);
            }
            if (i == 2) {
                PreviewActivity.this.relative2 = (RelativeLayout) inflate.findViewById(R.id.rel2);
                ImageView imageView3 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity3 = PreviewActivity.this;
                previewActivity3.bmp = previewActivity3.setBgImg(R.drawable.w_1_up_img_2);
                imageView3.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams22.setMargins(0, 0, 0, 0);
                imageView3.setLayoutParams(layoutParams22);
                PreviewActivity.this.relative2.addView(imageView3, 0);
                TextView textView20 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams23 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams23.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._55sdp), 0, 0);
                textView20.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                textView20.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                layoutParams23.addRule(14);
                textView20.setGravity(1);
                textView20.setText("-" + PreviewActivity.this.label1_2_Text[0] + "-");
                textView20.setTextColor(Color.parseColor(PreviewActivity.this.label1_2_font_color[0]));
                AssetManager assets20 = PreviewActivity.this.getAssets();
                textView20.setTypeface(Typeface.createFromAsset(assets20, "fonts/" + PreviewActivity.this.label1_2_Font_name[0] + ".ttf"));
                textView20.setLayoutParams(layoutParams23);
                PreviewActivity.this.relative2.addView(textView20);
                if (PreviewActivity.this.lenear2 != null) {
                    TextView textView21 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams24.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._95sdp), 0, 0);
                    textView21.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                    textView21.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    layoutParams24.addRule(14);
                    textView21.setGravity(1);
                    textView21.setText(PreviewActivity.this.p_getfunctionname1);
                    textView21.setTextColor(Color.parseColor(PreviewActivity.this.label1_2_font_color[1]));
                    AssetManager assets21 = PreviewActivity.this.getAssets();
                    textView21.setTypeface(Typeface.createFromAsset(assets21, "fonts/" + PreviewActivity.this.label1_2_Font_name[1] + ".ttf"));
                    textView21.setLayoutParams(layoutParams24);
                    PreviewActivity.this.relative2.addView(textView21);
                    TextView textView22 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams25.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._135sdp), 0, 0);
                    textView22.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                    textView22.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    layoutParams25.addRule(14);
                    textView22.setGravity(1);
                    textView22.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView22.setTextColor(Color.parseColor(PreviewActivity.this.label1_2_font_color[2]));
                    AssetManager assets22 = PreviewActivity.this.getAssets();
                    textView22.setTypeface(Typeface.createFromAsset(assets22, "fonts/" + PreviewActivity.this.label1_2_Font_name[2] + ".ttf"));
                    textView22.setLayoutParams(layoutParams25);
                    PreviewActivity.this.relative2.addView(textView22);
                    TextView textView23 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams26 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams26.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._145sdp), 0, 0);
                    textView23.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                    textView23.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    layoutParams26.addRule(14);
                    textView23.setGravity(1);
                    textView23.setText(PreviewActivity.this.p_getvenue1);
                    textView23.setTextColor(Color.parseColor(PreviewActivity.this.label1_2_font_color[3]));
                    AssetManager assets23 = PreviewActivity.this.getAssets();
                    textView23.setTypeface(Typeface.createFromAsset(assets23, "fonts/" + PreviewActivity.this.label1_2_Font_name[3] + ".ttf"));
                    textView23.setLayoutParams(layoutParams26);
                    PreviewActivity.this.relative2.addView(textView23);
                } else {
                    TextView textView24 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams27.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._200sdp), 0, 0);
                    textView24.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                    textView24.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    layoutParams27.addRule(14);
                    textView24.setGravity(1);
                    textView24.setText(PreviewActivity.this.p_getfunctionname1);
                    textView24.setTextColor(Color.parseColor(PreviewActivity.this.label1_2_font_color[1]));
                    AssetManager assets24 = PreviewActivity.this.getAssets();
                    textView24.setTypeface(Typeface.createFromAsset(assets24, "fonts/" + PreviewActivity.this.label1_2_Font_name[1] + ".ttf"));
                    textView24.setLayoutParams(layoutParams27);
                    PreviewActivity.this.relative2.addView(textView24);
                    TextView textView25 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams28 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams28.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._245sdp), 0, 0);
                    textView25.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                    textView25.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    layoutParams28.addRule(14);
                    textView25.setGravity(1);
                    textView25.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView25.setTextColor(Color.parseColor(PreviewActivity.this.label1_2_font_color[2]));
                    AssetManager assets25 = PreviewActivity.this.getAssets();
                    textView25.setTypeface(Typeface.createFromAsset(assets25, "fonts/" + PreviewActivity.this.label1_2_Font_name[2] + ".ttf"));
                    textView25.setLayoutParams(layoutParams28);
                    PreviewActivity.this.relative2.addView(textView25);
                    TextView textView26 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams29 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams29.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._255sdp), 0, 0);
                    textView26.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                    textView26.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    layoutParams29.addRule(14);
                    textView26.setGravity(1);
                    textView26.setText(PreviewActivity.this.p_getvenue1);
                    textView26.setTextColor(Color.parseColor(PreviewActivity.this.label1_2_font_color[3]));
                    AssetManager assets26 = PreviewActivity.this.getAssets();
                    textView26.setTypeface(Typeface.createFromAsset(assets26, "fonts/" + PreviewActivity.this.label1_2_Font_name[3] + ".ttf"));
                    textView26.setLayoutParams(layoutParams29);
                    PreviewActivity.this.relative2.addView(textView26);
                }
                if (PreviewActivity.this.p_getfunctionname2 != null) {
                    TextView textView27 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams30 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams30.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._200sdp), 0, 0);
                    textView27.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                    textView27.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    layoutParams30.addRule(14);
                    textView27.setGravity(1);
                    textView27.setText(PreviewActivity.this.p_getfunctionname2);
                    textView27.setTextColor(Color.parseColor(PreviewActivity.this.label1_2_font_color[4]));
                    AssetManager assets27 = PreviewActivity.this.getAssets();
                    textView27.setTypeface(Typeface.createFromAsset(assets27, "fonts/" + PreviewActivity.this.label1_2_Font_name[4] + ".ttf"));
                    textView27.setLayoutParams(layoutParams30);
                    PreviewActivity.this.relative2.addView(textView27);
                    TextView textView28 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams31 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams31.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._245sdp), 0, 0);
                    textView28.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                    textView28.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    layoutParams31.addRule(14);
                    textView28.setGravity(1);
                    textView28.setText(PreviewActivity.this.p_getdate2 + ", " + PreviewActivity.this.p_gettime2 + " Onwards");
                    textView28.setTextColor(Color.parseColor(PreviewActivity.this.label1_2_font_color[5]));
                    AssetManager assets28 = PreviewActivity.this.getAssets();
                    textView28.setTypeface(Typeface.createFromAsset(assets28, "fonts/" + PreviewActivity.this.label1_2_Font_name[5] + ".ttf"));
                    textView28.setLayoutParams(layoutParams31);
                    PreviewActivity.this.relative2.addView(textView28);
                    TextView textView29 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams32 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams32.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._255sdp), 0, 0);
                    textView29.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                    textView29.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    layoutParams32.addRule(14);
                    textView29.setGravity(1);
                    textView29.setText(PreviewActivity.this.p_getvenue2);
                    textView29.setTextColor(Color.parseColor(PreviewActivity.this.label1_2_font_color[6]));
                    AssetManager assets29 = PreviewActivity.this.getAssets();
                    textView29.setTypeface(Typeface.createFromAsset(assets29, "fonts/" + PreviewActivity.this.label1_2_Font_name[6] + ".ttf"));
                    textView29.setLayoutParams(layoutParams32);
                    PreviewActivity.this.relative2.addView(textView29);
                }
                if (PreviewActivity.this.p_getfunctionname3 != null) {
                    TextView textView30 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams33 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams33.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._310sdp), 0, 0);
                    textView30.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                    textView30.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    layoutParams33.addRule(14);
                    textView30.setGravity(1);
                    textView30.setText(PreviewActivity.this.p_getfunctionname3);
                    textView30.setTextColor(Color.parseColor(PreviewActivity.this.label1_2_font_color[7]));
                    AssetManager assets30 = PreviewActivity.this.getAssets();
                    textView30.setTypeface(Typeface.createFromAsset(assets30, "fonts/" + PreviewActivity.this.label1_2_Font_name[7] + ".ttf"));
                    textView30.setLayoutParams(layoutParams33);
                    PreviewActivity.this.relative2.addView(textView30);
                    TextView textView31 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams34 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams34.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._350sdp), 0, 0);
                    textView31.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                    textView31.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    layoutParams34.addRule(14);
                    textView31.setGravity(1);
                    textView31.setText(PreviewActivity.this.p_getdate3 + ", " + PreviewActivity.this.p_gettime3 + " Onwards");
                    textView31.setTextColor(Color.parseColor(PreviewActivity.this.label1_2_font_color[8]));
                    AssetManager assets31 = PreviewActivity.this.getAssets();
                    textView31.setTypeface(Typeface.createFromAsset(assets31, "fonts/" + PreviewActivity.this.label1_2_Font_name[8] + ".ttf"));
                    textView31.setLayoutParams(layoutParams34);
                    PreviewActivity.this.relative2.addView(textView31);
                    TextView textView32 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams35 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams35.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._360sdp), 0, 0);
                    textView32.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                    textView32.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    layoutParams35.addRule(14);
                    textView32.setGravity(1);
                    textView32.setText(PreviewActivity.this.p_getvenue3);
                    textView32.setTextColor(Color.parseColor(PreviewActivity.this.label1_2_font_color[9]));
                    AssetManager assets32 = PreviewActivity.this.getAssets();
                    textView32.setTypeface(Typeface.createFromAsset(assets32, "fonts/" + PreviewActivity.this.label1_2_Font_name[9] + ".ttf"));
                    textView32.setLayoutParams(layoutParams35);
                    PreviewActivity.this.relative2.addView(textView32);
                }
            }
            if (i == 3) {
                PreviewActivity.this.relative3 = (RelativeLayout) inflate.findViewById(R.id.rel3);
                ImageView imageView4 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity4 = PreviewActivity.this;
                previewActivity4.bmp = previewActivity4.setBgImg(R.drawable.w_1_up_img_3);
                imageView4.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams36 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams36.setMargins(0, 0, 0, 0);
                imageView4.setLayoutParams(layoutParams36);
                PreviewActivity.this.relative3.addView(imageView4, 0);
                TextView textView33 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams37 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams37.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._70sdp), 0, 0);
                textView33.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                textView33.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                layoutParams37.addRule(14);
                textView33.setGravity(1);
                textView33.setText(PreviewActivity.this.label1_3_Text[0]);
                textView33.setTextColor(Color.parseColor(PreviewActivity.this.label1_3_font_color[0]));
                AssetManager assets33 = PreviewActivity.this.getAssets();
                textView33.setTypeface(Typeface.createFromAsset(assets33, "fonts/" + PreviewActivity.this.label1_3_Font_name[0] + ".ttf"));
                textView33.setLayoutParams(layoutParams37);
                PreviewActivity.this.relative3.addView(textView33);
                TextView textView34 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams38 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams38.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._115sdp), 0, 0);
                textView34.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                textView34.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                layoutParams38.addRule(14);
                textView34.setGravity(1);
                textView34.setText(PreviewActivity.this.p_getvenue_other);
                textView34.setTextColor(Color.parseColor(PreviewActivity.this.label1_3_font_color[1]));
                AssetManager assets34 = PreviewActivity.this.getAssets();
                textView34.setTypeface(Typeface.createFromAsset(assets34, "fonts/" + PreviewActivity.this.label1_3_Font_name[1] + ".ttf"));
                textView34.setLayoutParams(layoutParams38);
                PreviewActivity.this.relative3.addView(textView34);
                TextView textView35 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams39 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams39.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._155sdp), 0, 0);
                textView35.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                textView35.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                layoutParams39.addRule(14);
                textView35.setGravity(1);
                textView35.setText("Rsvp");
                textView35.setTextColor(Color.parseColor(PreviewActivity.this.label1_3_font_color[2]));
                AssetManager assets35 = PreviewActivity.this.getAssets();
                textView35.setTypeface(Typeface.createFromAsset(assets35, "fonts/" + PreviewActivity.this.label1_3_Font_name[2] + ".ttf"));
                textView35.setLayoutParams(layoutParams39);
                PreviewActivity.this.relative3.addView(textView35);
                TextView textView36 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams40 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams40.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._205sdp), 0, 0);
                textView36.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                textView36.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                layoutParams40.addRule(14);
                textView36.setGravity(1);
                textView36.setText(PreviewActivity.this.p_getRsvp);
                textView36.setTextColor(Color.parseColor(PreviewActivity.this.label1_3_font_color[3]));
                AssetManager assets36 = PreviewActivity.this.getAssets();
                textView36.setTypeface(Typeface.createFromAsset(assets36, "fonts/" + PreviewActivity.this.label1_3_Font_name[3] + ".ttf"));
                textView36.setLayoutParams(layoutParams40);
                PreviewActivity.this.relative3.addView(textView36);
                TextView textView37 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams41 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams41.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._250sdp), 0, 0);
                textView37.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0);
                textView37.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._13sdp));
                textView37.setGravity(1);
                textView37.setText("Thank You");
                textView37.setTextColor(Color.parseColor(PreviewActivity.this.label1_3_font_color[2]));
                AssetManager assets37 = PreviewActivity.this.getAssets();
                textView37.setTypeface(Typeface.createFromAsset(assets37, "fonts/" + PreviewActivity.this.label1_3_Font_name[2] + ".ttf"));
                textView37.setLayoutParams(layoutParams41);
                PreviewActivity.this.relative3.addView(textView37);
                TextView textView38 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams42 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams42.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._335sdp), 0, 0);
                textView38.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp), 0);
                textView38.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                layoutParams42.addRule(14);
                textView38.setGravity(1);
                textView38.setText(PreviewActivity.this.label1_3_Text[4]);
                textView38.setTextColor(Color.parseColor(PreviewActivity.this.label1_3_font_color[4]));
                AssetManager assets38 = PreviewActivity.this.getAssets();
                textView38.setTypeface(Typeface.createFromAsset(assets38, "fonts/" + PreviewActivity.this.label1_3_Font_name[4] + ".ttf"));
                textView38.setLayoutParams(layoutParams42);
                PreviewActivity.this.relative3.addView(textView38);
                TextView textView39 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams43 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams43.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._360sdp), 0, 0);
                textView39.setPadding(0, 0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp), 0);
                textView39.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                layoutParams43.addRule(14);
                textView39.setGravity(1);
                textView39.setText(PreviewActivity.this.p_getdate_other);
                textView39.setTextColor(Color.parseColor(PreviewActivity.this.label1_3_font_color[5]));
                AssetManager assets39 = PreviewActivity.this.getAssets();
                textView39.setTypeface(Typeface.createFromAsset(assets39, "fonts/" + PreviewActivity.this.label1_3_Font_name[5] + ".ttf"));
                textView39.setLayoutParams(layoutParams43);
                PreviewActivity.this.relative3.addView(textView39);
            }
            viewGroup.addView(inflate);
            return inflate;
        }

        @Override 
        public int getCount() {
            return PreviewActivity.this.layouts.length;
        }

        @Override 
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    
    public class MyViewPagerAdapter2 extends PagerAdapter {
        private LayoutInflater layoutInflater;

        @Override 
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public MyViewPagerAdapter2() {
        }

        @Override 
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = (LayoutInflater) PreviewActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.layoutInflater = layoutInflater;
            View inflate = layoutInflater.inflate(PreviewActivity.this.layouts[i], viewGroup, false);
            if (i == 0) {
                PreviewActivity.this.relative0 = (RelativeLayout) inflate.findViewById(R.id.rel0);
                ImageView imageView = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity = PreviewActivity.this;
                previewActivity.bmp = previewActivity.setBgImg(R.drawable.w_2_up_img_0);
                imageView.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams.setMargins(0, 0, 0, 0);
                imageView.setLayoutParams(layoutParams);
                PreviewActivity.this.relative0.addView(imageView, 0);
                TextView textView = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._140sdp), 0, 0);
                textView.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                layoutParams2.addRule(14);
                textView.setGravity(1);
                textView.setText(PreviewActivity.this.label2_0_Text[0]);
                textView.setLetterSpacing(0.3f);
                textView.setAllCaps(true);
                textView.setTextColor(Color.parseColor(PreviewActivity.this.label2_0_font_color[0]));
                AssetManager assets = PreviewActivity.this.getAssets();
                textView.setTypeface(Typeface.createFromAsset(assets, "fonts/" + PreviewActivity.this.label2_0_Font_name[0] + ".ttf"));
                textView.setLayoutParams(layoutParams2);
                PreviewActivity.this.relative0.addView(textView);
                TextView textView2 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._155sdp), 0, 0);
                textView2.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                layoutParams3.addRule(14);
                textView2.setGravity(1);
                textView2.setAllCaps(true);
                textView2.setText(PreviewActivity.this.p_getfirstNameG);
                textView2.setTextColor(Color.parseColor(PreviewActivity.this.label2_0_font_color[1]));
                AssetManager assets2 = PreviewActivity.this.getAssets();
                textView2.setTypeface(Typeface.createFromAsset(assets2, "fonts/" + PreviewActivity.this.label2_0_Font_name[1] + ".ttf"));
                textView2.setLayoutParams(layoutParams3);
                PreviewActivity.this.relative0.addView(textView2);
                TextView textView3 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams4.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._190sdp), 0, 0);
                textView3.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                layoutParams4.addRule(14);
                textView3.setGravity(1);
                textView3.setText(PreviewActivity.this.label2_0_Text[2]);
                textView3.setTextColor(Color.parseColor(PreviewActivity.this.label2_0_font_color[2]));
                AssetManager assets3 = PreviewActivity.this.getAssets();
                Typeface createFromAsset = Typeface.createFromAsset(assets3, "fonts/" + PreviewActivity.this.label2_0_Font_name[2] + ".ttf");
                textView3.setTypeface(Typeface.DEFAULT_BOLD);
                textView3.setTypeface(createFromAsset);
                textView3.setLayoutParams(layoutParams4);
                PreviewActivity.this.relative0.addView(textView3);
                TextView textView4 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams5.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._220sdp), 0, 0);
                textView4.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                layoutParams5.addRule(14);
                textView4.setGravity(1);
                textView4.setAllCaps(true);
                textView4.setText(PreviewActivity.this.p_getfirstnameB);
                textView4.setTextColor(Color.parseColor(PreviewActivity.this.label2_0_font_color[3]));
                AssetManager assets4 = PreviewActivity.this.getAssets();
                textView4.setTypeface(Typeface.createFromAsset(assets4, "fonts/" + PreviewActivity.this.label2_0_Font_name[3] + ".ttf"));
                textView4.setLayoutParams(layoutParams5);
                PreviewActivity.this.relative0.addView(textView4);
                TextView textView5 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams6.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._260sdp), 0, 0);
                textView5.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                layoutParams6.addRule(14);
                textView5.setGravity(1);
                textView5.setAllCaps(true);
                textView.setLetterSpacing(0.1f);
                textView5.setText(PreviewActivity.this.p_getdate1);
                textView5.setTextColor(Color.parseColor(PreviewActivity.this.label2_0_font_color[4]));
                AssetManager assets5 = PreviewActivity.this.getAssets();
                textView5.setTypeface(Typeface.createFromAsset(assets5, "fonts/" + PreviewActivity.this.label2_0_Font_name[4] + ".ttf"));
                textView5.setLayoutParams(layoutParams6);
                PreviewActivity.this.relative0.addView(textView5);
            }
            if (i == 1) {
                PreviewActivity.this.relative1 = (RelativeLayout) inflate.findViewById(R.id.rel1);
                ImageView imageView2 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity2 = PreviewActivity.this;
                previewActivity2.bmp = previewActivity2.setBgImg(R.drawable.w_2_up_img_1);
                imageView2.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams7.setMargins(0, 0, 0, 0);
                imageView2.setLayoutParams(layoutParams7);
                PreviewActivity.this.relative1.addView(imageView2, 0);
                TextView textView6 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams8.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._20sdp), 0, 0);
                textView6.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView6.setGravity(1);
                textView6.setText(PreviewActivity.this.label2_1_Text[0]);
                textView6.setTextColor(Color.parseColor(PreviewActivity.this.label2_1_font_color[0]));
                AssetManager assets6 = PreviewActivity.this.getAssets();
                textView6.setTypeface(Typeface.createFromAsset(assets6, "fonts/" + PreviewActivity.this.label2_1_Font_name[0] + ".ttf"));
                textView6.setLayoutParams(layoutParams8);
                PreviewActivity.this.relative1.addView(textView6);
                TextView textView7 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams9.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._80sdp), 0, 0);
                textView7.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView7.setGravity(1);
                textView7.setAllCaps(true);
                textView7.setText(PreviewActivity.this.p_getfirstNameG);
                textView7.setTextColor(Color.parseColor(PreviewActivity.this.label2_1_font_color[1]));
                AssetManager assets7 = PreviewActivity.this.getAssets();
                textView7.setTypeface(Typeface.createFromAsset(assets7, "fonts/" + PreviewActivity.this.label2_1_Font_name[1] + ".ttf"));
                textView7.setLayoutParams(layoutParams9);
                PreviewActivity.this.relative1.addView(textView7);
                TextView textView8 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams10.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._120sdp), 0, 0);
                textView8.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView8.setGravity(1);
                textView8.setText(PreviewActivity.this.p_getrelation);
                textView8.setTextColor(Color.parseColor(PreviewActivity.this.label2_1_font_color[2]));
                AssetManager assets8 = PreviewActivity.this.getAssets();
                textView8.setTypeface(Typeface.createFromAsset(assets8, "fonts/" + PreviewActivity.this.label2_1_Font_name[2] + ".ttf"));
                textView8.setLayoutParams(layoutParams10);
                PreviewActivity.this.relative1.addView(textView8);
                TextView textView9 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams11.setMargins(3, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._135sdp), 0, 0);
                textView9.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView9.setGravity(1);
                textView9.setText("Mr. " + PreviewActivity.this.p_getfatherNAmeG + PreviewActivity.this.p_getlastNameG + " & Mrs. " + PreviewActivity.this.p_getmotherNameG + PreviewActivity.this.p_getlastNameG);
                textView9.setTextColor(Color.parseColor(PreviewActivity.this.label2_1_font_color[3]));
                AssetManager assets9 = PreviewActivity.this.getAssets();
                StringBuilder sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(PreviewActivity.this.label2_1_Font_name[3]);
                sb.append(".ttf");
                textView9.setTypeface(Typeface.createFromAsset(assets9, sb.toString()));
                textView9.setLayoutParams(layoutParams11);
                PreviewActivity.this.relative1.addView(textView9);
                if (!PreviewActivity.this.p_getgrandMothernameG.isEmpty() && !PreviewActivity.this.p_getgrandFathernameG.isEmpty()) {
                    TextView textView10 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams12.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._170sdp), 0, 0);
                    textView10.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView10.setGravity(1);
                    textView10.setText(PreviewActivity.this.p_getgrandrelation);
                    textView10.setTextColor(Color.parseColor(PreviewActivity.this.label2_1_font_color[4]));
                    AssetManager assets10 = PreviewActivity.this.getAssets();
                    textView10.setTypeface(Typeface.createFromAsset(assets10, "fonts/" + PreviewActivity.this.label2_1_Font_name[4] + ".ttf"));
                    textView10.setLayoutParams(layoutParams12);
                    PreviewActivity.this.relative1.addView(textView10);
                    TextView textView11 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams13.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._185sdp), 0, 0);
                    textView11.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView11.setGravity(1);
                    textView11.setText("Mr. " + PreviewActivity.this.p_getgrandFathernameG + PreviewActivity.this.p_getlastNameG + " & Mrs. " + PreviewActivity.this.p_getgrandMothernameG + PreviewActivity.this.p_getlastNameG);
                    textView11.setTextColor(Color.parseColor(PreviewActivity.this.label2_1_font_color[5]));
                    AssetManager assets11 = PreviewActivity.this.getAssets();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fonts/");
                    sb2.append(PreviewActivity.this.label2_1_Font_name[5]);
                    sb2.append(".ttf");
                    textView11.setTypeface(Typeface.createFromAsset(assets11, sb2.toString()));
                    textView11.setLayoutParams(layoutParams13);
                    PreviewActivity.this.relative1.addView(textView11);
                }
                TextView textView12 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams14.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._235sdp), 0, 0);
                textView12.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView12.setGravity(1);
                textView12.setAllCaps(true);
                textView12.setText(PreviewActivity.this.p_getfirstnameB);
                textView12.setTextColor(Color.parseColor(PreviewActivity.this.label2_1_font_color[6]));
                AssetManager assets12 = PreviewActivity.this.getAssets();
                textView12.setTypeface(Typeface.createFromAsset(assets12, "fonts/" + PreviewActivity.this.label2_1_Font_name[6] + ".ttf"));
                textView12.setLayoutParams(layoutParams14);
                PreviewActivity.this.relative1.addView(textView12);
                TextView textView13 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams15.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._285sdp), 0, 0);
                textView13.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView13.setGravity(1);
                textView13.setText(PreviewActivity.this.p_getsecondrelation);
                textView13.setTextColor(Color.parseColor(PreviewActivity.this.label2_1_font_color[7]));
                AssetManager assets13 = PreviewActivity.this.getAssets();
                textView13.setTypeface(Typeface.createFromAsset(assets13, "fonts/" + PreviewActivity.this.label2_1_Font_name[7] + ".ttf"));
                textView13.setLayoutParams(layoutParams15);
                PreviewActivity.this.relative1.addView(textView13);
                TextView textView14 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams16.setMargins(3, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._300sdp), 0, 0);
                textView14.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView14.setGravity(1);
                textView14.setText("Mr. " + PreviewActivity.this.p_getfatherNameB + PreviewActivity.this.p_getlastNameB + " & Mrs. " + PreviewActivity.this.p_getmotherNameB + PreviewActivity.this.p_getlastNameB);
                textView14.setTextColor(Color.parseColor(PreviewActivity.this.label2_1_font_color[8]));
                AssetManager assets14 = PreviewActivity.this.getAssets();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("fonts/");
                sb3.append(PreviewActivity.this.label2_1_Font_name[8]);
                sb3.append(".ttf");
                textView14.setTypeface(Typeface.createFromAsset(assets14, sb3.toString()));
                textView14.setLayoutParams(layoutParams16);
                PreviewActivity.this.relative1.addView(textView14);
                if (!PreviewActivity.this.p_getgrandMothernameB.isEmpty() && !PreviewActivity.this.p_getgrandFatherNameB.isEmpty()) {
                    TextView textView15 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams17.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._330sdp), 0, 0);
                    textView15.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    layoutParams17.addRule(14);
                    textView15.setGravity(1);
                    textView15.setText(PreviewActivity.this.p_getsecondgrandrelation);
                    textView15.setTextColor(Color.parseColor(PreviewActivity.this.label2_1_font_color[9]));
                    AssetManager assets15 = PreviewActivity.this.getAssets();
                    textView15.setTypeface(Typeface.createFromAsset(assets15, "fonts/" + PreviewActivity.this.label2_1_Font_name[9] + ".ttf"));
                    textView15.setLayoutParams(layoutParams17);
                    PreviewActivity.this.relative1.addView(textView15);
                    TextView textView16 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams18.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._345sdp), 0, 0);
                    textView16.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView16.setGravity(1);
                    textView16.setText("Mr. " + PreviewActivity.this.p_getgrandFathernameG + PreviewActivity.this.p_getlastNameG + " & Mrs. " + PreviewActivity.this.p_getgrandMothernameG + PreviewActivity.this.p_getlastNameG);
                    textView16.setTextColor(Color.parseColor(PreviewActivity.this.label2_1_font_color[10]));
                    AssetManager assets16 = PreviewActivity.this.getAssets();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("fonts/");
                    sb4.append(PreviewActivity.this.label2_1_Font_name[10]);
                    sb4.append(".ttf");
                    textView16.setTypeface(Typeface.createFromAsset(assets16, sb4.toString()));
                    textView16.setLayoutParams(layoutParams18);
                    PreviewActivity.this.relative1.addView(textView16);
                }
                TextView textView17 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams19.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._385sdp), 0, 0);
                textView17.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView17.setGravity(1);
                textView17.setText(PreviewActivity.this.label2_1_Text[11]);
                textView17.setTextColor(Color.parseColor(PreviewActivity.this.label2_1_font_color[11]));
                AssetManager assets17 = PreviewActivity.this.getAssets();
                textView17.setTypeface(Typeface.createFromAsset(assets17, "fonts/" + PreviewActivity.this.label2_1_Font_name[11] + ".ttf"));
                textView17.setLayoutParams(layoutParams19);
                PreviewActivity.this.relative1.addView(textView17);
            }
            if (i == 2) {
                PreviewActivity.this.relative2 = (RelativeLayout) inflate.findViewById(R.id.rel2);
                ImageView imageView3 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity3 = PreviewActivity.this;
                previewActivity3.bmp = previewActivity3.setBgImg(R.drawable.w_2_up_img_2);
                imageView3.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams20.setMargins(0, 0, 0, 0);
                imageView3.setLayoutParams(layoutParams20);
                PreviewActivity.this.relative2.addView(imageView3, 0);
                TextView textView18 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams21 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams21.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._20sdp), 0, 0);
                textView18.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView18.setGravity(1);
                textView18.setText(PreviewActivity.this.label2_2_Text[0]);
                textView18.setTypeface(Typeface.DEFAULT_BOLD);
                textView18.setTextColor(Color.parseColor(PreviewActivity.this.label2_2_font_color[0]));
                AssetManager assets18 = PreviewActivity.this.getAssets();
                textView18.setTypeface(Typeface.createFromAsset(assets18, "fonts/" + PreviewActivity.this.label2_2_Font_name[0] + ".ttf"));
                textView18.setLayoutParams(layoutParams21);
                PreviewActivity.this.relative2.addView(textView18);
                if (PreviewActivity.this.lenear2 != null) {
                    TextView textView19 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams22.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._90sdp), 0, 0);
                    textView19.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._7sdp));
                    textView19.setGravity(1);
                    textView19.setText(PreviewActivity.this.p_getfunctionname1);
                    textView19.setTextColor(Color.parseColor(PreviewActivity.this.label2_2_font_color[1]));
                    AssetManager assets19 = PreviewActivity.this.getAssets();
                    textView19.setTypeface(Typeface.createFromAsset(assets19, "fonts/" + PreviewActivity.this.label2_2_Font_name[1] + ".ttf"));
                    textView19.setLayoutParams(layoutParams22);
                    PreviewActivity.this.relative2.addView(textView19);
                    TextView textView20 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams23 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams23.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._130sdp), 0, 0);
                    textView20.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView20.setGravity(1);
                    textView20.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView20.setTextColor(Color.parseColor(PreviewActivity.this.label2_2_font_color[2]));
                    AssetManager assets20 = PreviewActivity.this.getAssets();
                    textView20.setTypeface(Typeface.createFromAsset(assets20, "fonts/" + PreviewActivity.this.label2_2_Font_name[2] + ".ttf"));
                    textView20.setLayoutParams(layoutParams23);
                    PreviewActivity.this.relative2.addView(textView20);
                    TextView textView21 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams24.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._145sdp), 0, 0);
                    textView21.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView21.setGravity(1);
                    textView21.setText(PreviewActivity.this.p_getvenue1);
                    textView21.setTextColor(Color.parseColor(PreviewActivity.this.label2_2_font_color[3]));
                    AssetManager assets21 = PreviewActivity.this.getAssets();
                    textView21.setTypeface(Typeface.createFromAsset(assets21, "fonts/" + PreviewActivity.this.label2_2_Font_name[3] + ".ttf"));
                    textView21.setLayoutParams(layoutParams24);
                    PreviewActivity.this.relative2.addView(textView21);
                } else {
                    TextView textView22 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams25.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._195sdp), 0, 0);
                    textView22.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._7sdp));
                    textView22.setGravity(1);
                    textView22.setText(PreviewActivity.this.p_getfunctionname1);
                    textView22.setTextColor(Color.parseColor(PreviewActivity.this.label2_2_font_color[1]));
                    AssetManager assets22 = PreviewActivity.this.getAssets();
                    textView22.setTypeface(Typeface.createFromAsset(assets22, "fonts/" + PreviewActivity.this.label2_2_Font_name[1] + ".ttf"));
                    textView22.setLayoutParams(layoutParams25);
                    PreviewActivity.this.relative2.addView(textView22);
                    TextView textView23 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams26 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams26.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._235sdp), 0, 0);
                    textView23.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView23.setGravity(1);
                    textView23.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView23.setTextColor(Color.parseColor(PreviewActivity.this.label2_2_font_color[2]));
                    AssetManager assets23 = PreviewActivity.this.getAssets();
                    textView23.setTypeface(Typeface.createFromAsset(assets23, "fonts/" + PreviewActivity.this.label2_2_Font_name[2] + ".ttf"));
                    textView23.setLayoutParams(layoutParams26);
                    PreviewActivity.this.relative2.addView(textView23);
                    TextView textView24 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams27.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._250sdp), 0, 0);
                    textView24.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView24.setGravity(1);
                    textView24.setText(PreviewActivity.this.p_getvenue1);
                    textView24.setTextColor(Color.parseColor(PreviewActivity.this.label2_2_font_color[3]));
                    AssetManager assets24 = PreviewActivity.this.getAssets();
                    textView24.setTypeface(Typeface.createFromAsset(assets24, "fonts/" + PreviewActivity.this.label2_2_Font_name[3] + ".ttf"));
                    textView24.setLayoutParams(layoutParams27);
                    PreviewActivity.this.relative2.addView(textView24);
                }
                if (PreviewActivity.this.p_getfunctionname2 != null) {
                    TextView textView25 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams28 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams28.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._195sdp), 0, 0);
                    textView25.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._7sdp));
                    textView25.setGravity(1);
                    textView25.setText(PreviewActivity.this.p_getfunctionname2);
                    textView25.setTextColor(Color.parseColor(PreviewActivity.this.label2_2_font_color[4]));
                    AssetManager assets25 = PreviewActivity.this.getAssets();
                    textView25.setTypeface(Typeface.createFromAsset(assets25, "fonts/" + PreviewActivity.this.label2_2_Font_name[4] + ".ttf"));
                    textView25.setLayoutParams(layoutParams28);
                    PreviewActivity.this.relative2.addView(textView25);
                    TextView textView26 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams29 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams29.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._235sdp), 0, 0);
                    textView26.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView26.setGravity(1);
                    textView26.setText(PreviewActivity.this.p_getdate2 + ", " + PreviewActivity.this.p_gettime2 + " Onwards");
                    textView26.setTextColor(Color.parseColor(PreviewActivity.this.label2_2_font_color[5]));
                    AssetManager assets26 = PreviewActivity.this.getAssets();
                    textView26.setTypeface(Typeface.createFromAsset(assets26, "fonts/" + PreviewActivity.this.label2_2_Font_name[5] + ".ttf"));
                    textView26.setLayoutParams(layoutParams29);
                    PreviewActivity.this.relative2.addView(textView26);
                    TextView textView27 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams30 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams30.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._250sdp), 0, 0);
                    textView27.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView27.setGravity(1);
                    textView27.setText(PreviewActivity.this.p_getvenue2);
                    textView27.setTextColor(Color.parseColor(PreviewActivity.this.label2_2_font_color[6]));
                    AssetManager assets27 = PreviewActivity.this.getAssets();
                    textView27.setTypeface(Typeface.createFromAsset(assets27, "fonts/" + PreviewActivity.this.label2_2_Font_name[6] + ".ttf"));
                    textView27.setLayoutParams(layoutParams30);
                    PreviewActivity.this.relative2.addView(textView27);
                }
                if (PreviewActivity.this.p_getfunctionname3 != null) {
                    TextView textView28 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams31 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams31.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._290sdp), 0, 0);
                    textView28.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._7sdp));
                    textView28.setGravity(1);
                    textView28.setText(PreviewActivity.this.p_getfunctionname3);
                    textView28.setTextColor(Color.parseColor(PreviewActivity.this.label2_2_font_color[7]));
                    AssetManager assets28 = PreviewActivity.this.getAssets();
                    textView28.setTypeface(Typeface.createFromAsset(assets28, "fonts/" + PreviewActivity.this.label2_2_Font_name[7] + ".ttf"));
                    textView28.setLayoutParams(layoutParams31);
                    PreviewActivity.this.relative2.addView(textView28);
                    TextView textView29 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams32 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams32.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._330sdp), 0, 0);
                    textView29.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView29.setGravity(1);
                    textView29.setText(PreviewActivity.this.p_getdate3 + ", " + PreviewActivity.this.p_gettime3 + " Onwards");
                    textView29.setTextColor(Color.parseColor(PreviewActivity.this.label2_2_font_color[8]));
                    AssetManager assets29 = PreviewActivity.this.getAssets();
                    textView29.setTypeface(Typeface.createFromAsset(assets29, "fonts/" + PreviewActivity.this.label2_2_Font_name[8] + ".ttf"));
                    textView29.setLayoutParams(layoutParams32);
                    PreviewActivity.this.relative2.addView(textView29);
                    TextView textView30 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams33 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams33.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._345sdp), 0, 0);
                    textView30.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView30.setGravity(1);
                    textView30.setText(PreviewActivity.this.p_getvenue3);
                    textView30.setTextColor(Color.parseColor(PreviewActivity.this.label2_2_font_color[9]));
                    AssetManager assets30 = PreviewActivity.this.getAssets();
                    textView30.setTypeface(Typeface.createFromAsset(assets30, "fonts/" + PreviewActivity.this.label2_2_Font_name[9] + ".ttf"));
                    textView30.setLayoutParams(layoutParams33);
                    PreviewActivity.this.relative2.addView(textView30);
                }
            }
            if (i == 3) {
                PreviewActivity.this.relative3 = (RelativeLayout) inflate.findViewById(R.id.rel3);
                ImageView imageView4 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity4 = PreviewActivity.this;
                previewActivity4.bmp = previewActivity4.setBgImg(R.drawable.w_2_up_img_3);
                imageView4.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams34 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams34.setMargins(0, 0, 0, 0);
                imageView4.setLayoutParams(layoutParams34);
                PreviewActivity.this.relative3.addView(imageView4, 0);
                TextView textView31 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams35 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams35.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._155sdp), 0, 0);
                textView31.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                textView31.setGravity(1);
                textView31.setText(PreviewActivity.this.label2_3_Text[0]);
                textView31.setAllCaps(true);
                textView31.setTextColor(Color.parseColor(PreviewActivity.this.label2_3_font_color[0]));
                AssetManager assets31 = PreviewActivity.this.getAssets();
                textView31.setTypeface(Typeface.createFromAsset(assets31, "fonts/" + PreviewActivity.this.label2_3_Font_name[0] + ".ttf"));
                textView31.setLayoutParams(layoutParams35);
                PreviewActivity.this.relative3.addView(textView31);
                TextView textView32 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams36 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams36.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._215sdp), 0, 0);
                textView32.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView32.setGravity(1);
                textView32.setText(PreviewActivity.this.label2_3_Text[1]);
                textView32.setAllCaps(true);
                textView32.setTextColor(Color.parseColor(PreviewActivity.this.label2_3_font_color[1]));
                AssetManager assets32 = PreviewActivity.this.getAssets();
                textView32.setTypeface(Typeface.createFromAsset(assets32, "fonts/" + PreviewActivity.this.label2_3_Font_name[1] + ".ttf"));
                textView32.setLayoutParams(layoutParams36);
                PreviewActivity.this.relative3.addView(textView32);
                TextView textView33 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams37 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams37.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._245sdp), 0, 0);
                textView33.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView33.setGravity(1);
                textView33.setText(PreviewActivity.this.p_getvenue_other);
                textView33.setTextColor(Color.parseColor(PreviewActivity.this.label2_3_font_color[2]));
                AssetManager assets33 = PreviewActivity.this.getAssets();
                textView33.setTypeface(Typeface.createFromAsset(assets33, "fonts/" + PreviewActivity.this.label2_3_Font_name[2] + ".ttf"));
                textView33.setLayoutParams(layoutParams37);
                PreviewActivity.this.relative3.addView(textView33);
                TextView textView34 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams38 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams38.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._275sdp), 0, 0);
                textView34.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView34.setGravity(1);
                textView34.setText("Rsvp");
                textView34.setAllCaps(true);
                textView34.setTextColor(Color.parseColor(PreviewActivity.this.label2_3_font_color[3]));
                AssetManager assets34 = PreviewActivity.this.getAssets();
                textView34.setTypeface(Typeface.createFromAsset(assets34, "fonts/" + PreviewActivity.this.label2_3_Font_name[3] + ".ttf"));
                textView34.setLayoutParams(layoutParams38);
                PreviewActivity.this.relative3.addView(textView34);
                TextView textView35 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams39 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams39.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._300sdp), 0, 0);
                textView35.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView35.setGravity(1);
                textView35.setText(PreviewActivity.this.p_getRsvp);
                textView35.setTextColor(Color.parseColor(PreviewActivity.this.label2_3_font_color[4]));
                AssetManager assets35 = PreviewActivity.this.getAssets();
                textView35.setTypeface(Typeface.createFromAsset(assets35, "fonts/" + PreviewActivity.this.label2_3_Font_name[4] + ".ttf"));
                textView35.setLayoutParams(layoutParams39);
                PreviewActivity.this.relative3.addView(textView35);
                TextView textView36 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams40 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams40.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._360sdp), 0, 0);
                textView36.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                textView36.setGravity(1);
                textView36.setText(PreviewActivity.this.label2_3_Text[5]);
                textView36.setTextColor(Color.parseColor(PreviewActivity.this.label2_3_font_color[5]));
                AssetManager assets36 = PreviewActivity.this.getAssets();
                textView36.setTypeface(Typeface.createFromAsset(assets36, "fonts/" + PreviewActivity.this.label2_3_Font_name[5] + ".ttf"));
                textView36.setLayoutParams(layoutParams40);
                PreviewActivity.this.relative3.addView(textView36);
                TextView textView37 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams41 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams41.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._380sdp), 0, 0);
                textView37.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView37.setGravity(1);
                textView37.setText(PreviewActivity.this.p_getdate_other);
                textView37.setTextColor(Color.parseColor(PreviewActivity.this.label2_3_font_color[6]));
                AssetManager assets37 = PreviewActivity.this.getAssets();
                textView37.setTypeface(Typeface.createFromAsset(assets37, "fonts/" + PreviewActivity.this.label2_3_Font_name[6] + ".ttf"));
                textView37.setLayoutParams(layoutParams41);
                PreviewActivity.this.relative3.addView(textView37);
            }
            viewGroup.addView(inflate);
            return inflate;
        }

        @Override 
        public int getCount() {
            return PreviewActivity.this.layouts.length;
        }

        @Override 
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    
    public class MyViewPagerAdapter3 extends PagerAdapter {
        private LayoutInflater layoutInflater;

        @Override 
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public MyViewPagerAdapter3() {
        }

        @Override 
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = (LayoutInflater) PreviewActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.layoutInflater = layoutInflater;
            View inflate = layoutInflater.inflate(PreviewActivity.this.layouts[i], viewGroup, false);
            if (i == 0) {
                PreviewActivity.this.relative0 = (RelativeLayout) inflate.findViewById(R.id.rel0);
                ImageView imageView = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity = PreviewActivity.this;
                previewActivity.bmp = previewActivity.setBgImg(R.drawable.w_3_up_img_0);
                imageView.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams.setMargins(0, 0, 0, 0);
                imageView.setLayoutParams(layoutParams);
                PreviewActivity.this.relative0.addView(imageView, 0);
                TextView textView = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._260sdp), 0, 0);
                textView.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView.setGravity(1);
                textView.setText(PreviewActivity.this.p_getfirstNameG);
                textView.setTextColor(Color.parseColor(PreviewActivity.this.label3_0_font_color[0]));
                AssetManager assets = PreviewActivity.this.getAssets();
                textView.setTypeface(Typeface.createFromAsset(assets, "fonts/" + PreviewActivity.this.label3_0_Font_name[0] + ".ttf"));
                textView.setLayoutParams(layoutParams2);
                PreviewActivity.this.relative0.addView(textView);
                TextView textView2 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._290sdp), 0, 0);
                textView2.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView2.setGravity(1);
                textView2.setText(PreviewActivity.this.label3_0_Text[1]);
                textView2.setTextColor(Color.parseColor(PreviewActivity.this.label3_0_font_color[1]));
                AssetManager assets2 = PreviewActivity.this.getAssets();
                textView2.setTypeface(Typeface.createFromAsset(assets2, "fonts/" + PreviewActivity.this.label3_0_Font_name[1] + ".ttf"));
                textView2.setLayoutParams(layoutParams3);
                PreviewActivity.this.relative0.addView(textView2);
                TextView textView3 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams4.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._320sdp), 0, 0);
                textView3.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView3.setGravity(1);
                textView3.setText(PreviewActivity.this.p_getfirstnameB);
                textView3.setTextColor(Color.parseColor(PreviewActivity.this.label3_0_font_color[2]));
                AssetManager assets3 = PreviewActivity.this.getAssets();
                textView3.setTypeface(Typeface.createFromAsset(assets3, "fonts/" + PreviewActivity.this.label3_0_Font_name[2] + ".ttf"));
                textView3.setLayoutParams(layoutParams4);
                PreviewActivity.this.relative0.addView(textView3);
                TextView textView4 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams5.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._360sdp), 0, 0);
                textView4.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView4.setGravity(1);
                textView4.setText(PreviewActivity.this.p_getdate1);
                textView4.setTextColor(Color.parseColor(PreviewActivity.this.label3_0_font_color[3]));
                AssetManager assets4 = PreviewActivity.this.getAssets();
                textView4.setTypeface(Typeface.createFromAsset(assets4, "fonts/" + PreviewActivity.this.label3_0_Font_name[3] + ".ttf"));
                textView4.setLayoutParams(layoutParams5);
                PreviewActivity.this.relative0.addView(textView4);
                TextView textView5 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams6.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._375sdp), 0, 0);
                textView5.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView5.setGravity(1);
                textView5.setText(PreviewActivity.this.label3_0_Text[4]);
                textView5.setTextColor(Color.parseColor(PreviewActivity.this.label3_0_font_color[4]));
                AssetManager assets5 = PreviewActivity.this.getAssets();
                textView5.setTypeface(Typeface.createFromAsset(assets5, "fonts/" + PreviewActivity.this.label3_0_Font_name[4] + ".ttf"));
                textView5.setLayoutParams(layoutParams6);
                PreviewActivity.this.relative0.addView(textView5);
            }
            if (i == 1) {
                PreviewActivity.this.relative1 = (RelativeLayout) inflate.findViewById(R.id.rel1);
                ImageView imageView2 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity2 = PreviewActivity.this;
                previewActivity2.bmp = previewActivity2.setBgImg(R.drawable.w_3_up_img_1);
                imageView2.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams7.setMargins(0, 0, 0, 0);
                imageView2.setLayoutParams(layoutParams7);
                PreviewActivity.this.relative1.addView(imageView2, 0);
                TextView textView6 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams8.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp), 0, 0);
                textView6.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView6.setGravity(1);
                textView6.setText(PreviewActivity.this.label3_1_Text[0]);
                textView6.setTextColor(Color.parseColor(PreviewActivity.this.label3_1_font_color[0]));
                AssetManager assets6 = PreviewActivity.this.getAssets();
                textView6.setTypeface(Typeface.createFromAsset(assets6, "fonts/" + PreviewActivity.this.label3_1_Font_name[0] + ".ttf"));
                textView6.setLayoutParams(layoutParams8);
                PreviewActivity.this.relative1.addView(textView6);
                TextView textView7 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams9.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._90sdp), 0, 0);
                textView7.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView7.setGravity(1);
                textView7.setText(PreviewActivity.this.p_getfirstNameG);
                textView7.setTextColor(Color.parseColor(PreviewActivity.this.label3_1_font_color[1]));
                AssetManager assets7 = PreviewActivity.this.getAssets();
                textView7.setTypeface(Typeface.createFromAsset(assets7, "fonts/" + PreviewActivity.this.label3_1_Font_name[1] + ".ttf"));
                textView7.setLayoutParams(layoutParams9);
                PreviewActivity.this.relative1.addView(textView7);
                TextView textView8 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams10.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._130sdp), 0, 0);
                textView8.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView8.setGravity(1);
                textView8.setText(PreviewActivity.this.p_getrelation);
                textView8.setTextColor(Color.parseColor(PreviewActivity.this.label3_1_font_color[2]));
                AssetManager assets8 = PreviewActivity.this.getAssets();
                textView8.setTypeface(Typeface.createFromAsset(assets8, "fonts/" + PreviewActivity.this.label3_1_Font_name[2] + ".ttf"));
                textView8.setLayoutParams(layoutParams10);
                PreviewActivity.this.relative1.addView(textView8);
                TextView textView9 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams11.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._145sdp), 0, 0);
                textView9.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView9.setGravity(1);
                textView9.setText("Mr. " + PreviewActivity.this.p_getfatherNAmeG + " " + PreviewActivity.this.p_getlastNameG + " & " + PreviewActivity.this.p_getmotherNameG + " " + PreviewActivity.this.p_getlastNameG);
                textView9.setTextColor(Color.parseColor(PreviewActivity.this.label3_1_font_color[2]));
                AssetManager assets9 = PreviewActivity.this.getAssets();
                StringBuilder sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(PreviewActivity.this.label3_1_Font_name[2]);
                sb.append(".ttf");
                textView9.setTypeface(Typeface.createFromAsset(assets9, sb.toString()));
                textView9.setLayoutParams(layoutParams11);
                PreviewActivity.this.relative1.addView(textView9);
                if (!PreviewActivity.this.p_getgrandMothernameG.isEmpty() && !PreviewActivity.this.p_getgrandFathernameG.isEmpty()) {
                    TextView textView10 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams12.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._170sdp), 0, 0);
                    textView10.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView10.setGravity(1);
                    textView10.setText(PreviewActivity.this.p_getgrandrelation);
                    textView10.setTextColor(Color.parseColor(PreviewActivity.this.label3_1_font_color[4]));
                    AssetManager assets10 = PreviewActivity.this.getAssets();
                    textView10.setTypeface(Typeface.createFromAsset(assets10, "fonts/" + PreviewActivity.this.label3_1_Font_name[4] + ".ttf"));
                    textView10.setLayoutParams(layoutParams12);
                    PreviewActivity.this.relative1.addView(textView10);
                    TextView textView11 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams13.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._185sdp), 0, 0);
                    textView11.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView11.setGravity(1);
                    textView11.setText("Mr. " + PreviewActivity.this.p_getgrandFathernameG + " " + PreviewActivity.this.p_getlastNameB + " &  MRS. " + PreviewActivity.this.p_getgrandMothernameG + " " + PreviewActivity.this.p_getlastNameB);
                    textView11.setTextColor(Color.parseColor(PreviewActivity.this.label3_1_font_color[5]));
                    AssetManager assets11 = PreviewActivity.this.getAssets();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fonts/");
                    sb2.append(PreviewActivity.this.label3_1_Font_name[5]);
                    sb2.append(".ttf");
                    textView11.setTypeface(Typeface.createFromAsset(assets11, sb2.toString()));
                    textView11.setLayoutParams(layoutParams13);
                    PreviewActivity.this.relative1.addView(textView11);
                }
                TextView textView12 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams14.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._230sdp), 0, 0);
                textView12.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView12.setGravity(1);
                textView12.setText(PreviewActivity.this.p_getfirstnameB);
                textView12.setTextColor(Color.parseColor(PreviewActivity.this.label3_1_font_color[6]));
                AssetManager assets12 = PreviewActivity.this.getAssets();
                textView12.setTypeface(Typeface.createFromAsset(assets12, "fonts/" + PreviewActivity.this.label3_1_Font_name[6] + ".ttf"));
                textView12.setLayoutParams(layoutParams14);
                PreviewActivity.this.relative1.addView(textView12);
                TextView textView13 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams15.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._270sdp), 0, 0);
                textView13.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView13.setGravity(1);
                textView13.setText(PreviewActivity.this.p_getsecondrelation);
                textView13.setTextColor(Color.parseColor(PreviewActivity.this.label3_1_font_color[7]));
                AssetManager assets13 = PreviewActivity.this.getAssets();
                textView13.setTypeface(Typeface.createFromAsset(assets13, "fonts/" + PreviewActivity.this.label3_1_Font_name[7] + ".ttf"));
                textView13.setLayoutParams(layoutParams15);
                PreviewActivity.this.relative1.addView(textView13);
                TextView textView14 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams16.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._285sdp), 0, 0);
                textView14.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView14.setGravity(1);
                textView14.setText("Mr. " + PreviewActivity.this.p_getfatherNameB + " " + PreviewActivity.this.p_getlastNameB + " &  MRS. " + PreviewActivity.this.p_getmotherNameB);
                textView14.setTextColor(Color.parseColor(PreviewActivity.this.label3_1_font_color[8]));
                AssetManager assets14 = PreviewActivity.this.getAssets();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("fonts/");
                sb3.append(PreviewActivity.this.label3_1_Font_name[8]);
                sb3.append(".ttf");
                textView14.setTypeface(Typeface.createFromAsset(assets14, sb3.toString()));
                textView14.setLayoutParams(layoutParams16);
                PreviewActivity.this.relative1.addView(textView14);
                if (!PreviewActivity.this.p_getgrandMothernameB.isEmpty() && !PreviewActivity.this.p_getgrandFatherNameB.isEmpty()) {
                    TextView textView15 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams17.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._315sdp), 0, 0);
                    textView15.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView15.setGravity(1);
                    textView15.setText(PreviewActivity.this.p_getsecondgrandrelation);
                    textView15.setTextColor(Color.parseColor(PreviewActivity.this.label3_1_font_color[9]));
                    AssetManager assets15 = PreviewActivity.this.getAssets();
                    textView15.setTypeface(Typeface.createFromAsset(assets15, "fonts/" + PreviewActivity.this.label3_1_Font_name[9] + ".ttf"));
                    textView15.setLayoutParams(layoutParams17);
                    PreviewActivity.this.relative1.addView(textView15);
                    TextView textView16 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams18.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._330sdp), 0, 0);
                    textView16.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView16.setGravity(1);
                    textView16.setText("Mr. " + PreviewActivity.this.p_getgrandFatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & MRS. " + PreviewActivity.this.p_getgrandMothernameB + " " + PreviewActivity.this.p_getlastNameB);
                    textView16.setTextColor(Color.parseColor(PreviewActivity.this.label3_1_font_color[10]));
                    AssetManager assets16 = PreviewActivity.this.getAssets();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("fonts/");
                    sb4.append(PreviewActivity.this.label3_1_Font_name[10]);
                    sb4.append(".ttf");
                    textView16.setTypeface(Typeface.createFromAsset(assets16, sb4.toString()));
                    textView16.setLayoutParams(layoutParams18);
                    PreviewActivity.this.relative1.addView(textView16);
                }
                TextView textView17 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams19.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._355sdp), 0, 0);
                textView17.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView17.setGravity(1);
                textView17.setText(PreviewActivity.this.label3_1_Text[11]);
                textView17.setTextColor(Color.parseColor(PreviewActivity.this.label3_1_font_color[11]));
                AssetManager assets17 = PreviewActivity.this.getAssets();
                textView17.setTypeface(Typeface.createFromAsset(assets17, "fonts/" + PreviewActivity.this.label3_1_Font_name[11] + ".ttf"));
                textView17.setLayoutParams(layoutParams19);
                PreviewActivity.this.relative1.addView(textView17);
            }
            if (i == 2) {
                PreviewActivity.this.relative2 = (RelativeLayout) inflate.findViewById(R.id.rel2);
                ImageView imageView3 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity3 = PreviewActivity.this;
                previewActivity3.bmp = previewActivity3.setBgImg(R.drawable.w_3_up_img_2);
                imageView3.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams20.setMargins(0, 0, 0, 0);
                imageView3.setLayoutParams(layoutParams20);
                PreviewActivity.this.relative2.addView(imageView3, 0);
                TextView textView18 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams21 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams21.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._45sdp), 0, 0);
                textView18.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView18.setGravity(1);
                textView18.setText(PreviewActivity.this.label3_2_Text[0]);
                textView18.setTextColor(Color.parseColor(PreviewActivity.this.label3_2_font_color[0]));
                AssetManager assets18 = PreviewActivity.this.getAssets();
                textView18.setTypeface(Typeface.createFromAsset(assets18, "fonts/" + PreviewActivity.this.label3_2_Font_name[0] + ".ttf"));
                textView18.setLayoutParams(layoutParams21);
                PreviewActivity.this.relative2.addView(textView18);
                if (PreviewActivity.this.lenear2 != null) {
                    TextView textView19 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams22.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._100sdp), 0, 0);
                    textView19.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                    textView19.setGravity(1);
                    textView19.setText(PreviewActivity.this.p_getfunctionname1);
                    textView19.setTextColor(Color.parseColor(PreviewActivity.this.label3_2_font_color[1]));
                    AssetManager assets19 = PreviewActivity.this.getAssets();
                    textView19.setTypeface(Typeface.createFromAsset(assets19, "fonts/" + PreviewActivity.this.label3_2_Font_name[1] + ".ttf"));
                    textView19.setLayoutParams(layoutParams22);
                    PreviewActivity.this.relative2.addView(textView19);
                    TextView textView20 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams23 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams23.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._135sdp), 0, 0);
                    textView20.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView20.setGravity(1);
                    textView20.setAllCaps(true);
                    textView20.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView20.setTextColor(Color.parseColor(PreviewActivity.this.label3_2_font_color[2]));
                    AssetManager assets20 = PreviewActivity.this.getAssets();
                    textView20.setTypeface(Typeface.createFromAsset(assets20, "fonts/" + PreviewActivity.this.label3_2_Font_name[2] + ".ttf"));
                    textView20.setLayoutParams(layoutParams23);
                    PreviewActivity.this.relative2.addView(textView20);
                    TextView textView21 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams24.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._150sdp), 0, 0);
                    textView21.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView21.setGravity(1);
                    textView21.setAllCaps(true);
                    textView21.setText(PreviewActivity.this.p_getvenue1);
                    textView21.setTextColor(Color.parseColor(PreviewActivity.this.label3_2_font_color[3]));
                    AssetManager assets21 = PreviewActivity.this.getAssets();
                    textView21.setTypeface(Typeface.createFromAsset(assets21, "fonts/" + PreviewActivity.this.label3_2_Font_name[3] + ".ttf"));
                    textView21.setLayoutParams(layoutParams24);
                    PreviewActivity.this.relative2.addView(textView21);
                } else {
                    TextView textView22 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams25.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._195sdp), 0, 0);
                    textView22.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                    textView22.setGravity(1);
                    textView22.setText(PreviewActivity.this.p_getfunctionname1);
                    textView22.setTextColor(Color.parseColor(PreviewActivity.this.label3_2_font_color[1]));
                    AssetManager assets22 = PreviewActivity.this.getAssets();
                    textView22.setTypeface(Typeface.createFromAsset(assets22, "fonts/" + PreviewActivity.this.label3_2_Font_name[1] + ".ttf"));
                    textView22.setLayoutParams(layoutParams25);
                    PreviewActivity.this.relative2.addView(textView22);
                    TextView textView23 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams26 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams26.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._230sdp), 0, 0);
                    textView23.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView23.setGravity(1);
                    textView23.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView23.setAllCaps(true);
                    textView23.setTextColor(Color.parseColor(PreviewActivity.this.label3_2_font_color[2]));
                    AssetManager assets23 = PreviewActivity.this.getAssets();
                    textView23.setTypeface(Typeface.createFromAsset(assets23, "fonts/" + PreviewActivity.this.label3_2_Font_name[2] + ".ttf"));
                    textView23.setLayoutParams(layoutParams26);
                    PreviewActivity.this.relative2.addView(textView23);
                    TextView textView24 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams27.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._245sdp), 0, 0);
                    textView24.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView24.setGravity(1);
                    textView24.setText(PreviewActivity.this.p_getvenue1);
                    textView24.setAllCaps(true);
                    textView24.setTextColor(Color.parseColor(PreviewActivity.this.label3_2_font_color[3]));
                    AssetManager assets24 = PreviewActivity.this.getAssets();
                    textView24.setTypeface(Typeface.createFromAsset(assets24, "fonts/" + PreviewActivity.this.label3_2_Font_name[3] + ".ttf"));
                    textView24.setLayoutParams(layoutParams27);
                    PreviewActivity.this.relative2.addView(textView24);
                }
                if (PreviewActivity.this.p_getfunctionname2 != null) {
                    TextView textView25 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams28 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams28.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._195sdp), 0, 0);
                    textView25.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                    textView25.setGravity(1);
                    textView25.setText(PreviewActivity.this.p_getfunctionname2);
                    textView25.setTextColor(Color.parseColor(PreviewActivity.this.label3_2_font_color[4]));
                    AssetManager assets25 = PreviewActivity.this.getAssets();
                    textView25.setTypeface(Typeface.createFromAsset(assets25, "fonts/" + PreviewActivity.this.label3_2_Font_name[4] + ".ttf"));
                    textView25.setLayoutParams(layoutParams28);
                    PreviewActivity.this.relative2.addView(textView25);
                    TextView textView26 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams29 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams29.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._230sdp), 0, 0);
                    textView26.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView26.setGravity(1);
                    textView26.setText(PreviewActivity.this.p_getdate2 + ", " + PreviewActivity.this.p_gettime2 + " Onwards");
                    textView26.setAllCaps(true);
                    textView26.setTextColor(Color.parseColor(PreviewActivity.this.label3_2_font_color[5]));
                    AssetManager assets26 = PreviewActivity.this.getAssets();
                    textView26.setTypeface(Typeface.createFromAsset(assets26, "fonts/" + PreviewActivity.this.label3_2_Font_name[5] + ".ttf"));
                    textView26.setLayoutParams(layoutParams29);
                    PreviewActivity.this.relative2.addView(textView26);
                    TextView textView27 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams30 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams30.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._245sdp), 0, 0);
                    textView27.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView27.setGravity(1);
                    textView27.setText(PreviewActivity.this.p_getvenue2);
                    textView27.setAllCaps(true);
                    textView27.setTextColor(Color.parseColor(PreviewActivity.this.label3_2_font_color[6]));
                    AssetManager assets27 = PreviewActivity.this.getAssets();
                    textView27.setTypeface(Typeface.createFromAsset(assets27, "fonts/" + PreviewActivity.this.label3_2_Font_name[6] + ".ttf"));
                    textView27.setLayoutParams(layoutParams30);
                    PreviewActivity.this.relative2.addView(textView27);
                }
                if (PreviewActivity.this.p_getfunctionname3 != null) {
                    TextView textView28 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams31 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams31.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._295sdp), 0, 0);
                    textView28.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                    textView28.setGravity(1);
                    textView28.setText(PreviewActivity.this.p_getfunctionname3);
                    textView28.setTextColor(Color.parseColor(PreviewActivity.this.label3_2_font_color[7]));
                    AssetManager assets28 = PreviewActivity.this.getAssets();
                    textView28.setTypeface(Typeface.createFromAsset(assets28, "fonts/" + PreviewActivity.this.label3_2_Font_name[7] + ".ttf"));
                    textView28.setLayoutParams(layoutParams31);
                    PreviewActivity.this.relative2.addView(textView28);
                    TextView textView29 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams32 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams32.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._330sdp), 0, 0);
                    textView29.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView29.setGravity(1);
                    textView29.setText(PreviewActivity.this.p_getdate3 + ", " + PreviewActivity.this.p_gettime3 + " Onwards");
                    textView29.setAllCaps(true);
                    textView29.setTextColor(Color.parseColor(PreviewActivity.this.label3_2_font_color[8]));
                    AssetManager assets29 = PreviewActivity.this.getAssets();
                    textView29.setTypeface(Typeface.createFromAsset(assets29, "fonts/" + PreviewActivity.this.label3_2_Font_name[8] + ".ttf"));
                    textView29.setLayoutParams(layoutParams32);
                    PreviewActivity.this.relative2.addView(textView29);
                    TextView textView30 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams33 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams33.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._345sdp), 0, 0);
                    textView30.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView30.setGravity(1);
                    textView30.setText(PreviewActivity.this.p_getvenue3);
                    textView30.setAllCaps(true);
                    textView30.setTextColor(Color.parseColor(PreviewActivity.this.label3_2_font_color[9]));
                    AssetManager assets30 = PreviewActivity.this.getAssets();
                    textView30.setTypeface(Typeface.createFromAsset(assets30, "fonts/" + PreviewActivity.this.label3_2_Font_name[9] + ".ttf"));
                    textView30.setLayoutParams(layoutParams33);
                    PreviewActivity.this.relative2.addView(textView30);
                }
            }
            if (i == 3) {
                PreviewActivity.this.relative3 = (RelativeLayout) inflate.findViewById(R.id.rel3);
                ImageView imageView4 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity4 = PreviewActivity.this;
                previewActivity4.bmp = previewActivity4.setBgImg(R.drawable.w_3_up_img_3);
                imageView4.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams34 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams34.setMargins(0, 0, 0, 0);
                imageView4.setLayoutParams(layoutParams34);
                PreviewActivity.this.relative3.addView(imageView4, 0);
                TextView textView31 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams35 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams35.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._70sdp), 0, 0);
                textView31.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView31.setGravity(1);
                textView31.setText(PreviewActivity.this.label3_3_Text[0]);
                textView31.setTextColor(Color.parseColor(PreviewActivity.this.label3_3_font_color[0]));
                AssetManager assets31 = PreviewActivity.this.getAssets();
                textView31.setTypeface(Typeface.createFromAsset(assets31, "fonts/" + PreviewActivity.this.label3_3_Font_name[0] + ".ttf"));
                textView31.setLayoutParams(layoutParams35);
                PreviewActivity.this.relative3.addView(textView31);
                TextView textView32 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams36 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams36.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._115sdp), 0, 0);
                textView32.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView32.setGravity(1);
                textView32.setText(PreviewActivity.this.p_getvenue_other);
                textView32.setAllCaps(true);
                textView32.setTextColor(Color.parseColor(PreviewActivity.this.label3_3_font_color[1]));
                AssetManager assets32 = PreviewActivity.this.getAssets();
                textView32.setTypeface(Typeface.createFromAsset(assets32, "fonts/" + PreviewActivity.this.label3_3_Font_name[1] + ".ttf"));
                textView32.setLayoutParams(layoutParams36);
                PreviewActivity.this.relative3.addView(textView32);
                TextView textView33 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams37 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams37.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._145sdp), 0, 0);
                textView33.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView33.setGravity(1);
                textView33.setText("Rsvp");
                textView33.setTextColor(Color.parseColor(PreviewActivity.this.label3_3_font_color[2]));
                AssetManager assets33 = PreviewActivity.this.getAssets();
                textView33.setTypeface(Typeface.createFromAsset(assets33, "fonts/" + PreviewActivity.this.label3_3_Font_name[2] + ".ttf"));
                textView33.setLayoutParams(layoutParams37);
                PreviewActivity.this.relative3.addView(textView33);
                TextView textView34 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams38 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams38.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._190sdp), 0, 0);
                textView34.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView34.setGravity(1);
                textView34.setText(PreviewActivity.this.p_getRsvp);
                textView34.setAllCaps(true);
                textView34.setTextColor(Color.parseColor(PreviewActivity.this.label3_3_font_color[3]));
                AssetManager assets34 = PreviewActivity.this.getAssets();
                textView34.setTypeface(Typeface.createFromAsset(assets34, "fonts/" + PreviewActivity.this.label3_3_Font_name[3] + ".ttf"));
                textView34.setLayoutParams(layoutParams38);
                PreviewActivity.this.relative3.addView(textView34);
                TextView textView35 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams39 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams39.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._310sdp), 0, 0);
                textView35.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView35.setGravity(1);
                textView35.setText(PreviewActivity.this.label3_3_Text[4]);
                textView35.setAllCaps(true);
                textView35.setTextColor(Color.parseColor(PreviewActivity.this.label3_3_font_color[4]));
                AssetManager assets35 = PreviewActivity.this.getAssets();
                textView35.setTypeface(Typeface.createFromAsset(assets35, "fonts/" + PreviewActivity.this.label3_3_Font_name[4] + ".ttf"));
                textView35.setLayoutParams(layoutParams39);
                PreviewActivity.this.relative3.addView(textView35);
                TextView textView36 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams40 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams40.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._340sdp), 0, 0);
                textView36.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                textView36.setGravity(1);
                textView36.setText(PreviewActivity.this.p_getdate_other);
                textView36.setTextColor(Color.parseColor(PreviewActivity.this.label3_3_font_color[5]));
                AssetManager assets36 = PreviewActivity.this.getAssets();
                textView36.setTypeface(Typeface.createFromAsset(assets36, "fonts/" + PreviewActivity.this.label3_3_Font_name[5] + ".ttf"));
                textView36.setLayoutParams(layoutParams40);
                PreviewActivity.this.relative3.addView(textView36);
            }
            viewGroup.addView(inflate);
            return inflate;
        }

        @Override 
        public int getCount() {
            return PreviewActivity.this.layouts.length;
        }

        @Override 
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    
    public class MyViewPagerAdapter4 extends PagerAdapter {
        private LayoutInflater layoutInflater;

        @Override 
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public MyViewPagerAdapter4() {
        }

        @Override 
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = (LayoutInflater) PreviewActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.layoutInflater = layoutInflater;
            View inflate = layoutInflater.inflate(PreviewActivity.this.layouts[i], viewGroup, false);
            if (i == 0) {
                PreviewActivity.this.relative0 = (RelativeLayout) inflate.findViewById(R.id.rel0);
                ImageView imageView = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity = PreviewActivity.this;
                previewActivity.bmp = previewActivity.setBgImg(R.drawable.w_4_up_img_0);
                imageView.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams.setMargins(0, 0, 0, 0);
                imageView.setLayoutParams(layoutParams);
                PreviewActivity.this.relative0.addView(imageView, 0);
                TextView textView = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._105sdp), 0, 0);
                textView.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView.setGravity(1);
                textView.setText(PreviewActivity.this.p_getfirstNameG);
                textView.setAllCaps(true);
                textView.setTextColor(Color.parseColor(PreviewActivity.this.label4_0_font_color[0]));
                AssetManager assets = PreviewActivity.this.getAssets();
                textView.setTypeface(Typeface.createFromAsset(assets, "fonts/" + PreviewActivity.this.label4_0_Font_name[0] + ".ttf"));
                textView.setLayoutParams(layoutParams2);
                PreviewActivity.this.relative0.addView(textView);
                TextView textView2 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._130sdp), 0, 0);
                textView2.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView2.setGravity(1);
                textView2.setText(PreviewActivity.this.label4_0_Text[1]);
                textView2.setAllCaps(true);
                textView2.setTextColor(Color.parseColor(PreviewActivity.this.label4_0_font_color[1]));
                AssetManager assets2 = PreviewActivity.this.getAssets();
                textView2.setTypeface(Typeface.createFromAsset(assets2, "fonts/" + PreviewActivity.this.label4_0_Font_name[1] + ".ttf"));
                textView2.setLayoutParams(layoutParams3);
                PreviewActivity.this.relative0.addView(textView2);
                TextView textView3 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams4.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._165sdp), 0, 0);
                textView3.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView3.setGravity(1);
                textView3.setText(PreviewActivity.this.p_getfirstnameB);
                textView3.setAllCaps(true);
                textView3.setTextColor(Color.parseColor(PreviewActivity.this.label4_0_font_color[2]));
                AssetManager assets3 = PreviewActivity.this.getAssets();
                textView3.setTypeface(Typeface.createFromAsset(assets3, "fonts/" + PreviewActivity.this.label4_0_Font_name[2] + ".ttf"));
                textView3.setLayoutParams(layoutParams4);
                PreviewActivity.this.relative0.addView(textView3);
                TextView textView4 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams5.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._245sdp), 0, 0);
                textView4.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView4.setGravity(1);
                textView4.setText("You are invited to our \n    wedding. \n Please join us with our \n family and friends.");
                textView4.setTextColor(Color.parseColor(PreviewActivity.this.label4_0_font_color[3]));
                AssetManager assets4 = PreviewActivity.this.getAssets();
                textView4.setTypeface(Typeface.createFromAsset(assets4, "fonts/" + PreviewActivity.this.label4_0_Font_name[3] + ".ttf"));
                textView4.setLayoutParams(layoutParams5);
                PreviewActivity.this.relative0.addView(textView4);
                TextView textView5 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams6.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._325sdp), 0, 0);
                textView5.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView5.setGravity(1);
                textView5.setText(PreviewActivity.this.label4_0_Text[4]);
                textView5.setAllCaps(true);
                textView5.setTextColor(Color.parseColor(PreviewActivity.this.label4_0_font_color[4]));
                AssetManager assets5 = PreviewActivity.this.getAssets();
                textView5.setTypeface(Typeface.createFromAsset(assets5, "fonts/" + PreviewActivity.this.label4_0_Font_name[4] + ".ttf"));
                textView5.setLayoutParams(layoutParams6);
                PreviewActivity.this.relative0.addView(textView5);
                TextView textView6 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams7.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._350sdp), 0, 0);
                textView6.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView6.setGravity(1);
                textView6.setText(PreviewActivity.this.p_getdate1);
                textView6.setTextColor(Color.parseColor(PreviewActivity.this.label4_0_font_color[5]));
                AssetManager assets6 = PreviewActivity.this.getAssets();
                textView6.setTypeface(Typeface.createFromAsset(assets6, "fonts/" + PreviewActivity.this.label4_0_Font_name[5] + ".ttf"));
                textView6.setLayoutParams(layoutParams7);
                PreviewActivity.this.relative0.addView(textView6);
            }
            if (i == 1) {
                PreviewActivity.this.relative1 = (RelativeLayout) inflate.findViewById(R.id.rel1);
                ImageView imageView2 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity2 = PreviewActivity.this;
                previewActivity2.bmp = previewActivity2.setBgImg(R.drawable.w_4_up_img_1);
                imageView2.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams8.setMargins(0, 0, 0, 0);
                imageView2.setLayoutParams(layoutParams8);
                PreviewActivity.this.relative1.addView(imageView2, 0);
                TextView textView7 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams9.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._60sdp), 0, 0);
                textView7.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView7.setGravity(1);
                textView7.setText(PreviewActivity.this.label4_1_Text[0]);
                textView7.setAllCaps(true);
                textView7.setTextColor(Color.parseColor(PreviewActivity.this.label4_1_font_color[0]));
                AssetManager assets7 = PreviewActivity.this.getAssets();
                textView7.setTypeface(Typeface.createFromAsset(assets7, "fonts/" + PreviewActivity.this.label4_1_Font_name[0] + ".ttf"));
                textView7.setLayoutParams(layoutParams9);
                PreviewActivity.this.relative1.addView(textView7);
                TextView textView8 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams10.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._95sdp), 0, 0);
                textView8.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView8.setGravity(1);
                textView8.setText(PreviewActivity.this.p_getfirstNameG);
                textView8.setAllCaps(true);
                textView8.setTextColor(Color.parseColor(PreviewActivity.this.label4_1_font_color[1]));
                AssetManager assets8 = PreviewActivity.this.getAssets();
                textView8.setTypeface(Typeface.createFromAsset(assets8, "fonts/" + PreviewActivity.this.label4_1_Font_name[1] + ".ttf"));
                textView8.setLayoutParams(layoutParams10);
                PreviewActivity.this.relative1.addView(textView8);
                TextView textView9 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams11.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._125sdp), 0, 0);
                textView9.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView9.setGravity(1);
                textView9.setText(PreviewActivity.this.p_getrelation);
                textView9.setTextColor(Color.parseColor(PreviewActivity.this.label4_1_font_color[2]));
                AssetManager assets9 = PreviewActivity.this.getAssets();
                textView9.setTypeface(Typeface.createFromAsset(assets9, "fonts/" + PreviewActivity.this.label4_1_Font_name[2] + ".ttf"));
                textView9.setLayoutParams(layoutParams11);
                PreviewActivity.this.relative1.addView(textView9);
                TextView textView10 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams12.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._140sdp), 0, 0);
                textView10.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView10.setGravity(1);
                textView10.setText("Mr. " + PreviewActivity.this.p_getfatherNAmeG + " " + PreviewActivity.this.p_getlastNameG + " &  MRS. " + PreviewActivity.this.p_getmotherNameG + " " + PreviewActivity.this.p_getlastNameG);
                textView10.setTextColor(Color.parseColor(PreviewActivity.this.label4_1_font_color[3]));
                AssetManager assets10 = PreviewActivity.this.getAssets();
                StringBuilder sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(PreviewActivity.this.label4_1_Font_name[3]);
                sb.append(".ttf");
                textView10.setTypeface(Typeface.createFromAsset(assets10, sb.toString()));
                textView10.setLayoutParams(layoutParams12);
                PreviewActivity.this.relative1.addView(textView10);
                if (!PreviewActivity.this.p_getgrandMothernameG.isEmpty() && !PreviewActivity.this.p_getgrandFathernameG.isEmpty()) {
                    TextView textView11 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams13.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._165sdp), 0, 0);
                    textView11.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView11.setGravity(1);
                    textView11.setText(PreviewActivity.this.p_getgrandrelation);
                    textView11.setTextColor(Color.parseColor(PreviewActivity.this.label4_1_font_color[4]));
                    AssetManager assets11 = PreviewActivity.this.getAssets();
                    textView11.setTypeface(Typeface.createFromAsset(assets11, "fonts/" + PreviewActivity.this.label4_1_Font_name[4] + ".ttf"));
                    textView11.setLayoutParams(layoutParams13);
                    PreviewActivity.this.relative1.addView(textView11);
                    TextView textView12 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams14.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._180sdp), 0, 0);
                    textView12.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView12.setGravity(1);
                    textView12.setText("Mr. " + PreviewActivity.this.p_getgrandFathernameG + " " + PreviewActivity.this.p_getlastNameG + " &  MRS. " + PreviewActivity.this.p_getgrandMothernameG + "  " + PreviewActivity.this.p_getlastNameG);
                    textView12.setTextColor(Color.parseColor(PreviewActivity.this.label4_1_font_color[5]));
                    AssetManager assets12 = PreviewActivity.this.getAssets();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fonts/");
                    sb2.append(PreviewActivity.this.label4_1_Font_name[5]);
                    sb2.append(".ttf");
                    textView12.setTypeface(Typeface.createFromAsset(assets12, sb2.toString()));
                    textView12.setLayoutParams(layoutParams14);
                    PreviewActivity.this.relative1.addView(textView12);
                }
                TextView textView13 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams15.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._220sdp), 0, 0);
                textView13.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView13.setGravity(1);
                textView13.setText(PreviewActivity.this.p_getfirstnameB);
                textView13.setAllCaps(true);
                textView13.setTextColor(Color.parseColor(PreviewActivity.this.label4_1_font_color[6]));
                AssetManager assets13 = PreviewActivity.this.getAssets();
                textView13.setTypeface(Typeface.createFromAsset(assets13, "fonts/" + PreviewActivity.this.label4_1_Font_name[6] + ".ttf"));
                textView13.setLayoutParams(layoutParams15);
                PreviewActivity.this.relative1.addView(textView13);
                TextView textView14 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams16.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._250sdp), 0, 0);
                textView14.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView14.setGravity(1);
                textView14.setText(PreviewActivity.this.p_getsecondrelation);
                textView14.setTextColor(Color.parseColor(PreviewActivity.this.label4_1_font_color[7]));
                AssetManager assets14 = PreviewActivity.this.getAssets();
                textView14.setTypeface(Typeface.createFromAsset(assets14, "fonts/" + PreviewActivity.this.label4_1_Font_name[7] + ".ttf"));
                textView14.setLayoutParams(layoutParams16);
                PreviewActivity.this.relative1.addView(textView14);
                TextView textView15 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams17.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._265sdp), 0, 0);
                textView15.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView15.setGravity(1);
                textView15.setText("Mr. " + PreviewActivity.this.p_getfirstnameB + " " + PreviewActivity.this.p_getlastNameB + " &  MRS. " + PreviewActivity.this.p_getmotherNameB + " " + PreviewActivity.this.p_getlastNameB);
                textView15.setTextColor(Color.parseColor(PreviewActivity.this.label4_1_font_color[8]));
                AssetManager assets15 = PreviewActivity.this.getAssets();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("fonts/");
                sb3.append(PreviewActivity.this.label4_1_Font_name[8]);
                sb3.append(".ttf");
                textView15.setTypeface(Typeface.createFromAsset(assets15, sb3.toString()));
                textView15.setLayoutParams(layoutParams17);
                PreviewActivity.this.relative1.addView(textView15);
                if (!PreviewActivity.this.p_getgrandMothernameB.isEmpty() && !PreviewActivity.this.p_getgrandFatherNameB.isEmpty()) {
                    TextView textView16 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams18.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._295sdp), 0, 0);
                    textView16.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView16.setGravity(1);
                    textView16.setText(PreviewActivity.this.p_getsecondgrandrelation);
                    textView16.setTextColor(Color.parseColor(PreviewActivity.this.label4_1_font_color[9]));
                    AssetManager assets16 = PreviewActivity.this.getAssets();
                    textView16.setTypeface(Typeface.createFromAsset(assets16, "fonts/" + PreviewActivity.this.label4_1_Font_name[9] + ".ttf"));
                    textView16.setLayoutParams(layoutParams18);
                    PreviewActivity.this.relative1.addView(textView16);
                    TextView textView17 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams19.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._310sdp), 0, 0);
                    textView17.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView17.setGravity(1);
                    textView17.setText("Mr. " + PreviewActivity.this.p_getgrandFatherNameB + " " + PreviewActivity.this.p_getlastNameB + " &  MRS. " + PreviewActivity.this.p_getgrandMothernameB + " " + PreviewActivity.this.p_getlastNameB);
                    textView17.setTextColor(Color.parseColor(PreviewActivity.this.label4_1_font_color[10]));
                    AssetManager assets17 = PreviewActivity.this.getAssets();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("fonts/");
                    sb4.append(PreviewActivity.this.label4_1_Font_name[10]);
                    sb4.append(".ttf");
                    textView17.setTypeface(Typeface.createFromAsset(assets17, sb4.toString()));
                    textView17.setLayoutParams(layoutParams19);
                    PreviewActivity.this.relative1.addView(textView17);
                }
                TextView textView18 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams20 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams20.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._345sdp), 0, 0);
                textView18.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView18.setGravity(1);
                textView18.setAllCaps(true);
                textView18.setText(PreviewActivity.this.label4_1_Text[11]);
                textView18.setTextColor(Color.parseColor(PreviewActivity.this.label4_1_font_color[11]));
                AssetManager assets18 = PreviewActivity.this.getAssets();
                textView18.setTypeface(Typeface.createFromAsset(assets18, "fonts/" + PreviewActivity.this.label4_1_Font_name[11] + ".ttf"));
                textView18.setLayoutParams(layoutParams20);
                PreviewActivity.this.relative1.addView(textView18);
            }
            if (i == 2) {
                PreviewActivity.this.relative2 = (RelativeLayout) inflate.findViewById(R.id.rel2);
                ImageView imageView3 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity3 = PreviewActivity.this;
                previewActivity3.bmp = previewActivity3.setBgImg(R.drawable.w_4_up_img_2);
                imageView3.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams21.setMargins(0, 0, 0, 0);
                imageView3.setLayoutParams(layoutParams21);
                PreviewActivity.this.relative2.addView(imageView3, 0);
                TextView textView19 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams22.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._75sdp), 0, 0);
                textView19.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView19.setGravity(1);
                textView19.setAllCaps(true);
                textView19.setText(PreviewActivity.this.label4_2_Text[0]);
                textView19.setTextColor(Color.parseColor(PreviewActivity.this.label4_2_font_color[0]));
                AssetManager assets19 = PreviewActivity.this.getAssets();
                textView19.setTypeface(Typeface.createFromAsset(assets19, "fonts/" + PreviewActivity.this.label4_2_Font_name[0] + ".ttf"));
                textView19.setLayoutParams(layoutParams22);
                PreviewActivity.this.relative2.addView(textView19);
                if (PreviewActivity.this.lenear2 != null) {
                    TextView textView20 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams23 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams23.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._110sdp), 0, 0);
                    textView20.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                    textView20.setGravity(1);
                    textView20.setAllCaps(true);
                    textView20.setText(PreviewActivity.this.p_getfunctionname1);
                    textView20.setTextColor(Color.parseColor(PreviewActivity.this.label4_2_font_color[1]));
                    AssetManager assets20 = PreviewActivity.this.getAssets();
                    textView20.setTypeface(Typeface.createFromAsset(assets20, "fonts/" + PreviewActivity.this.label4_2_Font_name[1] + ".ttf"));
                    textView20.setLayoutParams(layoutParams23);
                    PreviewActivity.this.relative2.addView(textView20);
                    TextView textView21 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams24.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._145sdp), 0, 0);
                    textView21.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView21.setGravity(1);
                    textView21.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + "  Onwards");
                    textView21.setTextColor(Color.parseColor(PreviewActivity.this.label4_2_font_color[2]));
                    AssetManager assets21 = PreviewActivity.this.getAssets();
                    textView21.setTypeface(Typeface.createFromAsset(assets21, "fonts/" + PreviewActivity.this.label4_2_Font_name[2] + ".ttf"));
                    textView21.setLayoutParams(layoutParams24);
                    PreviewActivity.this.relative2.addView(textView21);
                    TextView textView22 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams25.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._160sdp), 0, 0);
                    textView22.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView22.setGravity(1);
                    textView22.setText(PreviewActivity.this.p_getvenue1);
                    textView22.setTextColor(Color.parseColor(PreviewActivity.this.label4_2_font_color[3]));
                    AssetManager assets22 = PreviewActivity.this.getAssets();
                    textView22.setTypeface(Typeface.createFromAsset(assets22, "fonts/" + PreviewActivity.this.label4_2_Font_name[3] + ".ttf"));
                    textView22.setLayoutParams(layoutParams25);
                    PreviewActivity.this.relative2.addView(textView22);
                } else {
                    TextView textView23 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams26 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams26.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._200sdp), 0, 0);
                    textView23.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                    textView23.setGravity(1);
                    textView23.setText(PreviewActivity.this.p_getfunctionname1);
                    textView23.setAllCaps(true);
                    textView23.setTextColor(Color.parseColor(PreviewActivity.this.label4_2_font_color[1]));
                    AssetManager assets23 = PreviewActivity.this.getAssets();
                    textView23.setTypeface(Typeface.createFromAsset(assets23, "fonts/" + PreviewActivity.this.label4_2_Font_name[1] + ".ttf"));
                    textView23.setLayoutParams(layoutParams26);
                    PreviewActivity.this.relative2.addView(textView23);
                    TextView textView24 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams27.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._235sdp), 0, 0);
                    textView24.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView24.setGravity(1);
                    textView24.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView24.setTextColor(Color.parseColor(PreviewActivity.this.label4_2_font_color[2]));
                    AssetManager assets24 = PreviewActivity.this.getAssets();
                    textView24.setTypeface(Typeface.createFromAsset(assets24, "fonts/" + PreviewActivity.this.label4_2_Font_name[2] + ".ttf"));
                    textView24.setLayoutParams(layoutParams27);
                    PreviewActivity.this.relative2.addView(textView24);
                    TextView textView25 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams28 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams28.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._250sdp), 0, 0);
                    textView25.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView25.setGravity(1);
                    textView25.setText(PreviewActivity.this.p_getvenue1);
                    textView25.setTextColor(Color.parseColor(PreviewActivity.this.label4_2_font_color[3]));
                    AssetManager assets25 = PreviewActivity.this.getAssets();
                    textView25.setTypeface(Typeface.createFromAsset(assets25, "fonts/" + PreviewActivity.this.label4_2_Font_name[3] + ".ttf"));
                    textView25.setLayoutParams(layoutParams28);
                    PreviewActivity.this.relative2.addView(textView25);
                }
                if (PreviewActivity.this.p_getfunctionname2 != null) {
                    TextView textView26 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams29 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams29.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._200sdp), 0, 0);
                    textView26.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                    textView26.setGravity(1);
                    textView26.setText(PreviewActivity.this.p_getfunctionname2);
                    textView26.setAllCaps(true);
                    textView26.setTextColor(Color.parseColor(PreviewActivity.this.label4_2_font_color[4]));
                    AssetManager assets26 = PreviewActivity.this.getAssets();
                    textView26.setTypeface(Typeface.createFromAsset(assets26, "fonts/" + PreviewActivity.this.label4_2_Font_name[4] + ".ttf"));
                    textView26.setLayoutParams(layoutParams29);
                    PreviewActivity.this.relative2.addView(textView26);
                    TextView textView27 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams30 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams30.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._235sdp), 0, 0);
                    textView27.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView27.setGravity(1);
                    textView27.setText(PreviewActivity.this.p_getdate2 + ", " + PreviewActivity.this.p_gettime2 + " Onwards");
                    textView27.setTextColor(Color.parseColor(PreviewActivity.this.label4_2_font_color[5]));
                    AssetManager assets27 = PreviewActivity.this.getAssets();
                    textView27.setTypeface(Typeface.createFromAsset(assets27, "fonts/" + PreviewActivity.this.label4_2_Font_name[5] + ".ttf"));
                    textView27.setLayoutParams(layoutParams30);
                    PreviewActivity.this.relative2.addView(textView27);
                    TextView textView28 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams31 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams31.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._250sdp), 0, 0);
                    textView28.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView28.setGravity(1);
                    textView28.setText(PreviewActivity.this.p_getvenue2);
                    textView28.setTextColor(Color.parseColor(PreviewActivity.this.label4_2_font_color[6]));
                    AssetManager assets28 = PreviewActivity.this.getAssets();
                    textView28.setTypeface(Typeface.createFromAsset(assets28, "fonts/" + PreviewActivity.this.label4_2_Font_name[6] + ".ttf"));
                    textView28.setLayoutParams(layoutParams31);
                    PreviewActivity.this.relative2.addView(textView28);
                }
                if (PreviewActivity.this.p_getfunctionname3 != null) {
                    TextView textView29 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams32 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams32.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._290sdp), 0, 0);
                    textView29.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                    textView29.setGravity(1);
                    textView29.setText(PreviewActivity.this.p_getfunctionname3);
                    textView29.setTextColor(Color.parseColor(PreviewActivity.this.label4_2_font_color[7]));
                    AssetManager assets29 = PreviewActivity.this.getAssets();
                    textView29.setTypeface(Typeface.createFromAsset(assets29, "fonts/" + PreviewActivity.this.label4_2_Font_name[7] + ".ttf"));
                    textView29.setLayoutParams(layoutParams32);
                    PreviewActivity.this.relative2.addView(textView29);
                    TextView textView30 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams33 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams33.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._325sdp), 0, 0);
                    textView30.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView30.setGravity(1);
                    textView30.setText(PreviewActivity.this.p_getdate3 + ", " + PreviewActivity.this.p_gettime3 + " Onwards");
                    textView30.setTextColor(Color.parseColor(PreviewActivity.this.label4_2_font_color[8]));
                    AssetManager assets30 = PreviewActivity.this.getAssets();
                    textView30.setTypeface(Typeface.createFromAsset(assets30, "fonts/" + PreviewActivity.this.label4_2_Font_name[8] + ".ttf"));
                    textView30.setLayoutParams(layoutParams33);
                    PreviewActivity.this.relative2.addView(textView30);
                    TextView textView31 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams34 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams34.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._340sdp), 0, 0);
                    textView31.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView31.setGravity(1);
                    textView31.setText(PreviewActivity.this.p_getvenue3);
                    textView31.setTextColor(Color.parseColor(PreviewActivity.this.label4_2_font_color[9]));
                    AssetManager assets31 = PreviewActivity.this.getAssets();
                    textView31.setTypeface(Typeface.createFromAsset(assets31, "fonts/" + PreviewActivity.this.label4_2_Font_name[9] + ".ttf"));
                    textView31.setLayoutParams(layoutParams34);
                    PreviewActivity.this.relative2.addView(textView31);
                }
            }
            if (i == 3) {
                PreviewActivity.this.relative3 = (RelativeLayout) inflate.findViewById(R.id.rel3);
                ImageView imageView4 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity4 = PreviewActivity.this;
                previewActivity4.bmp = previewActivity4.setBgImg(R.drawable.w_4_up_img_3);
                imageView4.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams35 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams35.setMargins(0, 0, 0, 0);
                imageView4.setLayoutParams(layoutParams35);
                PreviewActivity.this.relative3.addView(imageView4, 0);
                TextView textView32 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams36 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams36.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._90sdp), 0, 0);
                textView32.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView32.setGravity(1);
                textView32.setAllCaps(true);
                textView32.setText(PreviewActivity.this.label4_3_Text[0]);
                textView32.setTextColor(Color.parseColor(PreviewActivity.this.label4_3_font_color[0]));
                AssetManager assets32 = PreviewActivity.this.getAssets();
                textView32.setTypeface(Typeface.createFromAsset(assets32, "fonts/" + PreviewActivity.this.label4_3_Font_name[0] + ".ttf"));
                textView32.setLayoutParams(layoutParams36);
                PreviewActivity.this.relative3.addView(textView32);
                TextView textView33 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams37 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams37.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._130sdp), 0, 0);
                textView33.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView33.setGravity(1);
                textView33.setText(PreviewActivity.this.p_getvenue_other);
                textView33.setTextColor(Color.parseColor(PreviewActivity.this.label4_3_font_color[1]));
                AssetManager assets33 = PreviewActivity.this.getAssets();
                textView33.setTypeface(Typeface.createFromAsset(assets33, "fonts/" + PreviewActivity.this.label4_3_Font_name[1] + ".ttf"));
                textView33.setLayoutParams(layoutParams37);
                PreviewActivity.this.relative3.addView(textView33);
                TextView textView34 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams38 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams38.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._175sdp), 0, 0);
                textView34.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView34.setGravity(1);
                textView34.setText("Rsvp");
                textView34.setAllCaps(true);
                textView34.setTextColor(Color.parseColor(PreviewActivity.this.label4_3_font_color[2]));
                AssetManager assets34 = PreviewActivity.this.getAssets();
                textView34.setTypeface(Typeface.createFromAsset(assets34, "fonts/" + PreviewActivity.this.label4_3_Font_name[2] + ".ttf"));
                textView34.setLayoutParams(layoutParams38);
                PreviewActivity.this.relative3.addView(textView34);
                TextView textView35 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams39 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams39.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._205sdp), 0, 0);
                textView35.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView35.setGravity(1);
                textView35.setText(PreviewActivity.this.p_getRsvp);
                textView35.setTextColor(Color.parseColor(PreviewActivity.this.label4_3_font_color[3]));
                AssetManager assets35 = PreviewActivity.this.getAssets();
                textView35.setTypeface(Typeface.createFromAsset(assets35, "fonts/" + PreviewActivity.this.label4_3_Font_name[3] + ".ttf"));
                textView35.setLayoutParams(layoutParams39);
                PreviewActivity.this.relative3.addView(textView35);
                TextView textView36 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams40 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams40.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._305sdp), 0, 0);
                textView36.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._7sdp));
                textView36.setGravity(1);
                textView36.setText(PreviewActivity.this.label4_3_Text[4]);
                textView36.setTextColor(Color.parseColor(PreviewActivity.this.label4_3_font_color[4]));
                AssetManager assets36 = PreviewActivity.this.getAssets();
                textView36.setTypeface(Typeface.createFromAsset(assets36, "fonts/" + PreviewActivity.this.label4_3_Font_name[4] + ".ttf"));
                textView36.setLayoutParams(layoutParams40);
                PreviewActivity.this.relative3.addView(textView36);
                TextView textView37 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams41 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams41.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._335sdp), 0, 0);
                textView37.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView37.setGravity(1);
                textView37.setText(PreviewActivity.this.p_getdate_other);
                textView37.setTextColor(Color.parseColor(PreviewActivity.this.label4_3_font_color[5]));
                AssetManager assets37 = PreviewActivity.this.getAssets();
                textView37.setTypeface(Typeface.createFromAsset(assets37, "fonts/" + PreviewActivity.this.label4_3_Font_name[5] + ".ttf"));
                textView37.setLayoutParams(layoutParams41);
                PreviewActivity.this.relative3.addView(textView37);
            }
            viewGroup.addView(inflate);
            return inflate;
        }

        @Override 
        public int getCount() {
            return PreviewActivity.this.layouts.length;
        }

        @Override 
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    
    public class MyViewPagerAdapter5 extends PagerAdapter {
        private LayoutInflater layoutInflater;

        @Override 
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public MyViewPagerAdapter5() {
        }

        @Override 
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = (LayoutInflater) PreviewActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.layoutInflater = layoutInflater;
            View inflate = layoutInflater.inflate(PreviewActivity.this.layouts[i], viewGroup, false);
            if (i == 0) {
                PreviewActivity.this.relative0 = (RelativeLayout) inflate.findViewById(R.id.rel0);
                ImageView imageView = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity = PreviewActivity.this;
                previewActivity.bmp = previewActivity.setBgImg(R.drawable.w_5_up_img_0);
                imageView.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams.setMargins(0, 0, 0, 0);
                imageView.setLayoutParams(layoutParams);
                PreviewActivity.this.relative0.addView(imageView, 0);
                TextView textView = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._45sdp), 0, 0);
                textView.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                textView.setGravity(1);
                textView.setText("together \n with their families");
                textView.setAllCaps(true);
                textView.setTextColor(Color.parseColor(PreviewActivity.this.label5_0_font_color[0]));
                AssetManager assets = PreviewActivity.this.getAssets();
                textView.setTypeface(Typeface.createFromAsset(assets, "fonts/" + PreviewActivity.this.label5_0_Font_name[0] + ".ttf"));
                textView.setLayoutParams(layoutParams2);
                PreviewActivity.this.relative0.addView(textView);
                TextView textView2 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._100sdp), 0, 0);
                textView2.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView2.setGravity(1);
                textView2.setText(PreviewActivity.this.p_getfirstNameG);
                textView2.setTextColor(Color.parseColor(PreviewActivity.this.label5_0_font_color[1]));
                AssetManager assets2 = PreviewActivity.this.getAssets();
                textView2.setTypeface(Typeface.createFromAsset(assets2, "fonts/" + PreviewActivity.this.label5_0_Font_name[1] + ".ttf"));
                textView2.setLayoutParams(layoutParams3);
                PreviewActivity.this.relative0.addView(textView2);
                TextView textView3 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams4.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._140sdp), 0, 0);
                textView3.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView3.setGravity(1);
                textView3.setText(PreviewActivity.this.label5_0_Text[2]);
                textView3.setTextColor(Color.parseColor(PreviewActivity.this.label5_0_font_color[2]));
                AssetManager assets3 = PreviewActivity.this.getAssets();
                textView3.setTypeface(Typeface.createFromAsset(assets3, "fonts/" + PreviewActivity.this.label5_0_Font_name[2] + ".ttf"));
                textView3.setLayoutParams(layoutParams4);
                PreviewActivity.this.relative0.addView(textView3);
                TextView textView4 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams5.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._180sdp), 0, 0);
                textView4.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView4.setGravity(1);
                textView4.setText(PreviewActivity.this.p_getfirstnameB);
                textView4.setTextColor(Color.parseColor(PreviewActivity.this.label5_0_font_color[3]));
                AssetManager assets4 = PreviewActivity.this.getAssets();
                textView4.setTypeface(Typeface.createFromAsset(assets4, "fonts/" + PreviewActivity.this.label5_0_Font_name[3] + ".ttf"));
                textView4.setLayoutParams(layoutParams5);
                PreviewActivity.this.relative0.addView(textView4);
                TextView textView5 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams6.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._255sdp), 0, 0);
                textView5.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView5.setGravity(1);
                textView5.setText("REQUEST THE HONOR OF \n YOUR PRESENCE AT \n THEIR MARRIAGE");
                textView5.setTextColor(Color.parseColor(PreviewActivity.this.label5_0_font_color[4]));
                AssetManager assets5 = PreviewActivity.this.getAssets();
                textView5.setTypeface(Typeface.createFromAsset(assets5, "fonts/" + PreviewActivity.this.label5_0_Font_name[4] + ".ttf"));
                textView5.setLayoutParams(layoutParams6);
                PreviewActivity.this.relative0.addView(textView5);
                TextView textView6 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams7.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._335sdp), 0, 0);
                textView6.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView6.setGravity(1);
                textView6.setText(PreviewActivity.this.p_getdate1);
                textView6.setLetterSpacing(0.3f);
                textView6.setTextColor(Color.parseColor(PreviewActivity.this.label5_0_font_color[5]));
                AssetManager assets6 = PreviewActivity.this.getAssets();
                textView6.setTypeface(Typeface.createFromAsset(assets6, "fonts/" + PreviewActivity.this.label5_0_Font_name[5] + ".ttf"));
                textView6.setLayoutParams(layoutParams7);
                PreviewActivity.this.relative0.addView(textView6);
                TextView textView7 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams8.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._350sdp), 0, 0);
                textView7.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView7.setGravity(1);
                textView7.setText(PreviewActivity.this.label5_0_Text[6]);
                textView7.setTextColor(Color.parseColor(PreviewActivity.this.label5_0_font_color[6]));
                AssetManager assets7 = PreviewActivity.this.getAssets();
                textView7.setTypeface(Typeface.createFromAsset(assets7, "fonts/" + PreviewActivity.this.label5_0_Font_name[6] + ".ttf"));
                textView7.setLayoutParams(layoutParams8);
                PreviewActivity.this.relative0.addView(textView7);
            }
            if (i == 1) {
                PreviewActivity.this.relative1 = (RelativeLayout) inflate.findViewById(R.id.rel1);
                ImageView imageView2 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity2 = PreviewActivity.this;
                previewActivity2.bmp = previewActivity2.setBgImg(R.drawable.w_5_up_img_1);
                imageView2.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams9.setMargins(0, 0, 0, 0);
                imageView2.setLayoutParams(layoutParams9);
                PreviewActivity.this.relative1.addView(imageView2, 0);
                TextView textView8 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams10.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._35sdp), 0, 0);
                textView8.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._11sdp));
                textView8.setGravity(1);
                textView8.setText(PreviewActivity.this.label5_1_Text[0]);
                textView8.setTextColor(Color.parseColor(PreviewActivity.this.label5_1_font_color[0]));
                AssetManager assets8 = PreviewActivity.this.getAssets();
                textView8.setTypeface(Typeface.createFromAsset(assets8, "fonts/" + PreviewActivity.this.label5_1_Font_name[0] + ".ttf"));
                textView8.setLayoutParams(layoutParams10);
                PreviewActivity.this.relative1.addView(textView8);
                TextView textView9 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams11.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._90sdp), 0, 0);
                textView9.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView9.setGravity(1);
                textView9.setText(PreviewActivity.this.p_getfirstNameG);
                textView9.setTextColor(Color.parseColor(PreviewActivity.this.label5_1_font_color[1]));
                AssetManager assets9 = PreviewActivity.this.getAssets();
                textView9.setTypeface(Typeface.createFromAsset(assets9, "fonts/" + PreviewActivity.this.label5_1_Font_name[1] + ".ttf"));
                textView9.setLayoutParams(layoutParams11);
                PreviewActivity.this.relative1.addView(textView9);
                TextView textView10 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams12.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._130sdp), 0, 0);
                textView10.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView10.setGravity(1);
                textView10.setText(PreviewActivity.this.p_getrelation);
                textView10.setTextColor(Color.parseColor(PreviewActivity.this.label5_1_font_color[2]));
                AssetManager assets10 = PreviewActivity.this.getAssets();
                textView10.setTypeface(Typeface.createFromAsset(assets10, "fonts/" + PreviewActivity.this.label5_1_Font_name[2] + ".ttf"));
                textView10.setLayoutParams(layoutParams12);
                PreviewActivity.this.relative1.addView(textView10);
                TextView textView11 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams13.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._145sdp), 0, 0);
                textView11.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView11.setGravity(1);
                textView11.setText("Mr. " + PreviewActivity.this.p_getfatherNAmeG + " " + PreviewActivity.this.p_getlastNameG + " & MRS. " + PreviewActivity.this.p_getmotherNameG + " " + PreviewActivity.this.p_getlastNameG);
                textView11.setTextColor(Color.parseColor(PreviewActivity.this.label5_1_font_color[3]));
                AssetManager assets11 = PreviewActivity.this.getAssets();
                StringBuilder sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(PreviewActivity.this.label5_1_Font_name[3]);
                sb.append(".ttf");
                textView11.setTypeface(Typeface.createFromAsset(assets11, sb.toString()));
                textView11.setLayoutParams(layoutParams13);
                PreviewActivity.this.relative1.addView(textView11);
                if (!PreviewActivity.this.p_getgrandMothernameG.isEmpty() && !PreviewActivity.this.p_getgrandFathernameG.isEmpty()) {
                    TextView textView12 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams14.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._170sdp), 0, 0);
                    textView12.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView12.setGravity(1);
                    textView12.setText(PreviewActivity.this.p_getgrandrelation);
                    textView12.setTextColor(Color.parseColor(PreviewActivity.this.label5_1_font_color[4]));
                    AssetManager assets12 = PreviewActivity.this.getAssets();
                    textView12.setTypeface(Typeface.createFromAsset(assets12, "fonts/" + PreviewActivity.this.label5_1_Font_name[4] + ".ttf"));
                    textView12.setLayoutParams(layoutParams14);
                    PreviewActivity.this.relative1.addView(textView12);
                    TextView textView13 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams15.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._185sdp), 0, 0);
                    textView13.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView13.setGravity(1);
                    textView13.setText("Mr. " + PreviewActivity.this.p_getgrandFathernameG + " " + PreviewActivity.this.p_getlastNameG + " & MRS. " + PreviewActivity.this.p_getgrandMothernameG + " " + PreviewActivity.this.p_getlastNameG);
                    textView13.setTextColor(Color.parseColor(PreviewActivity.this.label5_1_font_color[5]));
                    AssetManager assets13 = PreviewActivity.this.getAssets();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fonts/");
                    sb2.append(PreviewActivity.this.label5_1_Font_name[5]);
                    sb2.append(".ttf");
                    textView13.setTypeface(Typeface.createFromAsset(assets13, sb2.toString()));
                    textView13.setLayoutParams(layoutParams15);
                    PreviewActivity.this.relative1.addView(textView13);
                }
                TextView textView14 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams16.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._225sdp), 0, 0);
                textView14.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                textView14.setGravity(1);
                textView14.setText(PreviewActivity.this.label5_1_Text[6]);
                textView14.setTextColor(Color.parseColor(PreviewActivity.this.label5_1_font_color[6]));
                AssetManager assets14 = PreviewActivity.this.getAssets();
                textView14.setTypeface(Typeface.createFromAsset(assets14, "fonts/" + PreviewActivity.this.label5_1_Font_name[6] + ".ttf"));
                textView14.setLayoutParams(layoutParams16);
                PreviewActivity.this.relative1.addView(textView14);
                TextView textView15 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams17.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._275sdp), 0, 0);
                textView15.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView15.setGravity(1);
                textView15.setText(PreviewActivity.this.p_getfirstnameB);
                textView15.setTextColor(Color.parseColor(PreviewActivity.this.label5_1_font_color[7]));
                AssetManager assets15 = PreviewActivity.this.getAssets();
                textView15.setTypeface(Typeface.createFromAsset(assets15, "fonts/" + PreviewActivity.this.label5_1_Font_name[7] + ".ttf"));
                textView15.setLayoutParams(layoutParams17);
                PreviewActivity.this.relative1.addView(textView15);
                TextView textView16 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams18.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._310sdp), 0, 0);
                textView16.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView16.setGravity(1);
                textView16.setText(PreviewActivity.this.p_getsecondrelation);
                textView16.setTextColor(Color.parseColor(PreviewActivity.this.label5_1_font_color[8]));
                AssetManager assets16 = PreviewActivity.this.getAssets();
                textView16.setTypeface(Typeface.createFromAsset(assets16, "fonts/" + PreviewActivity.this.label5_1_Font_name[8] + ".ttf"));
                textView16.setLayoutParams(layoutParams18);
                PreviewActivity.this.relative1.addView(textView16);
                TextView textView17 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams19.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._325sdp), 0, 0);
                textView17.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView17.setGravity(1);
                textView17.setText("Mr. " + PreviewActivity.this.p_getfatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & MRS. " + PreviewActivity.this.p_getmotherNameB + " " + PreviewActivity.this.p_getlastNameB);
                textView17.setTextColor(Color.parseColor(PreviewActivity.this.label5_1_font_color[9]));
                AssetManager assets17 = PreviewActivity.this.getAssets();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("fonts/");
                sb3.append(PreviewActivity.this.label5_1_Font_name[9]);
                sb3.append(".ttf");
                textView17.setTypeface(Typeface.createFromAsset(assets17, sb3.toString()));
                textView17.setLayoutParams(layoutParams19);
                PreviewActivity.this.relative1.addView(textView17);
                if (!PreviewActivity.this.p_getgrandMothernameB.isEmpty() && !PreviewActivity.this.p_getgrandFatherNameB.isEmpty()) {
                    TextView textView18 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams20 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams20.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._350sdp), 0, 0);
                    textView18.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView18.setGravity(1);
                    textView18.setText(PreviewActivity.this.p_getsecondgrandrelation);
                    textView18.setTextColor(Color.parseColor(PreviewActivity.this.label5_1_font_color[10]));
                    AssetManager assets18 = PreviewActivity.this.getAssets();
                    textView18.setTypeface(Typeface.createFromAsset(assets18, "fonts/" + PreviewActivity.this.label5_1_Font_name[10] + ".ttf"));
                    textView18.setLayoutParams(layoutParams20);
                    PreviewActivity.this.relative1.addView(textView18);
                    TextView textView19 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams21 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams21.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._360sdp), 0, 0);
                    textView19.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView19.setGravity(1);
                    textView19.setText("Mr. " + PreviewActivity.this.p_getgrandFatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & MRS. " + PreviewActivity.this.p_getgrandMothernameB + " " + PreviewActivity.this.p_getlastNameB);
                    textView19.setTextColor(Color.parseColor(PreviewActivity.this.label5_1_font_color[11]));
                    AssetManager assets19 = PreviewActivity.this.getAssets();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("fonts/");
                    sb4.append(PreviewActivity.this.label5_1_Font_name[11]);
                    sb4.append(".ttf");
                    textView19.setTypeface(Typeface.createFromAsset(assets19, sb4.toString()));
                    textView19.setLayoutParams(layoutParams21);
                    PreviewActivity.this.relative1.addView(textView19);
                }
            }
            if (i == 2) {
                PreviewActivity.this.relative2 = (RelativeLayout) inflate.findViewById(R.id.rel2);
                ImageView imageView3 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity3 = PreviewActivity.this;
                previewActivity3.bmp = previewActivity3.setBgImg(R.drawable.w_5_up_img_2);
                imageView3.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams22.setMargins(0, 0, 0, 0);
                imageView3.setLayoutParams(layoutParams22);
                PreviewActivity.this.relative2.addView(imageView3, 0);
                TextView textView20 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams23 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams23.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._35sdp), 0, 0);
                textView20.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView20.setGravity(1);
                textView20.setText(PreviewActivity.this.label5_2_Text[0]);
                textView20.setTextColor(Color.parseColor(PreviewActivity.this.label5_2_font_color[0]));
                AssetManager assets20 = PreviewActivity.this.getAssets();
                textView20.setTypeface(Typeface.createFromAsset(assets20, "fonts/" + PreviewActivity.this.label5_2_Font_name[0] + ".ttf"));
                textView20.setLayoutParams(layoutParams23);
                PreviewActivity.this.relative2.addView(textView20);
                if (PreviewActivity.this.lenear2 != null) {
                    TextView textView21 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams24.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._85sdp), 0, 0);
                    textView21.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                    textView21.setGravity(1);
                    textView21.setText(PreviewActivity.this.p_getfunctionname1);
                    textView21.setTextColor(Color.parseColor(PreviewActivity.this.label5_2_font_color[1]));
                    AssetManager assets21 = PreviewActivity.this.getAssets();
                    textView21.setTypeface(Typeface.createFromAsset(assets21, "fonts/" + PreviewActivity.this.label5_2_Font_name[1] + ".ttf"));
                    textView21.setLayoutParams(layoutParams24);
                    PreviewActivity.this.relative2.addView(textView21);
                    TextView textView22 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams25.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._120sdp), 0, 0);
                    textView22.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView22.setGravity(1);
                    textView22.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView22.setTextColor(Color.parseColor(PreviewActivity.this.label5_2_font_color[2]));
                    AssetManager assets22 = PreviewActivity.this.getAssets();
                    textView22.setTypeface(Typeface.createFromAsset(assets22, "fonts/" + PreviewActivity.this.label5_2_Font_name[2] + ".ttf"));
                    textView22.setLayoutParams(layoutParams25);
                    PreviewActivity.this.relative2.addView(textView22);
                    TextView textView23 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams26 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams26.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._135sdp), 0, 0);
                    textView23.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView23.setGravity(1);
                    textView23.setText(PreviewActivity.this.p_getvenue1);
                    textView23.setTextColor(Color.parseColor(PreviewActivity.this.label5_2_font_color[3]));
                    AssetManager assets23 = PreviewActivity.this.getAssets();
                    textView23.setTypeface(Typeface.createFromAsset(assets23, "fonts/" + PreviewActivity.this.label5_2_Font_name[3] + ".ttf"));
                    textView23.setLayoutParams(layoutParams26);
                    PreviewActivity.this.relative2.addView(textView23);
                } else {
                    TextView textView24 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams27.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._200sdp), 0, 0);
                    textView24.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                    textView24.setGravity(1);
                    textView24.setText(PreviewActivity.this.p_getfunctionname1);
                    textView24.setTextColor(Color.parseColor(PreviewActivity.this.label5_2_font_color[1]));
                    AssetManager assets24 = PreviewActivity.this.getAssets();
                    textView24.setTypeface(Typeface.createFromAsset(assets24, "fonts/" + PreviewActivity.this.label5_2_Font_name[1] + ".ttf"));
                    textView24.setLayoutParams(layoutParams27);
                    PreviewActivity.this.relative2.addView(textView24);
                    TextView textView25 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams28 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams28.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._238sdp), 0, 0);
                    textView25.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView25.setGravity(1);
                    textView25.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView25.setTextColor(Color.parseColor(PreviewActivity.this.label5_2_font_color[2]));
                    AssetManager assets25 = PreviewActivity.this.getAssets();
                    textView25.setTypeface(Typeface.createFromAsset(assets25, "fonts/" + PreviewActivity.this.label5_2_Font_name[2] + ".ttf"));
                    textView25.setLayoutParams(layoutParams28);
                    PreviewActivity.this.relative2.addView(textView25);
                    TextView textView26 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams29 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams29.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._255sdp), 0, 0);
                    textView26.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView26.setGravity(1);
                    textView26.setText(PreviewActivity.this.p_getvenue1);
                    textView26.setTextColor(Color.parseColor(PreviewActivity.this.label5_2_font_color[3]));
                    AssetManager assets26 = PreviewActivity.this.getAssets();
                    textView26.setTypeface(Typeface.createFromAsset(assets26, "fonts/" + PreviewActivity.this.label5_2_Font_name[3] + ".ttf"));
                    textView26.setLayoutParams(layoutParams29);
                    PreviewActivity.this.relative2.addView(textView26);
                }
                if (PreviewActivity.this.p_getfunctionname2 != null) {
                    TextView textView27 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams30 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams30.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._200sdp), 0, 0);
                    textView27.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                    textView27.setGravity(1);
                    textView27.setText(PreviewActivity.this.p_getfunctionname2);
                    textView27.setTextColor(Color.parseColor(PreviewActivity.this.label5_2_font_color[4]));
                    AssetManager assets27 = PreviewActivity.this.getAssets();
                    textView27.setTypeface(Typeface.createFromAsset(assets27, "fonts/" + PreviewActivity.this.label5_2_Font_name[4] + ".ttf"));
                    textView27.setLayoutParams(layoutParams30);
                    PreviewActivity.this.relative2.addView(textView27);
                    TextView textView28 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams31 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams31.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._238sdp), 0, 0);
                    textView28.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView28.setGravity(1);
                    textView28.setText(PreviewActivity.this.p_getdate2 + ", " + PreviewActivity.this.p_gettime2 + " Onwards");
                    textView28.setTextColor(Color.parseColor(PreviewActivity.this.label5_2_font_color[5]));
                    AssetManager assets28 = PreviewActivity.this.getAssets();
                    textView28.setTypeface(Typeface.createFromAsset(assets28, "fonts/" + PreviewActivity.this.label5_2_Font_name[5] + ".ttf"));
                    textView28.setLayoutParams(layoutParams31);
                    PreviewActivity.this.relative2.addView(textView28);
                    TextView textView29 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams32 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams32.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._255sdp), 0, 0);
                    textView29.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView29.setGravity(1);
                    textView29.setText(PreviewActivity.this.p_getvenue2);
                    textView29.setTextColor(Color.parseColor(PreviewActivity.this.label5_2_font_color[6]));
                    AssetManager assets29 = PreviewActivity.this.getAssets();
                    textView29.setTypeface(Typeface.createFromAsset(assets29, "fonts/" + PreviewActivity.this.label5_2_Font_name[6] + ".ttf"));
                    textView29.setLayoutParams(layoutParams32);
                    PreviewActivity.this.relative2.addView(textView29);
                }
                if (PreviewActivity.this.p_getfunctionname3 != null) {
                    TextView textView30 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams33 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams33.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._310sdp), 0, 0);
                    textView30.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                    textView30.setGravity(1);
                    textView30.setText(PreviewActivity.this.p_getfunctionname3);
                    textView30.setTextColor(Color.parseColor(PreviewActivity.this.label5_2_font_color[7]));
                    AssetManager assets30 = PreviewActivity.this.getAssets();
                    textView30.setTypeface(Typeface.createFromAsset(assets30, "fonts/" + PreviewActivity.this.label5_2_Font_name[7] + ".ttf"));
                    textView30.setLayoutParams(layoutParams33);
                    PreviewActivity.this.relative2.addView(textView30);
                    TextView textView31 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams34 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams34.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._350sdp), 0, 0);
                    textView31.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView31.setGravity(1);
                    textView31.setText(PreviewActivity.this.p_getdate3 + ", " + PreviewActivity.this.p_gettime3 + " Onwards");
                    textView31.setTextColor(Color.parseColor(PreviewActivity.this.label5_2_font_color[8]));
                    AssetManager assets31 = PreviewActivity.this.getAssets();
                    textView31.setTypeface(Typeface.createFromAsset(assets31, "fonts/" + PreviewActivity.this.label5_2_Font_name[8] + ".ttf"));
                    textView31.setLayoutParams(layoutParams34);
                    PreviewActivity.this.relative2.addView(textView31);
                    TextView textView32 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams35 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams35.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._365sdp), 0, 0);
                    textView32.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView32.setGravity(1);
                    textView32.setText(PreviewActivity.this.p_getvenue3);
                    textView32.setTextColor(Color.parseColor(PreviewActivity.this.label5_2_font_color[9]));
                    AssetManager assets32 = PreviewActivity.this.getAssets();
                    textView32.setTypeface(Typeface.createFromAsset(assets32, "fonts/" + PreviewActivity.this.label5_2_Font_name[9] + ".ttf"));
                    textView32.setLayoutParams(layoutParams35);
                    PreviewActivity.this.relative2.addView(textView32);
                }
            }
            if (i == 3) {
                PreviewActivity.this.relative3 = (RelativeLayout) inflate.findViewById(R.id.rel3);
                ImageView imageView4 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity4 = PreviewActivity.this;
                previewActivity4.bmp = previewActivity4.setBgImg(R.drawable.w_5_up_img_3);
                imageView4.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams36 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams36.setMargins(0, 0, 0, 0);
                imageView4.setLayoutParams(layoutParams36);
                PreviewActivity.this.relative3.addView(imageView4, 0);
                TextView textView33 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams37 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams37.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._60sdp), 0, 0);
                textView33.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView33.setGravity(1);
                textView33.setText(PreviewActivity.this.label5_3_Text[0]);
                textView33.setTextColor(Color.parseColor(PreviewActivity.this.label5_3_font_color[0]));
                AssetManager assets33 = PreviewActivity.this.getAssets();
                textView33.setTypeface(Typeface.createFromAsset(assets33, "fonts/" + PreviewActivity.this.label5_3_Font_name[0] + ".ttf"));
                textView33.setLayoutParams(layoutParams37);
                PreviewActivity.this.relative3.addView(textView33);
                TextView textView34 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams38 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams38.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._105sdp), 0, 0);
                textView34.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView34.setGravity(1);
                textView34.setText(PreviewActivity.this.p_getvenue_other);
                textView34.setTextColor(Color.parseColor(PreviewActivity.this.label5_3_font_color[1]));
                AssetManager assets34 = PreviewActivity.this.getAssets();
                textView34.setTypeface(Typeface.createFromAsset(assets34, "fonts/" + PreviewActivity.this.label5_3_Font_name[1] + ".ttf"));
                textView34.setLayoutParams(layoutParams38);
                PreviewActivity.this.relative3.addView(textView34);
                TextView textView35 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams39 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams39.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._150sdp), 0, 0);
                textView35.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView35.setGravity(1);
                textView35.setText("Rsvp");
                textView35.setTextColor(Color.parseColor(PreviewActivity.this.label5_3_font_color[2]));
                AssetManager assets35 = PreviewActivity.this.getAssets();
                textView35.setTypeface(Typeface.createFromAsset(assets35, "fonts/" + PreviewActivity.this.label5_3_Font_name[2] + ".ttf"));
                textView35.setLayoutParams(layoutParams39);
                PreviewActivity.this.relative3.addView(textView35);
                TextView textView36 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams40 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams40.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._200sdp), 0, 0);
                textView36.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView36.setGravity(1);
                textView36.setText(PreviewActivity.this.p_getRsvp);
                textView36.setTextColor(Color.parseColor(PreviewActivity.this.label5_3_font_color[3]));
                AssetManager assets36 = PreviewActivity.this.getAssets();
                textView36.setTypeface(Typeface.createFromAsset(assets36, "fonts/" + PreviewActivity.this.label5_3_Font_name[3] + ".ttf"));
                textView36.setLayoutParams(layoutParams40);
                PreviewActivity.this.relative3.addView(textView36);
                TextView textView37 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams41 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams41.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._330sdp), 0, 0);
                textView37.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._7sdp));
                textView37.setGravity(1);
                textView37.setText(PreviewActivity.this.label5_3_Text[4]);
                textView37.setLetterSpacing(0.1f);
                textView37.setTextColor(Color.parseColor(PreviewActivity.this.label5_3_font_color[4]));
                AssetManager assets37 = PreviewActivity.this.getAssets();
                textView37.setTypeface(Typeface.createFromAsset(assets37, "fonts/" + PreviewActivity.this.label5_3_Font_name[4] + ".ttf"));
                textView37.setLayoutParams(layoutParams41);
                PreviewActivity.this.relative3.addView(textView37);
                TextView textView38 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams42 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams42.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._360sdp), 0, 0);
                textView38.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView38.setGravity(1);
                textView38.setText(PreviewActivity.this.p_getdate_other);
                textView38.setLetterSpacing(0.2f);
                textView38.setTextColor(Color.parseColor(PreviewActivity.this.label5_3_font_color[5]));
                AssetManager assets38 = PreviewActivity.this.getAssets();
                textView38.setTypeface(Typeface.createFromAsset(assets38, "fonts/" + PreviewActivity.this.label5_3_Font_name[5] + ".ttf"));
                textView38.setLayoutParams(layoutParams42);
                PreviewActivity.this.relative3.addView(textView38);
            }
            viewGroup.addView(inflate);
            return inflate;
        }

        @Override 
        public int getCount() {
            return PreviewActivity.this.layouts.length;
        }

        @Override 
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    
    public class MyViewPagerAdapter6 extends PagerAdapter {
        private LayoutInflater layoutInflater;

        @Override 
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public MyViewPagerAdapter6() {
        }

        @Override 
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = (LayoutInflater) PreviewActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.layoutInflater = layoutInflater;
            View inflate = layoutInflater.inflate(PreviewActivity.this.layouts[i], viewGroup, false);
            if (i == 0) {
                PreviewActivity.this.relative0 = (RelativeLayout) inflate.findViewById(R.id.rel0);
                ImageView imageView = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity = PreviewActivity.this;
                previewActivity.bmp = previewActivity.setBgImg(R.drawable.w_6_up_img_0);
                imageView.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams.setMargins(0, 0, 0, 0);
                imageView.setLayoutParams(layoutParams);
                PreviewActivity.this.relative0.addView(imageView, 0);
                TextView textView = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._18sdp), 0, 0);
                textView.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView.setGravity(1);
                textView.setText(PreviewActivity.this.label6_0_Text[0]);
                textView.setTextColor(Color.parseColor(PreviewActivity.this.label6_0_font_color[0]));
                AssetManager assets = PreviewActivity.this.getAssets();
                textView.setTypeface(Typeface.createFromAsset(assets, "fonts/" + PreviewActivity.this.label6_0_Font_name[0] + ".ttf"));
                textView.setLayoutParams(layoutParams2);
                PreviewActivity.this.relative0.addView(textView);
                TextView textView2 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._55sdp), 0, 0);
                textView2.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView2.setGravity(1);
                textView2.setText(PreviewActivity.this.p_getfirstNameG);
                textView2.setTextColor(Color.parseColor(PreviewActivity.this.label6_0_font_color[1]));
                AssetManager assets2 = PreviewActivity.this.getAssets();
                textView2.setTypeface(Typeface.createFromAsset(assets2, "fonts/" + PreviewActivity.this.label6_0_Font_name[1] + ".ttf"));
                textView2.setLayoutParams(layoutParams3);
                PreviewActivity.this.relative0.addView(textView2);
                TextView textView3 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams4.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._88sdp), 0, 0);
                textView3.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView3.setGravity(1);
                textView3.setText(PreviewActivity.this.label6_0_Text[2]);
                textView3.setTextColor(Color.parseColor(PreviewActivity.this.label6_0_font_color[2]));
                AssetManager assets3 = PreviewActivity.this.getAssets();
                textView3.setTypeface(Typeface.createFromAsset(assets3, "fonts/" + PreviewActivity.this.label6_0_Font_name[2] + ".ttf"));
                textView3.setLayoutParams(layoutParams4);
                PreviewActivity.this.relative0.addView(textView3);
                TextView textView4 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams5.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._120sdp), 0, 0);
                textView4.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView4.setGravity(1);
                textView4.setText(PreviewActivity.this.p_getfirstnameB);
                textView4.setTextColor(Color.parseColor(PreviewActivity.this.label6_0_font_color[3]));
                AssetManager assets4 = PreviewActivity.this.getAssets();
                textView4.setTypeface(Typeface.createFromAsset(assets4, "fonts/" + PreviewActivity.this.label6_0_Font_name[3] + ".ttf"));
                textView4.setLayoutParams(layoutParams5);
                PreviewActivity.this.relative0.addView(textView4);
                TextView textView5 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams6.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._158sdp), 0, 0);
                textView5.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                textView5.setGravity(1);
                textView5.setText(PreviewActivity.this.p_getdate1);
                textView5.setLetterSpacing(0.2f);
                textView5.setTextColor(Color.parseColor(PreviewActivity.this.label6_0_font_color[4]));
                AssetManager assets5 = PreviewActivity.this.getAssets();
                textView5.setTypeface(Typeface.createFromAsset(assets5, "fonts/" + PreviewActivity.this.label6_0_Font_name[4] + ".ttf"));
                textView5.setLayoutParams(layoutParams6);
                PreviewActivity.this.relative0.addView(textView5);
            }
            if (i == 1) {
                PreviewActivity.this.relative1 = (RelativeLayout) inflate.findViewById(R.id.rel1);
                ImageView imageView2 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity2 = PreviewActivity.this;
                previewActivity2.bmp = previewActivity2.setBgImg(R.drawable.w_6_up_img_1);
                imageView2.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams7.setMargins(0, 0, 0, 0);
                imageView2.setLayoutParams(layoutParams7);
                PreviewActivity.this.relative1.addView(imageView2, 0);
                TextView textView6 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams8.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp), 0, 0);
                textView6.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView6.setGravity(1);
                textView6.setText(PreviewActivity.this.label6_1_Text[0]);
                textView6.setTextColor(Color.parseColor(PreviewActivity.this.label6_1_font_color[0]));
                AssetManager assets6 = PreviewActivity.this.getAssets();
                textView6.setTypeface(Typeface.createFromAsset(assets6, "fonts/" + PreviewActivity.this.label6_1_Font_name[0] + ".ttf"));
                textView6.setLayoutParams(layoutParams8);
                PreviewActivity.this.relative1.addView(textView6);
                TextView textView7 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams9.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._100sdp), 0, 0);
                textView7.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView7.setGravity(1);
                textView7.setText(PreviewActivity.this.p_getfirstNameG);
                textView7.setTextColor(Color.parseColor(PreviewActivity.this.label6_1_font_color[1]));
                AssetManager assets7 = PreviewActivity.this.getAssets();
                textView7.setTypeface(Typeface.createFromAsset(assets7, "fonts/" + PreviewActivity.this.label6_1_Font_name[1] + ".ttf"));
                textView7.setLayoutParams(layoutParams9);
                PreviewActivity.this.relative1.addView(textView7);
                TextView textView8 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams10.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._140sdp), 0, 0);
                textView8.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView8.setGravity(1);
                textView8.setText(PreviewActivity.this.p_getrelation);
                textView8.setAllCaps(true);
                textView8.setTextColor(Color.parseColor(PreviewActivity.this.label6_1_font_color[2]));
                AssetManager assets8 = PreviewActivity.this.getAssets();
                textView8.setTypeface(Typeface.createFromAsset(assets8, "fonts/" + PreviewActivity.this.label6_1_Font_name[2] + ".ttf"));
                textView8.setLayoutParams(layoutParams10);
                PreviewActivity.this.relative1.addView(textView8);
                TextView textView9 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams11.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._155sdp), 0, 0);
                textView9.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView9.setGravity(1);
                textView9.setText("MR. " + PreviewActivity.this.p_getfatherNAmeG + " " + PreviewActivity.this.p_getlastNameG + " & MRS. " + PreviewActivity.this.p_getmotherNameG + " " + PreviewActivity.this.p_getlastNameG);
                textView9.setAllCaps(true);
                textView9.setTextColor(Color.parseColor(PreviewActivity.this.label6_1_font_color[3]));
                AssetManager assets9 = PreviewActivity.this.getAssets();
                StringBuilder sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(PreviewActivity.this.label6_1_Font_name[3]);
                sb.append(".ttf");
                textView9.setTypeface(Typeface.createFromAsset(assets9, sb.toString()));
                textView9.setLayoutParams(layoutParams11);
                PreviewActivity.this.relative1.addView(textView9);
                if (!PreviewActivity.this.p_getgrandMothernameG.isEmpty() && !PreviewActivity.this.p_getgrandFathernameG.isEmpty()) {
                    TextView textView10 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams12.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._180sdp), 0, 0);
                    textView10.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView10.setGravity(1);
                    textView10.setText(PreviewActivity.this.p_getgrandrelation);
                    textView10.setAllCaps(true);
                    textView10.setTextColor(Color.parseColor(PreviewActivity.this.label6_1_font_color[4]));
                    AssetManager assets10 = PreviewActivity.this.getAssets();
                    textView10.setTypeface(Typeface.createFromAsset(assets10, "fonts/" + PreviewActivity.this.label6_1_Font_name[4] + ".ttf"));
                    textView10.setLayoutParams(layoutParams12);
                    PreviewActivity.this.relative1.addView(textView10);
                    TextView textView11 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams13.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._195sdp), 0, 0);
                    textView11.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView11.setGravity(1);
                    textView11.setText("MR. " + PreviewActivity.this.p_getgrandFathernameG + " " + PreviewActivity.this.p_getlastNameG + " & MRS. " + PreviewActivity.this.p_getgrandMothernameG + " " + PreviewActivity.this.p_getlastNameG);
                    textView11.setAllCaps(true);
                    textView11.setTextColor(Color.parseColor(PreviewActivity.this.label6_1_font_color[5]));
                    AssetManager assets11 = PreviewActivity.this.getAssets();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fonts/");
                    sb2.append(PreviewActivity.this.label6_1_Font_name[5]);
                    sb2.append(".ttf");
                    textView11.setTypeface(Typeface.createFromAsset(assets11, sb2.toString()));
                    textView11.setLayoutParams(layoutParams13);
                    PreviewActivity.this.relative1.addView(textView11);
                }
                TextView textView12 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams14.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._235sdp), 0, 0);
                textView12.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView12.setGravity(1);
                textView12.setText(PreviewActivity.this.p_getfirstnameB);
                textView12.setTextColor(Color.parseColor(PreviewActivity.this.label6_1_font_color[6]));
                AssetManager assets12 = PreviewActivity.this.getAssets();
                textView12.setTypeface(Typeface.createFromAsset(assets12, "fonts/" + PreviewActivity.this.label6_1_Font_name[6] + ".ttf"));
                textView12.setLayoutParams(layoutParams14);
                PreviewActivity.this.relative1.addView(textView12);
                TextView textView13 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams15.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._275sdp), 0, 0);
                textView13.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView13.setGravity(1);
                textView13.setText(PreviewActivity.this.p_getsecondrelation);
                textView13.setTextColor(Color.parseColor(PreviewActivity.this.label6_1_font_color[7]));
                textView13.setAllCaps(true);
                AssetManager assets13 = PreviewActivity.this.getAssets();
                textView13.setTypeface(Typeface.createFromAsset(assets13, "fonts/" + PreviewActivity.this.label6_1_Font_name[7] + ".ttf"));
                textView13.setLayoutParams(layoutParams15);
                PreviewActivity.this.relative1.addView(textView13);
                TextView textView14 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams16.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._290sdp), 0, 0);
                textView14.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView14.setGravity(1);
                textView14.setText("MR. " + PreviewActivity.this.p_getfatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & MRS. " + PreviewActivity.this.p_getmotherNameB + " " + PreviewActivity.this.p_getlastNameB);
                textView14.setAllCaps(true);
                textView14.setTextColor(Color.parseColor(PreviewActivity.this.label6_1_font_color[8]));
                AssetManager assets14 = PreviewActivity.this.getAssets();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("fonts/");
                sb3.append(PreviewActivity.this.label6_1_Font_name[8]);
                sb3.append(".ttf");
                textView14.setTypeface(Typeface.createFromAsset(assets14, sb3.toString()));
                textView14.setLayoutParams(layoutParams16);
                PreviewActivity.this.relative1.addView(textView14);
                if (!PreviewActivity.this.p_getgrandMothernameB.isEmpty() && !PreviewActivity.this.p_getgrandFatherNameB.isEmpty()) {
                    TextView textView15 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams17.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._315sdp), 0, 0);
                    textView15.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView15.setGravity(1);
                    textView15.setText(PreviewActivity.this.p_getsecondgrandrelation);
                    textView15.setAllCaps(true);
                    textView15.setTextColor(Color.parseColor(PreviewActivity.this.label6_1_font_color[9]));
                    AssetManager assets15 = PreviewActivity.this.getAssets();
                    textView15.setTypeface(Typeface.createFromAsset(assets15, "fonts/" + PreviewActivity.this.label6_1_Font_name[9] + ".ttf"));
                    textView15.setLayoutParams(layoutParams17);
                    PreviewActivity.this.relative1.addView(textView15);
                    TextView textView16 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams18.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._330sdp), 0, 0);
                    textView16.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView16.setGravity(1);
                    textView16.setText("MR. " + PreviewActivity.this.p_getgrandFatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & MRS. " + PreviewActivity.this.p_getgrandMothernameB + " " + PreviewActivity.this.p_getlastNameB);
                    textView16.setAllCaps(true);
                    textView16.setTextColor(Color.parseColor(PreviewActivity.this.label6_1_font_color[10]));
                    AssetManager assets16 = PreviewActivity.this.getAssets();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("fonts/");
                    sb4.append(PreviewActivity.this.label6_1_Font_name[10]);
                    sb4.append(".ttf");
                    textView16.setTypeface(Typeface.createFromAsset(assets16, sb4.toString()));
                    textView16.setLayoutParams(layoutParams18);
                    PreviewActivity.this.relative1.addView(textView16);
                }
                TextView textView17 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams19.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._380sdp), 0, 0);
                textView17.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                textView17.setGravity(1);
                textView17.setText(PreviewActivity.this.label6_1_Text[11]);
                textView17.setAllCaps(true);
                textView17.setTextColor(Color.parseColor(PreviewActivity.this.label6_1_font_color[11]));
                AssetManager assets17 = PreviewActivity.this.getAssets();
                textView17.setTypeface(Typeface.createFromAsset(assets17, "fonts/" + PreviewActivity.this.label6_1_Font_name[11] + ".ttf"));
                textView17.setLayoutParams(layoutParams19);
                PreviewActivity.this.relative1.addView(textView17);
            }
            if (i == 2) {
                PreviewActivity.this.relative2 = (RelativeLayout) inflate.findViewById(R.id.rel2);
                ImageView imageView3 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity3 = PreviewActivity.this;
                previewActivity3.bmp = previewActivity3.setBgImg(R.drawable.w_6_up_img_2);
                imageView3.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams20.setMargins(0, 0, 0, 0);
                imageView3.setLayoutParams(layoutParams20);
                PreviewActivity.this.relative2.addView(imageView3, 0);
                TextView textView18 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams21 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams21.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._55sdp), 0, 0);
                textView18.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView18.setGravity(1);
                textView18.setText(PreviewActivity.this.label6_2_Text[0]);
                textView18.setTextColor(Color.parseColor(PreviewActivity.this.label6_2_font_color[0]));
                AssetManager assets18 = PreviewActivity.this.getAssets();
                textView18.setTypeface(Typeface.createFromAsset(assets18, "fonts/" + PreviewActivity.this.label6_2_Font_name[0] + ".ttf"));
                textView18.setLayoutParams(layoutParams21);
                PreviewActivity.this.relative2.addView(textView18);
                if (PreviewActivity.this.lenear2 != null) {
                    TextView textView19 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams22.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._110sdp), 0, 0);
                    textView19.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                    textView19.setGravity(1);
                    textView19.setText(PreviewActivity.this.p_getfunctionname1);
                    textView19.setTextColor(Color.parseColor(PreviewActivity.this.label6_2_font_color[1]));
                    AssetManager assets19 = PreviewActivity.this.getAssets();
                    textView19.setTypeface(Typeface.createFromAsset(assets19, "fonts/" + PreviewActivity.this.label6_2_Font_name[1] + ".ttf"));
                    textView19.setLayoutParams(layoutParams22);
                    PreviewActivity.this.relative2.addView(textView19);
                    TextView textView20 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams23 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams23.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._150sdp), 0, 0);
                    textView20.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView20.setGravity(1);
                    textView20.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView20.setAllCaps(true);
                    textView20.setTextColor(Color.parseColor(PreviewActivity.this.label6_2_font_color[2]));
                    AssetManager assets20 = PreviewActivity.this.getAssets();
                    textView20.setTypeface(Typeface.createFromAsset(assets20, "fonts/" + PreviewActivity.this.label6_2_Font_name[2] + ".ttf"));
                    textView20.setLayoutParams(layoutParams23);
                    PreviewActivity.this.relative2.addView(textView20);
                    TextView textView21 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams24.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._165sdp), 0, 0);
                    textView21.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView21.setGravity(1);
                    textView21.setText(PreviewActivity.this.p_getvenue1);
                    textView21.setAllCaps(true);
                    textView21.setTextColor(Color.parseColor(PreviewActivity.this.label6_2_font_color[3]));
                    AssetManager assets21 = PreviewActivity.this.getAssets();
                    textView21.setTypeface(Typeface.createFromAsset(assets21, "fonts/" + PreviewActivity.this.label6_2_Font_name[3] + ".ttf"));
                    textView21.setLayoutParams(layoutParams24);
                    PreviewActivity.this.relative2.addView(textView21);
                } else {
                    TextView textView22 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams25.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._200sdp), 0, 0);
                    textView22.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                    textView22.setGravity(1);
                    textView22.setText(PreviewActivity.this.p_getfunctionname1);
                    textView22.setTextColor(Color.parseColor(PreviewActivity.this.label6_2_font_color[1]));
                    AssetManager assets22 = PreviewActivity.this.getAssets();
                    textView22.setTypeface(Typeface.createFromAsset(assets22, "fonts/" + PreviewActivity.this.label6_2_Font_name[1] + ".ttf"));
                    textView22.setLayoutParams(layoutParams25);
                    PreviewActivity.this.relative2.addView(textView22);
                    TextView textView23 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams26 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams26.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._245sdp), 0, 0);
                    textView23.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView23.setGravity(1);
                    textView23.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView23.setAllCaps(true);
                    textView23.setTextColor(Color.parseColor(PreviewActivity.this.label6_2_font_color[2]));
                    AssetManager assets23 = PreviewActivity.this.getAssets();
                    textView23.setTypeface(Typeface.createFromAsset(assets23, "fonts/" + PreviewActivity.this.label6_2_Font_name[2] + ".ttf"));
                    textView23.setLayoutParams(layoutParams26);
                    PreviewActivity.this.relative2.addView(textView23);
                    TextView textView24 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams27.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._260sdp), 0, 0);
                    textView24.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView24.setGravity(1);
                    textView24.setText(PreviewActivity.this.p_getvenue1);
                    textView24.setAllCaps(true);
                    textView24.setTextColor(Color.parseColor(PreviewActivity.this.label6_2_font_color[3]));
                    AssetManager assets24 = PreviewActivity.this.getAssets();
                    textView24.setTypeface(Typeface.createFromAsset(assets24, "fonts/" + PreviewActivity.this.label6_2_Font_name[3] + ".ttf"));
                    textView24.setLayoutParams(layoutParams27);
                    PreviewActivity.this.relative2.addView(textView24);
                }
                if (PreviewActivity.this.p_getfunctionname2 != null) {
                    TextView textView25 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams28 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams28.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._200sdp), 0, 0);
                    textView25.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                    textView25.setGravity(1);
                    textView25.setText(PreviewActivity.this.p_getfunctionname2);
                    textView25.setTextColor(Color.parseColor(PreviewActivity.this.label6_2_font_color[4]));
                    AssetManager assets25 = PreviewActivity.this.getAssets();
                    textView25.setTypeface(Typeface.createFromAsset(assets25, "fonts/" + PreviewActivity.this.label6_2_Font_name[4] + ".ttf"));
                    textView25.setLayoutParams(layoutParams28);
                    PreviewActivity.this.relative2.addView(textView25);
                    TextView textView26 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams29 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams29.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._245sdp), 0, 0);
                    textView26.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView26.setGravity(1);
                    textView26.setText(PreviewActivity.this.p_getdate2 + ", " + PreviewActivity.this.p_gettime2 + " Onwards");
                    textView26.setAllCaps(true);
                    textView26.setTextColor(Color.parseColor(PreviewActivity.this.label6_2_font_color[5]));
                    AssetManager assets26 = PreviewActivity.this.getAssets();
                    textView26.setTypeface(Typeface.createFromAsset(assets26, "fonts/" + PreviewActivity.this.label6_2_Font_name[5] + ".ttf"));
                    textView26.setLayoutParams(layoutParams29);
                    PreviewActivity.this.relative2.addView(textView26);
                    TextView textView27 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams30 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams30.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._260sdp), 0, 0);
                    textView27.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView27.setGravity(1);
                    textView27.setText(PreviewActivity.this.p_getvenue2);
                    textView27.setAllCaps(true);
                    textView27.setTextColor(Color.parseColor(PreviewActivity.this.label6_2_font_color[6]));
                    AssetManager assets27 = PreviewActivity.this.getAssets();
                    textView27.setTypeface(Typeface.createFromAsset(assets27, "fonts/" + PreviewActivity.this.label6_2_Font_name[6] + ".ttf"));
                    textView27.setLayoutParams(layoutParams30);
                    PreviewActivity.this.relative2.addView(textView27);
                }
                if (PreviewActivity.this.p_getfunctionname3 != null) {
                    TextView textView28 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams31 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams31.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._300sdp), 0, 0);
                    textView28.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                    textView28.setGravity(1);
                    textView28.setText(PreviewActivity.this.p_getfunctionname3);
                    textView28.setTextColor(Color.parseColor(PreviewActivity.this.label6_2_font_color[7]));
                    AssetManager assets28 = PreviewActivity.this.getAssets();
                    textView28.setTypeface(Typeface.createFromAsset(assets28, "fonts/" + PreviewActivity.this.label6_2_Font_name[7] + ".ttf"));
                    textView28.setLayoutParams(layoutParams31);
                    PreviewActivity.this.relative2.addView(textView28);
                    TextView textView29 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams32 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams32.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._345sdp), 0, 0);
                    textView29.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView29.setGravity(1);
                    textView29.setText(PreviewActivity.this.p_getdate3 + ", " + PreviewActivity.this.p_gettime3 + " Onwards");
                    textView29.setAllCaps(true);
                    textView29.setTextColor(Color.parseColor(PreviewActivity.this.label6_2_font_color[8]));
                    AssetManager assets29 = PreviewActivity.this.getAssets();
                    textView29.setTypeface(Typeface.createFromAsset(assets29, "fonts/" + PreviewActivity.this.label6_2_Font_name[8] + ".ttf"));
                    textView29.setLayoutParams(layoutParams32);
                    PreviewActivity.this.relative2.addView(textView29);
                    TextView textView30 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams33 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams33.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._360sdp), 0, 0);
                    textView30.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView30.setGravity(1);
                    textView30.setText(PreviewActivity.this.p_getvenue3);
                    textView30.setAllCaps(true);
                    textView30.setTextColor(Color.parseColor(PreviewActivity.this.label6_2_font_color[9]));
                    AssetManager assets30 = PreviewActivity.this.getAssets();
                    textView30.setTypeface(Typeface.createFromAsset(assets30, "fonts/" + PreviewActivity.this.label6_2_Font_name[9] + ".ttf"));
                    textView30.setLayoutParams(layoutParams33);
                    PreviewActivity.this.relative2.addView(textView30);
                }
            }
            if (i == 3) {
                PreviewActivity.this.relative3 = (RelativeLayout) inflate.findViewById(R.id.rel3);
                ImageView imageView4 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity4 = PreviewActivity.this;
                previewActivity4.bmp = previewActivity4.setBgImg(R.drawable.w_6_up_img_3);
                imageView4.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams34 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams34.setMargins(0, 0, 0, 0);
                imageView4.setLayoutParams(layoutParams34);
                PreviewActivity.this.relative3.addView(imageView4, 0);
                TextView textView31 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams35 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams35.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._66sdp), 0, 0);
                textView31.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView31.setGravity(1);
                textView31.setText(PreviewActivity.this.label6_3_Text[0]);
                textView31.setTextColor(Color.parseColor(PreviewActivity.this.label6_3_font_color[0]));
                AssetManager assets31 = PreviewActivity.this.getAssets();
                textView31.setTypeface(Typeface.createFromAsset(assets31, "fonts/" + PreviewActivity.this.label6_3_Font_name[0] + ".ttf"));
                textView31.setLayoutParams(layoutParams35);
                PreviewActivity.this.relative3.addView(textView31);
                TextView textView32 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams36 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams36.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._125sdp), 0, 0);
                textView32.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView32.setGravity(1);
                textView32.setText(PreviewActivity.this.p_getvenue_other);
                textView32.setAllCaps(true);
                textView32.setTextColor(Color.parseColor(PreviewActivity.this.label6_3_font_color[1]));
                AssetManager assets32 = PreviewActivity.this.getAssets();
                textView32.setTypeface(Typeface.createFromAsset(assets32, "fonts/" + PreviewActivity.this.label6_3_Font_name[1] + ".ttf"));
                textView32.setLayoutParams(layoutParams36);
                PreviewActivity.this.relative3.addView(textView32);
                TextView textView33 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams37 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams37.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._170sdp), 0, 0);
                textView33.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView33.setGravity(1);
                textView33.setText("Rsvp");
                textView33.setTextColor(Color.parseColor(PreviewActivity.this.label6_3_font_color[2]));
                AssetManager assets33 = PreviewActivity.this.getAssets();
                textView33.setTypeface(Typeface.createFromAsset(assets33, "fonts/" + PreviewActivity.this.label6_3_Font_name[2] + ".ttf"));
                textView33.setLayoutParams(layoutParams37);
                PreviewActivity.this.relative3.addView(textView33);
                TextView textView34 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams38 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams38.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._230sdp), 0, 0);
                textView34.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView34.setGravity(1);
                textView34.setText(PreviewActivity.this.p_getRsvp);
                textView33.setAllCaps(true);
                textView34.setTextColor(Color.parseColor(PreviewActivity.this.label6_3_font_color[3]));
                AssetManager assets34 = PreviewActivity.this.getAssets();
                textView34.setTypeface(Typeface.createFromAsset(assets34, "fonts/" + PreviewActivity.this.label6_3_Font_name[3] + ".ttf"));
                textView34.setLayoutParams(layoutParams38);
                PreviewActivity.this.relative3.addView(textView34);
                TextView textView35 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams39 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams39.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._325sdp), 0, 0);
                textView35.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView35.setGravity(1);
                textView35.setText(PreviewActivity.this.label6_3_Text[4]);
                textView35.setAllCaps(true);
                textView35.setTextColor(Color.parseColor(PreviewActivity.this.label6_3_font_color[4]));
                AssetManager assets35 = PreviewActivity.this.getAssets();
                textView35.setTypeface(Typeface.createFromAsset(assets35, "fonts/" + PreviewActivity.this.label6_3_Font_name[4] + ".ttf"));
                textView35.setLayoutParams(layoutParams39);
                PreviewActivity.this.relative3.addView(textView35);
                TextView textView36 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams40 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams40.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._350sdp), 0, 0);
                textView36.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView36.setGravity(1);
                textView36.setText(PreviewActivity.this.p_getdate_other);
                textView36.setAllCaps(true);
                textView36.setLetterSpacing(0.2f);
                textView36.setTextColor(Color.parseColor(PreviewActivity.this.label6_3_font_color[5]));
                AssetManager assets36 = PreviewActivity.this.getAssets();
                textView36.setTypeface(Typeface.createFromAsset(assets36, "fonts/" + PreviewActivity.this.label6_3_Font_name[5] + ".ttf"));
                textView36.setLayoutParams(layoutParams40);
                PreviewActivity.this.relative3.addView(textView36);
            }
            viewGroup.addView(inflate);
            return inflate;
        }

        @Override 
        public int getCount() {
            return PreviewActivity.this.layouts.length;
        }

        @Override 
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    
    public class MyViewPagerAdapter7 extends PagerAdapter {
        private LayoutInflater layoutInflater;

        @Override 
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public MyViewPagerAdapter7() {
        }

        @Override 
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = (LayoutInflater) PreviewActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.layoutInflater = layoutInflater;
            View inflate = layoutInflater.inflate(PreviewActivity.this.layouts[i], viewGroup, false);
            if (i == 0) {
                PreviewActivity.this.relative0 = (RelativeLayout) inflate.findViewById(R.id.rel0);
                ImageView imageView = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity = PreviewActivity.this;
                previewActivity.bmp = previewActivity.setBgImg(R.drawable.w_7_up_img_0);
                imageView.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams.setMargins(0, 0, 0, 0);
                imageView.setLayoutParams(layoutParams);
                PreviewActivity.this.relative0.addView(imageView, 0);
                TextView textView = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._222sdp), 0, 0);
                textView.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                textView.setGravity(1);
                textView.setText(PreviewActivity.this.label7_0_Text[0]);
                textView.setTextColor(Color.parseColor(PreviewActivity.this.label7_0_font_color[0]));
                AssetManager assets = PreviewActivity.this.getAssets();
                textView.setTypeface(Typeface.createFromAsset(assets, "fonts/" + PreviewActivity.this.label7_0_Font_name[0] + ".ttf"));
                textView.setLayoutParams(layoutParams2);
                PreviewActivity.this.relative0.addView(textView);
                TextView textView2 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._250sdp), 0, 0);
                textView2.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView2.setGravity(1);
                textView2.setText(PreviewActivity.this.p_getfirstNameG);
                textView2.setTextColor(Color.parseColor(PreviewActivity.this.label7_0_font_color[1]));
                AssetManager assets2 = PreviewActivity.this.getAssets();
                textView2.setTypeface(Typeface.createFromAsset(assets2, "fonts/" + PreviewActivity.this.label7_0_Font_name[1] + ".ttf"));
                textView2.setLayoutParams(layoutParams3);
                PreviewActivity.this.relative0.addView(textView2);
                TextView textView3 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams4.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._285sdp), 0, 0);
                textView3.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView3.setGravity(1);
                textView3.setText(PreviewActivity.this.label7_0_Text[2]);
                textView3.setTextColor(Color.parseColor(PreviewActivity.this.label7_0_font_color[2]));
                AssetManager assets3 = PreviewActivity.this.getAssets();
                textView3.setTypeface(Typeface.createFromAsset(assets3, "fonts/" + PreviewActivity.this.label7_0_Font_name[2] + ".ttf"));
                textView3.setLayoutParams(layoutParams4);
                PreviewActivity.this.relative0.addView(textView3);
                TextView textView4 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams5.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._305sdp), 0, 0);
                textView4.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView4.setGravity(1);
                textView4.setText(PreviewActivity.this.p_getfirstnameB);
                textView4.setTextColor(Color.parseColor(PreviewActivity.this.label7_0_font_color[3]));
                AssetManager assets4 = PreviewActivity.this.getAssets();
                textView4.setTypeface(Typeface.createFromAsset(assets4, "fonts/" + PreviewActivity.this.label7_0_Font_name[3] + ".ttf"));
                textView4.setLayoutParams(layoutParams5);
                PreviewActivity.this.relative0.addView(textView4);
                TextView textView5 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams6.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._350sdp), 0, 0);
                textView5.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                textView5.setGravity(1);
                textView5.setText(PreviewActivity.this.p_getdate1);
                textView5.setLetterSpacing(0.3f);
                textView5.setTextColor(Color.parseColor(PreviewActivity.this.label7_0_font_color[4]));
                AssetManager assets5 = PreviewActivity.this.getAssets();
                textView5.setTypeface(Typeface.createFromAsset(assets5, "fonts/" + PreviewActivity.this.label7_0_Font_name[4] + ".ttf"));
                textView5.setLayoutParams(layoutParams6);
                PreviewActivity.this.relative0.addView(textView5);
                TextView textView6 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams7.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._370sdp), 0, 0);
                textView6.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView6.setGravity(1);
                textView6.setText(PreviewActivity.this.label7_0_Text[5]);
                textView6.setTextColor(Color.parseColor(PreviewActivity.this.label7_0_font_color[5]));
                AssetManager assets6 = PreviewActivity.this.getAssets();
                textView6.setTypeface(Typeface.createFromAsset(assets6, "fonts/" + PreviewActivity.this.label7_0_Font_name[5] + ".ttf"));
                textView6.setLayoutParams(layoutParams7);
                PreviewActivity.this.relative0.addView(textView6);
            }
            if (i == 1) {
                PreviewActivity.this.relative1 = (RelativeLayout) inflate.findViewById(R.id.rel1);
                ImageView imageView2 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity2 = PreviewActivity.this;
                previewActivity2.bmp = previewActivity2.setBgImg(R.drawable.w_7_up_img_1);
                imageView2.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams8.setMargins(0, 0, 0, 0);
                imageView2.setLayoutParams(layoutParams8);
                PreviewActivity.this.relative1.addView(imageView2, 0);
                TextView textView7 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams9.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._35sdp), 0, 0);
                textView7.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView7.setGravity(1);
                textView7.setText(PreviewActivity.this.label7_1_Text[0]);
                textView7.setTextColor(Color.parseColor(PreviewActivity.this.label7_1_font_color[0]));
                AssetManager assets7 = PreviewActivity.this.getAssets();
                textView7.setTypeface(Typeface.createFromAsset(assets7, "fonts/" + PreviewActivity.this.label7_1_Font_name[0] + ".ttf"));
                textView7.setLayoutParams(layoutParams9);
                PreviewActivity.this.relative1.addView(textView7);
                TextView textView8 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams10.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._90sdp), 0, 0);
                textView8.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView8.setGravity(1);
                textView8.setText(PreviewActivity.this.p_getfirstNameG);
                textView8.setTextColor(Color.parseColor(PreviewActivity.this.label7_1_font_color[1]));
                AssetManager assets8 = PreviewActivity.this.getAssets();
                textView8.setTypeface(Typeface.createFromAsset(assets8, "fonts/" + PreviewActivity.this.label7_1_Font_name[1] + ".ttf"));
                textView8.setLayoutParams(layoutParams10);
                PreviewActivity.this.relative1.addView(textView8);
                TextView textView9 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams11.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._135sdp), 0, 0);
                textView9.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView9.setGravity(1);
                textView9.setText(PreviewActivity.this.p_getrelation);
                textView9.setTextColor(Color.parseColor(PreviewActivity.this.label7_1_font_color[2]));
                AssetManager assets9 = PreviewActivity.this.getAssets();
                textView9.setTypeface(Typeface.createFromAsset(assets9, "fonts/" + PreviewActivity.this.label7_1_Font_name[2] + ".ttf"));
                textView9.setLayoutParams(layoutParams11);
                PreviewActivity.this.relative1.addView(textView9);
                TextView textView10 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams12.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._150sdp), 0, 0);
                textView10.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView10.setGravity(1);
                textView10.setText("Mr. " + PreviewActivity.this.p_getfatherNAmeG + " " + PreviewActivity.this.p_getlastNameG + " & Mrs. " + PreviewActivity.this.p_getmotherNameG + " " + PreviewActivity.this.p_getlastNameG);
                textView10.setTextColor(Color.parseColor(PreviewActivity.this.label7_1_font_color[3]));
                AssetManager assets10 = PreviewActivity.this.getAssets();
                StringBuilder sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(PreviewActivity.this.label7_1_Font_name[3]);
                sb.append(".ttf");
                textView10.setTypeface(Typeface.createFromAsset(assets10, sb.toString()));
                textView10.setLayoutParams(layoutParams12);
                PreviewActivity.this.relative1.addView(textView10);
                if (!PreviewActivity.this.p_getgrandMothernameG.isEmpty() && !PreviewActivity.this.p_getgrandFathernameG.isEmpty()) {
                    TextView textView11 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams13.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._175sdp), 0, 0);
                    textView11.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView11.setGravity(1);
                    textView11.setText(PreviewActivity.this.p_getgrandrelation);
                    textView11.setTextColor(Color.parseColor(PreviewActivity.this.label7_1_font_color[3]));
                    AssetManager assets11 = PreviewActivity.this.getAssets();
                    textView11.setTypeface(Typeface.createFromAsset(assets11, "fonts/" + PreviewActivity.this.label7_1_Font_name[4] + ".ttf"));
                    textView11.setLayoutParams(layoutParams13);
                    PreviewActivity.this.relative1.addView(textView11);
                    TextView textView12 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams14.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._190sdp), 0, 0);
                    textView12.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView12.setGravity(1);
                    textView12.setText("Mr. " + PreviewActivity.this.p_getgrandFathernameG + " " + PreviewActivity.this.p_getlastNameG + " & Mrs. " + PreviewActivity.this.p_getgrandMothernameG + " " + PreviewActivity.this.p_getlastNameG);
                    textView12.setTextColor(Color.parseColor(PreviewActivity.this.label7_1_font_color[5]));
                    AssetManager assets12 = PreviewActivity.this.getAssets();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fonts/");
                    sb2.append(PreviewActivity.this.label7_1_Font_name[5]);
                    sb2.append(".ttf");
                    textView12.setTypeface(Typeface.createFromAsset(assets12, sb2.toString()));
                    textView12.setLayoutParams(layoutParams14);
                    PreviewActivity.this.relative1.addView(textView12);
                }
                TextView textView13 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams15.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._220sdp), 0, 0);
                textView13.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView13.setGravity(1);
                textView13.setText(PreviewActivity.this.p_getfirstnameB);
                textView13.setTextColor(Color.parseColor(PreviewActivity.this.label7_1_font_color[6]));
                AssetManager assets13 = PreviewActivity.this.getAssets();
                textView13.setTypeface(Typeface.createFromAsset(assets13, "fonts/" + PreviewActivity.this.label7_1_Font_name[6] + ".ttf"));
                textView13.setLayoutParams(layoutParams15);
                PreviewActivity.this.relative1.addView(textView13);
                TextView textView14 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams16.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._265sdp), 0, 0);
                textView14.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView14.setGravity(1);
                textView14.setText(PreviewActivity.this.p_getsecondrelation);
                textView14.setTextColor(Color.parseColor(PreviewActivity.this.label7_1_font_color[7]));
                AssetManager assets14 = PreviewActivity.this.getAssets();
                textView14.setTypeface(Typeface.createFromAsset(assets14, "fonts/" + PreviewActivity.this.label7_1_Font_name[7] + ".ttf"));
                textView14.setLayoutParams(layoutParams16);
                PreviewActivity.this.relative1.addView(textView14);
                TextView textView15 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams17.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._280sdp), 0, 0);
                textView15.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView15.setGravity(1);
                textView15.setText("Mr. " + PreviewActivity.this.p_getfatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & Mrs. " + PreviewActivity.this.p_getmotherNameB + " " + PreviewActivity.this.p_getlastNameB);
                textView15.setTextColor(Color.parseColor(PreviewActivity.this.label7_1_font_color[8]));
                AssetManager assets15 = PreviewActivity.this.getAssets();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("fonts/");
                sb3.append(PreviewActivity.this.label7_1_Font_name[8]);
                sb3.append(".ttf");
                textView15.setTypeface(Typeface.createFromAsset(assets15, sb3.toString()));
                textView15.setLayoutParams(layoutParams17);
                PreviewActivity.this.relative1.addView(textView15);
                if (!PreviewActivity.this.p_getgrandMothernameB.isEmpty() && !PreviewActivity.this.p_getgrandFatherNameB.isEmpty()) {
                    TextView textView16 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams18.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._310sdp), 0, 0);
                    textView16.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView16.setGravity(1);
                    textView16.setText(PreviewActivity.this.p_getsecondgrandrelation);
                    textView16.setTextColor(Color.parseColor(PreviewActivity.this.label7_1_font_color[9]));
                    AssetManager assets16 = PreviewActivity.this.getAssets();
                    textView16.setTypeface(Typeface.createFromAsset(assets16, "fonts/" + PreviewActivity.this.label7_1_Font_name[9] + ".ttf"));
                    textView16.setLayoutParams(layoutParams18);
                    PreviewActivity.this.relative1.addView(textView16);
                    TextView textView17 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams19.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._325sdp), 0, 0);
                    textView17.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView17.setGravity(1);
                    textView17.setText("Mr. " + PreviewActivity.this.p_getgrandFatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & Mrs. " + PreviewActivity.this.p_getgrandMothernameG + " " + PreviewActivity.this.p_getlastNameB);
                    textView17.setTextColor(Color.parseColor(PreviewActivity.this.label7_1_font_color[10]));
                    AssetManager assets17 = PreviewActivity.this.getAssets();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("fonts/");
                    sb4.append(PreviewActivity.this.label7_1_Font_name[10]);
                    sb4.append(".ttf");
                    textView17.setTypeface(Typeface.createFromAsset(assets17, sb4.toString()));
                    textView17.setLayoutParams(layoutParams19);
                    PreviewActivity.this.relative1.addView(textView17);
                }
                TextView textView18 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams20 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams20.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._365sdp), 0, 0);
                textView18.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._7sdp));
                textView18.setGravity(1);
                textView18.setText(PreviewActivity.this.label7_1_Text[11]);
                textView18.setTextColor(Color.parseColor(PreviewActivity.this.label7_1_font_color[11]));
                AssetManager assets18 = PreviewActivity.this.getAssets();
                textView18.setTypeface(Typeface.createFromAsset(assets18, "fonts/" + PreviewActivity.this.label7_1_Font_name[11] + ".ttf"));
                textView18.setLayoutParams(layoutParams20);
                PreviewActivity.this.relative1.addView(textView18);
            }
            if (i == 2) {
                PreviewActivity.this.relative2 = (RelativeLayout) inflate.findViewById(R.id.rel2);
                ImageView imageView3 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity3 = PreviewActivity.this;
                previewActivity3.bmp = previewActivity3.setBgImg(R.drawable.w_7_up_img_2);
                imageView3.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams21.setMargins(0, 0, 0, 0);
                imageView3.setLayoutParams(layoutParams21);
                PreviewActivity.this.relative2.addView(imageView3, 0);
                TextView textView19 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams22.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp), 0, 0);
                textView19.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView19.setGravity(1);
                textView19.setText(PreviewActivity.this.label7_2_Text[0]);
                textView19.setTextColor(Color.parseColor(PreviewActivity.this.label7_2_font_color[0]));
                AssetManager assets19 = PreviewActivity.this.getAssets();
                textView19.setTypeface(Typeface.createFromAsset(assets19, "fonts/" + PreviewActivity.this.label7_2_Font_name[0] + ".ttf"));
                textView19.setLayoutParams(layoutParams22);
                PreviewActivity.this.relative2.addView(textView19);
                if (PreviewActivity.this.lenear2 != null) {
                    TextView textView20 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams23 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams23.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._100sdp), 0, 0);
                    textView20.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                    textView20.setGravity(1);
                    textView20.setText(PreviewActivity.this.p_getfunctionname1);
                    textView20.setTextColor(Color.parseColor(PreviewActivity.this.label7_2_font_color[1]));
                    AssetManager assets20 = PreviewActivity.this.getAssets();
                    textView20.setTypeface(Typeface.createFromAsset(assets20, "fonts/" + PreviewActivity.this.label7_2_Font_name[1] + ".ttf"));
                    textView20.setLayoutParams(layoutParams23);
                    PreviewActivity.this.relative2.addView(textView20);
                    TextView textView21 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams24.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._140sdp), 0, 0);
                    textView21.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView21.setGravity(1);
                    textView21.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView21.setTextColor(Color.parseColor(PreviewActivity.this.label7_2_font_color[2]));
                    AssetManager assets21 = PreviewActivity.this.getAssets();
                    textView21.setTypeface(Typeface.createFromAsset(assets21, "fonts/" + PreviewActivity.this.label7_2_Font_name[2] + ".ttf"));
                    textView21.setLayoutParams(layoutParams24);
                    PreviewActivity.this.relative2.addView(textView21);
                    TextView textView22 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams25.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._155sdp), 0, 0);
                    textView22.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView22.setGravity(1);
                    textView22.setText(PreviewActivity.this.p_getvenue1);
                    textView22.setTextColor(Color.parseColor(PreviewActivity.this.label7_2_font_color[3]));
                    AssetManager assets22 = PreviewActivity.this.getAssets();
                    textView22.setTypeface(Typeface.createFromAsset(assets22, "fonts/" + PreviewActivity.this.label7_2_Font_name[3] + ".ttf"));
                    textView22.setLayoutParams(layoutParams25);
                    PreviewActivity.this.relative2.addView(textView22);
                } else {
                    TextView textView23 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams26 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams26.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._185sdp), 0, 0);
                    textView23.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                    textView23.setGravity(1);
                    textView23.setText(PreviewActivity.this.p_getfunctionname1);
                    textView23.setTextColor(Color.parseColor(PreviewActivity.this.label7_2_font_color[1]));
                    AssetManager assets23 = PreviewActivity.this.getAssets();
                    textView23.setTypeface(Typeface.createFromAsset(assets23, "fonts/" + PreviewActivity.this.label7_2_Font_name[1] + ".ttf"));
                    textView23.setLayoutParams(layoutParams26);
                    PreviewActivity.this.relative2.addView(textView23);
                    TextView textView24 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams27.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._225sdp), 0, 0);
                    textView24.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView24.setGravity(1);
                    textView24.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView24.setTextColor(Color.parseColor(PreviewActivity.this.label7_2_font_color[2]));
                    AssetManager assets24 = PreviewActivity.this.getAssets();
                    textView24.setTypeface(Typeface.createFromAsset(assets24, "fonts/" + PreviewActivity.this.label7_2_Font_name[2] + ".ttf"));
                    textView24.setLayoutParams(layoutParams27);
                    PreviewActivity.this.relative2.addView(textView24);
                    TextView textView25 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams28 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams28.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._240sdp), 0, 0);
                    textView25.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView25.setGravity(1);
                    textView25.setText(PreviewActivity.this.p_getvenue1);
                    textView25.setTextColor(Color.parseColor(PreviewActivity.this.label7_2_font_color[3]));
                    AssetManager assets25 = PreviewActivity.this.getAssets();
                    textView25.setTypeface(Typeface.createFromAsset(assets25, "fonts/" + PreviewActivity.this.label7_2_Font_name[3] + ".ttf"));
                    textView25.setLayoutParams(layoutParams28);
                    PreviewActivity.this.relative2.addView(textView25);
                }
                if (PreviewActivity.this.p_getfunctionname2 != null) {
                    TextView textView26 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams29 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams29.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._185sdp), 0, 0);
                    textView26.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                    textView26.setGravity(1);
                    textView26.setText(PreviewActivity.this.p_getfunctionname2);
                    textView26.setTextColor(Color.parseColor(PreviewActivity.this.label7_2_font_color[4]));
                    AssetManager assets26 = PreviewActivity.this.getAssets();
                    textView26.setTypeface(Typeface.createFromAsset(assets26, "fonts/" + PreviewActivity.this.label7_2_Font_name[4] + ".ttf"));
                    textView26.setLayoutParams(layoutParams29);
                    PreviewActivity.this.relative2.addView(textView26);
                    TextView textView27 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams30 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams30.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._225sdp), 0, 0);
                    textView27.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView27.setGravity(1);
                    textView27.setText(PreviewActivity.this.p_getdate2 + ", " + PreviewActivity.this.p_gettime2 + " Onwards");
                    textView27.setTextColor(Color.parseColor(PreviewActivity.this.label7_2_font_color[5]));
                    AssetManager assets27 = PreviewActivity.this.getAssets();
                    textView27.setTypeface(Typeface.createFromAsset(assets27, "fonts/" + PreviewActivity.this.label7_2_Font_name[5] + ".ttf"));
                    textView27.setLayoutParams(layoutParams30);
                    PreviewActivity.this.relative2.addView(textView27);
                    TextView textView28 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams31 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams31.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._240sdp), 0, 0);
                    textView28.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView28.setGravity(1);
                    textView28.setText(PreviewActivity.this.p_getvenue2);
                    textView28.setTextColor(Color.parseColor(PreviewActivity.this.label7_2_font_color[6]));
                    AssetManager assets28 = PreviewActivity.this.getAssets();
                    textView28.setTypeface(Typeface.createFromAsset(assets28, "fonts/" + PreviewActivity.this.label7_2_Font_name[6] + ".ttf"));
                    textView28.setLayoutParams(layoutParams31);
                    PreviewActivity.this.relative2.addView(textView28);
                }
                if (PreviewActivity.this.p_getfunctionname3 != null) {
                    TextView textView29 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams32 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams32.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._270sdp), 0, 0);
                    textView29.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                    textView29.setGravity(1);
                    textView29.setText(PreviewActivity.this.p_getfunctionname3);
                    textView29.setTextColor(Color.parseColor(PreviewActivity.this.label7_2_font_color[7]));
                    AssetManager assets29 = PreviewActivity.this.getAssets();
                    textView29.setTypeface(Typeface.createFromAsset(assets29, "fonts/" + PreviewActivity.this.label7_2_Font_name[7] + ".ttf"));
                    textView29.setLayoutParams(layoutParams32);
                    PreviewActivity.this.relative2.addView(textView29);
                    TextView textView30 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams33 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams33.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._310sdp), 0, 0);
                    textView30.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView30.setGravity(1);
                    textView30.setText(PreviewActivity.this.p_getdate3 + ", " + PreviewActivity.this.p_gettime3 + " Onwards");
                    textView30.setTextColor(Color.parseColor(PreviewActivity.this.label7_2_font_color[8]));
                    AssetManager assets30 = PreviewActivity.this.getAssets();
                    textView30.setTypeface(Typeface.createFromAsset(assets30, "fonts/" + PreviewActivity.this.label7_2_Font_name[8] + ".ttf"));
                    textView30.setLayoutParams(layoutParams33);
                    PreviewActivity.this.relative2.addView(textView30);
                    TextView textView31 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams34 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams34.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._325sdp), 0, 0);
                    textView31.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView31.setGravity(1);
                    textView31.setText(PreviewActivity.this.p_getvenue3);
                    textView31.setTextColor(Color.parseColor(PreviewActivity.this.label7_2_font_color[9]));
                    AssetManager assets31 = PreviewActivity.this.getAssets();
                    textView31.setTypeface(Typeface.createFromAsset(assets31, "fonts/" + PreviewActivity.this.label7_2_Font_name[9] + ".ttf"));
                    textView31.setLayoutParams(layoutParams34);
                    PreviewActivity.this.relative2.addView(textView31);
                }
            }
            if (i == 3) {
                PreviewActivity.this.relative3 = (RelativeLayout) inflate.findViewById(R.id.rel3);
                ImageView imageView4 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity4 = PreviewActivity.this;
                previewActivity4.bmp = previewActivity4.setBgImg(R.drawable.w_7_up_img_3);
                imageView4.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams35 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams35.setMargins(0, 0, 0, 0);
                imageView4.setLayoutParams(layoutParams35);
                PreviewActivity.this.relative3.addView(imageView4, 0);
                TextView textView32 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams36 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams36.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._65sdp), 0, 0);
                textView32.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView32.setGravity(1);
                textView32.setText(PreviewActivity.this.label7_3_Text[0]);
                textView32.setTextColor(Color.parseColor(PreviewActivity.this.label7_3_font_color[0]));
                AssetManager assets32 = PreviewActivity.this.getAssets();
                textView32.setTypeface(Typeface.createFromAsset(assets32, "fonts/" + PreviewActivity.this.label7_3_Font_name[0] + ".ttf"));
                textView32.setLayoutParams(layoutParams36);
                PreviewActivity.this.relative3.addView(textView32);
                TextView textView33 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams37 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams37.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._120sdp), 0, 0);
                textView33.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView33.setGravity(1);
                textView33.setText(PreviewActivity.this.p_getvenue_other);
                textView33.setTextColor(Color.parseColor(PreviewActivity.this.label7_3_font_color[1]));
                AssetManager assets33 = PreviewActivity.this.getAssets();
                textView33.setTypeface(Typeface.createFromAsset(assets33, "fonts/" + PreviewActivity.this.label7_3_Font_name[1] + ".ttf"));
                textView33.setLayoutParams(layoutParams37);
                PreviewActivity.this.relative3.addView(textView33);
                TextView textView34 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams38 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams38.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._160sdp), 0, 0);
                textView34.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView34.setGravity(1);
                textView34.setText("Rsvp");
                textView34.setTextColor(Color.parseColor(PreviewActivity.this.label7_3_font_color[2]));
                AssetManager assets34 = PreviewActivity.this.getAssets();
                textView34.setTypeface(Typeface.createFromAsset(assets34, "fonts/" + PreviewActivity.this.label7_3_Font_name[2] + ".ttf"));
                textView34.setLayoutParams(layoutParams38);
                PreviewActivity.this.relative3.addView(textView34);
                TextView textView35 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams39 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams39.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._210sdp), 0, 0);
                textView35.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView35.setGravity(1);
                textView35.setText(PreviewActivity.this.p_getRsvp);
                textView35.setTextColor(Color.parseColor(PreviewActivity.this.label7_3_font_color[3]));
                AssetManager assets35 = PreviewActivity.this.getAssets();
                textView35.setTypeface(Typeface.createFromAsset(assets35, "fonts/" + PreviewActivity.this.label7_3_Font_name[3] + ".ttf"));
                textView35.setLayoutParams(layoutParams39);
                PreviewActivity.this.relative3.addView(textView35);
                TextView textView36 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams40 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams40.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._320sdp), 0, 0);
                textView36.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                textView36.setGravity(1);
                textView36.setText(PreviewActivity.this.p_getdate_other);
                textView36.setTextColor(Color.parseColor(PreviewActivity.this.label7_3_font_color[4]));
                AssetManager assets36 = PreviewActivity.this.getAssets();
                textView36.setTypeface(Typeface.createFromAsset(assets36, "fonts/" + PreviewActivity.this.label7_3_Font_name[4] + ".ttf"));
                textView36.setLayoutParams(layoutParams40);
                PreviewActivity.this.relative3.addView(textView36);
                TextView textView37 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams41 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams41.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._350sdp), 0, 0);
                textView37.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView37.setGravity(1);
                textView37.setText(PreviewActivity.this.label7_3_Text[5]);
                textView37.setTextColor(Color.parseColor(PreviewActivity.this.label7_3_font_color[5]));
                AssetManager assets37 = PreviewActivity.this.getAssets();
                textView37.setTypeface(Typeface.createFromAsset(assets37, "fonts/" + PreviewActivity.this.label7_3_Font_name[5] + ".ttf"));
                textView37.setLayoutParams(layoutParams41);
                PreviewActivity.this.relative3.addView(textView37);
            }
            viewGroup.addView(inflate);
            return inflate;
        }

        @Override 
        public int getCount() {
            return PreviewActivity.this.layouts.length;
        }

        @Override 
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    
    public class MyViewPagerAdapter8 extends PagerAdapter {
        private LayoutInflater layoutInflater;

        @Override 
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public MyViewPagerAdapter8() {
        }

        @Override 
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = (LayoutInflater) PreviewActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.layoutInflater = layoutInflater;
            View inflate = layoutInflater.inflate(PreviewActivity.this.layouts[i], viewGroup, false);
            if (i == 0) {
                PreviewActivity.this.relative0 = (RelativeLayout) inflate.findViewById(R.id.rel0);
                ImageView imageView = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity = PreviewActivity.this;
                previewActivity.bmp = previewActivity.setBgImg(R.drawable.w_8_up_img_0);
                imageView.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams.setMargins(0, 0, 0, 0);
                imageView.setLayoutParams(layoutParams);
                PreviewActivity.this.relative0.addView(imageView, 0);
                TextView textView = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._75sdp), 0, 0);
                textView.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView.setGravity(1);
                textView.setText(PreviewActivity.this.label8_0_Text[0]);
                textView.setTextColor(Color.parseColor(PreviewActivity.this.label8_0_font_color[0]));
                AssetManager assets = PreviewActivity.this.getAssets();
                textView.setTypeface(Typeface.createFromAsset(assets, "fonts/" + PreviewActivity.this.label8_0_Font_name[0] + ".ttf"));
                textView.setLayoutParams(layoutParams2);
                PreviewActivity.this.relative0.addView(textView);
                TextView textView2 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._120sdp), 0, 0);
                textView2.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView2.setGravity(1);
                textView2.setText(PreviewActivity.this.p_getdate1);
                textView2.setLetterSpacing(0.1f);
                textView2.setTextColor(Color.parseColor(PreviewActivity.this.label8_0_font_color[1]));
                AssetManager assets2 = PreviewActivity.this.getAssets();
                textView2.setTypeface(Typeface.createFromAsset(assets2, "fonts/" + PreviewActivity.this.label8_0_Font_name[1] + ".ttf"));
                textView2.setLayoutParams(layoutParams3);
                PreviewActivity.this.relative0.addView(textView2);
                TextView textView3 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams4.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._150sdp), 0, 0);
                textView3.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView3.setGravity(1);
                textView3.setText(PreviewActivity.this.label8_0_Text[2]);
                textView3.setTextColor(Color.parseColor(PreviewActivity.this.label8_0_font_color[2]));
                AssetManager assets3 = PreviewActivity.this.getAssets();
                textView3.setTypeface(Typeface.createFromAsset(assets3, "fonts/" + PreviewActivity.this.label8_0_Font_name[2] + ".ttf"));
                textView3.setLayoutParams(layoutParams4);
                PreviewActivity.this.relative0.addView(textView3);
                TextView textView4 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams5.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._180sdp), 0, 0);
                textView4.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView4.setGravity(1);
                textView4.setText(PreviewActivity.this.label8_0_Text[3]);
                textView4.setTextColor(Color.parseColor(PreviewActivity.this.label8_0_font_color[3]));
                AssetManager assets4 = PreviewActivity.this.getAssets();
                textView4.setTypeface(Typeface.createFromAsset(assets4, "fonts/" + PreviewActivity.this.label8_0_Font_name[3] + ".ttf"));
                textView4.setLayoutParams(layoutParams5);
                PreviewActivity.this.relative0.addView(textView4);
                TextView textView5 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams6.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._210sdp), 0, 0);
                textView5.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView5.setGravity(1);
                textView5.setText(PreviewActivity.this.label8_0_Text[4]);
                textView5.setTextColor(Color.parseColor(PreviewActivity.this.label8_0_font_color[4]));
                AssetManager assets5 = PreviewActivity.this.getAssets();
                textView5.setTypeface(Typeface.createFromAsset(assets5, "fonts/" + PreviewActivity.this.label8_0_Font_name[4] + ".ttf"));
                textView5.setLayoutParams(layoutParams6);
                PreviewActivity.this.relative0.addView(textView5);
                TextView textView6 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams7.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._250sdp), 0, 0);
                textView6.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView6.setGravity(1);
                textView6.setText(PreviewActivity.this.p_getfirstNameG);
                textView6.setTextColor(Color.parseColor(PreviewActivity.this.label8_0_font_color[5]));
                AssetManager assets6 = PreviewActivity.this.getAssets();
                textView6.setTypeface(Typeface.createFromAsset(assets6, "fonts/" + PreviewActivity.this.label8_0_Font_name[5] + ".ttf"));
                textView6.setLayoutParams(layoutParams7);
                PreviewActivity.this.relative0.addView(textView6);
                TextView textView7 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams8.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._285sdp), 0, 0);
                textView7.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView7.setGravity(1);
                textView7.setText(PreviewActivity.this.label8_0_Text[6]);
                textView7.setTextColor(Color.parseColor(PreviewActivity.this.label8_0_font_color[6]));
                AssetManager assets7 = PreviewActivity.this.getAssets();
                textView7.setTypeface(Typeface.createFromAsset(assets7, "fonts/" + PreviewActivity.this.label8_0_Font_name[6] + ".ttf"));
                textView7.setLayoutParams(layoutParams8);
                PreviewActivity.this.relative0.addView(textView7);
                TextView textView8 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams9.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._320sdp), 0, 0);
                textView8.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView8.setGravity(1);
                textView8.setText(PreviewActivity.this.p_getfirstnameB);
                textView8.setTextColor(Color.parseColor(PreviewActivity.this.label8_0_font_color[7]));
                AssetManager assets8 = PreviewActivity.this.getAssets();
                textView8.setTypeface(Typeface.createFromAsset(assets8, "fonts/" + PreviewActivity.this.label8_0_Font_name[7] + ".ttf"));
                textView8.setLayoutParams(layoutParams9);
                PreviewActivity.this.relative0.addView(textView8);
            }
            if (i == 1) {
                PreviewActivity.this.relative1 = (RelativeLayout) inflate.findViewById(R.id.rel1);
                ImageView imageView2 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity2 = PreviewActivity.this;
                previewActivity2.bmp = previewActivity2.setBgImg(R.drawable.w_8_up_img_1);
                imageView2.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams10.setMargins(0, 0, 0, 0);
                imageView2.setLayoutParams(layoutParams10);
                PreviewActivity.this.relative1.addView(imageView2, 0);
                TextView textView9 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams11.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._70sdp), 0, 0);
                textView9.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView9.setGravity(1);
                textView9.setText(PreviewActivity.this.label8_1_Text[0]);
                textView9.setTextColor(Color.parseColor(PreviewActivity.this.label8_1_font_color[0]));
                AssetManager assets9 = PreviewActivity.this.getAssets();
                textView9.setTypeface(Typeface.createFromAsset(assets9, "fonts/" + PreviewActivity.this.label8_1_Font_name[0] + ".ttf"));
                textView9.setLayoutParams(layoutParams11);
                PreviewActivity.this.relative1.addView(textView9);
                TextView textView10 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams12.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._115sdp), 0, 0);
                textView10.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView10.setGravity(1);
                textView10.setText(PreviewActivity.this.p_getfirstNameG);
                textView10.setTextColor(Color.parseColor(PreviewActivity.this.label8_1_font_color[1]));
                AssetManager assets10 = PreviewActivity.this.getAssets();
                textView10.setTypeface(Typeface.createFromAsset(assets10, "fonts/" + PreviewActivity.this.label8_1_Font_name[1] + ".ttf"));
                textView10.setLayoutParams(layoutParams12);
                PreviewActivity.this.relative1.addView(textView10);
                TextView textView11 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams13.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._155sdp), 0, 0);
                textView11.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView11.setGravity(1);
                textView11.setText(PreviewActivity.this.p_getrelation);
                textView11.setTextColor(Color.parseColor(PreviewActivity.this.label8_1_font_color[2]));
                AssetManager assets11 = PreviewActivity.this.getAssets();
                textView11.setTypeface(Typeface.createFromAsset(assets11, "fonts/" + PreviewActivity.this.label8_1_Font_name[2] + ".ttf"));
                textView11.setLayoutParams(layoutParams13);
                PreviewActivity.this.relative1.addView(textView11);
                TextView textView12 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams14.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._165sdp), 0, 0);
                textView12.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView12.setGravity(1);
                textView12.setText("Mr. " + PreviewActivity.this.p_getfatherNAmeG + " " + PreviewActivity.this.p_getlastNameG + " & Mrs. " + PreviewActivity.this.p_getmotherNameG + " " + PreviewActivity.this.p_getlastNameG);
                textView12.setTextColor(Color.parseColor(PreviewActivity.this.label8_1_font_color[3]));
                AssetManager assets12 = PreviewActivity.this.getAssets();
                StringBuilder sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(PreviewActivity.this.label8_1_Font_name[3]);
                sb.append(".ttf");
                textView12.setTypeface(Typeface.createFromAsset(assets12, sb.toString()));
                textView12.setLayoutParams(layoutParams14);
                PreviewActivity.this.relative1.addView(textView12);
                if (!PreviewActivity.this.p_getgrandMothernameG.isEmpty() && !PreviewActivity.this.p_getgrandFathernameG.isEmpty()) {
                    TextView textView13 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams15.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._185sdp), 0, 0);
                    textView13.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView13.setGravity(1);
                    textView13.setText(PreviewActivity.this.p_getgrandrelation);
                    textView13.setTextColor(Color.parseColor(PreviewActivity.this.label8_1_font_color[4]));
                    AssetManager assets13 = PreviewActivity.this.getAssets();
                    textView13.setTypeface(Typeface.createFromAsset(assets13, "fonts/" + PreviewActivity.this.label8_1_Font_name[4] + ".ttf"));
                    textView13.setLayoutParams(layoutParams15);
                    PreviewActivity.this.relative1.addView(textView13);
                    TextView textView14 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams16.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._195sdp), 0, 0);
                    textView14.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView14.setGravity(1);
                    textView14.setText("Mr. " + PreviewActivity.this.p_getgrandFathernameG + " " + PreviewActivity.this.p_getlastNameG + " & Mrs. " + PreviewActivity.this.p_getgrandMothernameG + " " + PreviewActivity.this.p_getlastNameG);
                    textView14.setTextColor(Color.parseColor(PreviewActivity.this.label8_1_font_color[5]));
                    AssetManager assets14 = PreviewActivity.this.getAssets();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fonts/");
                    sb2.append(PreviewActivity.this.label8_1_Font_name[5]);
                    sb2.append(".ttf");
                    textView14.setTypeface(Typeface.createFromAsset(assets14, sb2.toString()));
                    textView14.setLayoutParams(layoutParams16);
                    PreviewActivity.this.relative1.addView(textView14);
                }
                TextView textView15 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams17.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._220sdp), 0, 0);
                textView15.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView15.setGravity(1);
                textView15.setText(PreviewActivity.this.p_getfirstnameB);
                textView15.setTextColor(Color.parseColor(PreviewActivity.this.label8_1_font_color[6]));
                AssetManager assets15 = PreviewActivity.this.getAssets();
                textView15.setTypeface(Typeface.createFromAsset(assets15, "fonts/" + PreviewActivity.this.label8_1_Font_name[6] + ".ttf"));
                textView15.setLayoutParams(layoutParams17);
                PreviewActivity.this.relative1.addView(textView15);
                TextView textView16 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams18.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._255sdp), 0, 0);
                textView16.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView16.setGravity(1);
                textView16.setText(PreviewActivity.this.p_getsecondrelation);
                textView16.setTextColor(Color.parseColor(PreviewActivity.this.label8_1_font_color[7]));
                AssetManager assets16 = PreviewActivity.this.getAssets();
                textView16.setTypeface(Typeface.createFromAsset(assets16, "fonts/" + PreviewActivity.this.label8_1_Font_name[7] + ".ttf"));
                textView16.setLayoutParams(layoutParams18);
                PreviewActivity.this.relative1.addView(textView16);
                TextView textView17 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams19.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._265sdp), 0, 0);
                textView17.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView17.setGravity(1);
                textView17.setText("Mr. " + PreviewActivity.this.p_getfatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & Mrs. " + PreviewActivity.this.p_getmotherNameB + " " + PreviewActivity.this.p_getlastNameB);
                textView17.setTextColor(Color.parseColor(PreviewActivity.this.label8_1_font_color[8]));
                AssetManager assets17 = PreviewActivity.this.getAssets();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("fonts/");
                sb3.append(PreviewActivity.this.label8_1_Font_name[8]);
                sb3.append(".ttf");
                textView17.setTypeface(Typeface.createFromAsset(assets17, sb3.toString()));
                textView17.setLayoutParams(layoutParams19);
                PreviewActivity.this.relative1.addView(textView17);
                if (!PreviewActivity.this.p_getgrandMothernameB.isEmpty() && !PreviewActivity.this.p_getgrandFatherNameB.isEmpty()) {
                    TextView textView18 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams20 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams20.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._285sdp), 0, 0);
                    textView18.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView18.setGravity(1);
                    textView18.setText(PreviewActivity.this.p_getsecondgrandrelation);
                    textView18.setTextColor(Color.parseColor(PreviewActivity.this.label8_1_font_color[9]));
                    AssetManager assets18 = PreviewActivity.this.getAssets();
                    textView18.setTypeface(Typeface.createFromAsset(assets18, "fonts/" + PreviewActivity.this.label8_1_Font_name[9] + ".ttf"));
                    textView18.setLayoutParams(layoutParams20);
                    PreviewActivity.this.relative1.addView(textView18);
                    TextView textView19 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams21 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams21.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._295sdp), 0, 0);
                    textView19.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView19.setGravity(1);
                    textView19.setText("Mr. " + PreviewActivity.this.p_getgrandFatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & Mrs. " + PreviewActivity.this.p_getgrandMothernameB + " " + PreviewActivity.this.p_getlastNameB);
                    textView19.setTextColor(Color.parseColor(PreviewActivity.this.label8_1_font_color[10]));
                    AssetManager assets19 = PreviewActivity.this.getAssets();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("fonts/");
                    sb4.append(PreviewActivity.this.label8_1_Font_name[10]);
                    sb4.append(".ttf");
                    textView19.setTypeface(Typeface.createFromAsset(assets19, sb4.toString()));
                    textView19.setLayoutParams(layoutParams21);
                    PreviewActivity.this.relative1.addView(textView19);
                }
                TextView textView20 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams22.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._325sdp), 0, 0);
                textView20.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._7sdp));
                textView20.setGravity(1);
                textView20.setText(PreviewActivity.this.label8_1_Text[11]);
                textView20.setTextColor(Color.parseColor(PreviewActivity.this.label8_1_font_color[11]));
                AssetManager assets20 = PreviewActivity.this.getAssets();
                textView20.setTypeface(Typeface.createFromAsset(assets20, "fonts/" + PreviewActivity.this.label8_1_Font_name[11] + ".ttf"));
                textView20.setLayoutParams(layoutParams22);
                PreviewActivity.this.relative1.addView(textView20);
            }
            if (i == 2) {
                PreviewActivity.this.relative2 = (RelativeLayout) inflate.findViewById(R.id.rel2);
                ImageView imageView3 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity3 = PreviewActivity.this;
                previewActivity3.bmp = previewActivity3.setBgImg(R.drawable.w_8_up_img_2);
                imageView3.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams23 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams23.setMargins(0, 0, 0, 0);
                imageView3.setLayoutParams(layoutParams23);
                PreviewActivity.this.relative2.addView(imageView3, 0);
                TextView textView21 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams24.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._75sdp), 0, 0);
                textView21.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView21.setGravity(1);
                textView21.setText(PreviewActivity.this.label8_2_Text[0]);
                textView21.setTextColor(Color.parseColor(PreviewActivity.this.label8_2_font_color[0]));
                AssetManager assets21 = PreviewActivity.this.getAssets();
                textView21.setTypeface(Typeface.createFromAsset(assets21, "fonts/" + PreviewActivity.this.label8_2_Font_name[0] + ".ttf"));
                textView21.setLayoutParams(layoutParams24);
                PreviewActivity.this.relative2.addView(textView21);
                if (PreviewActivity.this.lenear2 != null) {
                    TextView textView22 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams25.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._120sdp), 0, 0);
                    textView22.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    textView22.setGravity(1);
                    textView22.setText(PreviewActivity.this.p_getfunctionname1);
                    textView22.setTextColor(Color.parseColor(PreviewActivity.this.label8_2_font_color[1]));
                    AssetManager assets22 = PreviewActivity.this.getAssets();
                    textView22.setTypeface(Typeface.createFromAsset(assets22, "fonts/" + PreviewActivity.this.label8_2_Font_name[1] + ".ttf"));
                    textView22.setLayoutParams(layoutParams25);
                    PreviewActivity.this.relative2.addView(textView22);
                    TextView textView23 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams26 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams26.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._155sdp), 0, 0);
                    textView23.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView23.setGravity(1);
                    textView23.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView23.setTextColor(Color.parseColor(PreviewActivity.this.label8_2_font_color[2]));
                    AssetManager assets23 = PreviewActivity.this.getAssets();
                    textView23.setTypeface(Typeface.createFromAsset(assets23, "fonts/" + PreviewActivity.this.label8_2_Font_name[2] + ".ttf"));
                    textView23.setLayoutParams(layoutParams26);
                    PreviewActivity.this.relative2.addView(textView23);
                    TextView textView24 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams27.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._168sdp), 0, 0);
                    textView24.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView24.setGravity(1);
                    textView24.setText(PreviewActivity.this.p_getvenue1);
                    textView24.setTextColor(Color.parseColor(PreviewActivity.this.label8_2_font_color[3]));
                    AssetManager assets24 = PreviewActivity.this.getAssets();
                    textView24.setTypeface(Typeface.createFromAsset(assets24, "fonts/" + PreviewActivity.this.label8_2_Font_name[3] + ".ttf"));
                    textView24.setLayoutParams(layoutParams27);
                    PreviewActivity.this.relative2.addView(textView24);
                } else {
                    TextView textView25 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams28 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams28.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._195sdp), 0, 0);
                    textView25.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    textView25.setGravity(1);
                    textView25.setText(PreviewActivity.this.p_getfunctionname1);
                    textView25.setTextColor(Color.parseColor(PreviewActivity.this.label8_2_font_color[1]));
                    AssetManager assets25 = PreviewActivity.this.getAssets();
                    textView25.setTypeface(Typeface.createFromAsset(assets25, "fonts/" + PreviewActivity.this.label8_2_Font_name[1] + ".ttf"));
                    textView25.setLayoutParams(layoutParams28);
                    PreviewActivity.this.relative2.addView(textView25);
                    TextView textView26 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams29 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams29.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._230sdp), 0, 0);
                    textView26.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView26.setGravity(1);
                    textView26.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView26.setTextColor(Color.parseColor(PreviewActivity.this.label8_2_font_color[2]));
                    AssetManager assets26 = PreviewActivity.this.getAssets();
                    textView26.setTypeface(Typeface.createFromAsset(assets26, "fonts/" + PreviewActivity.this.label8_2_Font_name[2] + ".ttf"));
                    textView26.setLayoutParams(layoutParams29);
                    PreviewActivity.this.relative2.addView(textView26);
                    TextView textView27 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams30 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams30.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._242sdp), 0, 0);
                    textView27.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView27.setGravity(1);
                    textView27.setText(PreviewActivity.this.p_getvenue1);
                    textView27.setTextColor(Color.parseColor(PreviewActivity.this.label8_2_font_color[3]));
                    AssetManager assets27 = PreviewActivity.this.getAssets();
                    textView27.setTypeface(Typeface.createFromAsset(assets27, "fonts/" + PreviewActivity.this.label8_2_Font_name[3] + ".ttf"));
                    textView27.setLayoutParams(layoutParams30);
                    PreviewActivity.this.relative2.addView(textView27);
                }
                if (PreviewActivity.this.p_getfunctionname2 != null) {
                    TextView textView28 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams31 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams31.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._195sdp), 0, 0);
                    textView28.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    textView28.setGravity(1);
                    textView28.setText(PreviewActivity.this.p_getfunctionname2);
                    textView28.setTextColor(Color.parseColor(PreviewActivity.this.label8_2_font_color[4]));
                    AssetManager assets28 = PreviewActivity.this.getAssets();
                    textView28.setTypeface(Typeface.createFromAsset(assets28, "fonts/" + PreviewActivity.this.label8_2_Font_name[4] + ".ttf"));
                    textView28.setLayoutParams(layoutParams31);
                    PreviewActivity.this.relative2.addView(textView28);
                    TextView textView29 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams32 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams32.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._230sdp), 0, 0);
                    textView29.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView29.setGravity(1);
                    textView29.setText(PreviewActivity.this.p_getdate2 + ", " + PreviewActivity.this.p_gettime2 + " Onwards");
                    textView29.setTextColor(Color.parseColor(PreviewActivity.this.label8_2_font_color[5]));
                    AssetManager assets29 = PreviewActivity.this.getAssets();
                    textView29.setTypeface(Typeface.createFromAsset(assets29, "fonts/" + PreviewActivity.this.label8_2_Font_name[5] + ".ttf"));
                    textView29.setLayoutParams(layoutParams32);
                    PreviewActivity.this.relative2.addView(textView29);
                    TextView textView30 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams33 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams33.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._242sdp), 0, 0);
                    textView30.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView30.setGravity(1);
                    textView30.setText(PreviewActivity.this.p_getvenue2);
                    textView30.setTextColor(Color.parseColor(PreviewActivity.this.label8_2_font_color[6]));
                    AssetManager assets30 = PreviewActivity.this.getAssets();
                    textView30.setTypeface(Typeface.createFromAsset(assets30, "fonts/" + PreviewActivity.this.label8_2_Font_name[6] + ".ttf"));
                    textView30.setLayoutParams(layoutParams33);
                    PreviewActivity.this.relative2.addView(textView30);
                }
                if (PreviewActivity.this.p_getfunctionname3 != null) {
                    TextView textView31 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams34 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams34.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._265sdp), 0, 0);
                    textView31.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    textView31.setGravity(1);
                    textView31.setText(PreviewActivity.this.p_getfunctionname3);
                    textView31.setTextColor(Color.parseColor(PreviewActivity.this.label8_2_font_color[7]));
                    AssetManager assets31 = PreviewActivity.this.getAssets();
                    textView31.setTypeface(Typeface.createFromAsset(assets31, "fonts/" + PreviewActivity.this.label8_2_Font_name[7] + ".ttf"));
                    textView31.setLayoutParams(layoutParams34);
                    PreviewActivity.this.relative2.addView(textView31);
                    TextView textView32 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams35 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams35.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._300sdp), 0, 0);
                    textView32.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView32.setGravity(1);
                    textView32.setText(PreviewActivity.this.p_getdate3 + ", " + PreviewActivity.this.p_gettime3 + " Onwards");
                    textView32.setTextColor(Color.parseColor(PreviewActivity.this.label8_2_font_color[8]));
                    AssetManager assets32 = PreviewActivity.this.getAssets();
                    textView32.setTypeface(Typeface.createFromAsset(assets32, "fonts/" + PreviewActivity.this.label8_2_Font_name[8] + ".ttf"));
                    textView32.setLayoutParams(layoutParams35);
                    PreviewActivity.this.relative2.addView(textView32);
                    TextView textView33 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams36 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams36.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._315sdp), 0, 0);
                    textView33.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView33.setGravity(1);
                    textView33.setText(PreviewActivity.this.p_getvenue3);
                    textView33.setTextColor(Color.parseColor(PreviewActivity.this.label8_2_font_color[8]));
                    AssetManager assets33 = PreviewActivity.this.getAssets();
                    textView33.setTypeface(Typeface.createFromAsset(assets33, "fonts/" + PreviewActivity.this.label8_2_Font_name[8] + ".ttf"));
                    textView33.setLayoutParams(layoutParams36);
                    PreviewActivity.this.relative2.addView(textView33);
                }
            }
            if (i == 3) {
                PreviewActivity.this.relative3 = (RelativeLayout) inflate.findViewById(R.id.rel3);
                ImageView imageView4 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity4 = PreviewActivity.this;
                previewActivity4.bmp = previewActivity4.setBgImg(R.drawable.w_8_up_img_3);
                imageView4.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams37 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams37.setMargins(0, 0, 0, 0);
                imageView4.setLayoutParams(layoutParams37);
                PreviewActivity.this.relative3.addView(imageView4, 0);
                TextView textView34 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams38 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams38.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._90sdp), 0, 0);
                textView34.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView34.setGravity(1);
                textView34.setText(PreviewActivity.this.label8_3_Text[0]);
                textView34.setTextColor(Color.parseColor(PreviewActivity.this.label8_3_font_color[0]));
                AssetManager assets34 = PreviewActivity.this.getAssets();
                textView34.setTypeface(Typeface.createFromAsset(assets34, "fonts/" + PreviewActivity.this.label8_3_Font_name[0] + ".ttf"));
                textView34.setLayoutParams(layoutParams38);
                PreviewActivity.this.relative3.addView(textView34);
                TextView textView35 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams39 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams39.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._130sdp), 0, 0);
                textView35.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView35.setGravity(1);
                textView35.setText(PreviewActivity.this.p_getvenue_other);
                textView35.setTextColor(Color.parseColor(PreviewActivity.this.label8_3_font_color[1]));
                AssetManager assets35 = PreviewActivity.this.getAssets();
                textView35.setTypeface(Typeface.createFromAsset(assets35, "fonts/" + PreviewActivity.this.label8_3_Font_name[1] + ".ttf"));
                textView35.setLayoutParams(layoutParams39);
                PreviewActivity.this.relative3.addView(textView35);
                TextView textView36 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams40 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams40.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._170sdp), 0, 0);
                textView36.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView36.setGravity(1);
                textView36.setText("Rsvp");
                textView36.setTextColor(Color.parseColor(PreviewActivity.this.label8_3_font_color[2]));
                AssetManager assets36 = PreviewActivity.this.getAssets();
                textView36.setTypeface(Typeface.createFromAsset(assets36, "fonts/" + PreviewActivity.this.label8_3_Font_name[2] + ".ttf"));
                textView36.setLayoutParams(layoutParams40);
                PreviewActivity.this.relative3.addView(textView36);
                TextView textView37 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams41 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams41.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._210sdp), 0, 0);
                textView37.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView37.setGravity(1);
                textView37.setText(PreviewActivity.this.p_getRsvp);
                textView37.setTextColor(Color.parseColor(PreviewActivity.this.label8_3_font_color[3]));
                AssetManager assets37 = PreviewActivity.this.getAssets();
                textView37.setTypeface(Typeface.createFromAsset(assets37, "fonts/" + PreviewActivity.this.label8_3_Font_name[3] + ".ttf"));
                textView37.setLayoutParams(layoutParams41);
                PreviewActivity.this.relative3.addView(textView37);
                TextView textView38 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams42 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams42.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._300sdp), 0, 0);
                textView38.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView38.setGravity(1);
                textView38.setText(PreviewActivity.this.label8_3_Text[4]);
                textView38.setTextColor(Color.parseColor(PreviewActivity.this.label8_3_font_color[4]));
                AssetManager assets38 = PreviewActivity.this.getAssets();
                textView38.setTypeface(Typeface.createFromAsset(assets38, "fonts/" + PreviewActivity.this.label8_3_Font_name[4] + ".ttf"));
                textView38.setLayoutParams(layoutParams42);
                PreviewActivity.this.relative3.addView(textView38);
                TextView textView39 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams43 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams43.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._330sdp), 0, 0);
                textView39.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView39.setGravity(1);
                textView39.setText(PreviewActivity.this.p_getdate_other);
                textView39.setTextColor(Color.parseColor(PreviewActivity.this.label8_3_font_color[5]));
                AssetManager assets39 = PreviewActivity.this.getAssets();
                textView39.setTypeface(Typeface.createFromAsset(assets39, "fonts/" + PreviewActivity.this.label8_3_Font_name[5] + ".ttf"));
                textView39.setLayoutParams(layoutParams43);
                PreviewActivity.this.relative3.addView(textView39);
            }
            viewGroup.addView(inflate);
            return inflate;
        }

        @Override 
        public int getCount() {
            return PreviewActivity.this.layouts.length;
        }

        @Override 
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    
    public class MyViewPagerAdapter9 extends PagerAdapter {
        private LayoutInflater layoutInflater;

        @Override 
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public MyViewPagerAdapter9() {
        }

        @Override 
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = (LayoutInflater) PreviewActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.layoutInflater = layoutInflater;
            View inflate = layoutInflater.inflate(PreviewActivity.this.layouts[i], viewGroup, false);
            if (i == 0) {
                PreviewActivity.this.relative0 = (RelativeLayout) inflate.findViewById(R.id.rel0);
                ImageView imageView = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity = PreviewActivity.this;
                previewActivity.bmp = previewActivity.setBgImg(R.drawable.w_9_up_img_0);
                imageView.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams.setMargins(0, 0, 0, 0);
                imageView.setLayoutParams(layoutParams);
                PreviewActivity.this.relative0.addView(imageView, 0);
                TextView textView = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp), 0, 0);
                textView.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._7sdp));
                textView.setGravity(1);
                textView.setText(PreviewActivity.this.label9_0_Text[0]);
                textView.setTextColor(Color.parseColor(PreviewActivity.this.label9_0_font_color[0]));
                AssetManager assets = PreviewActivity.this.getAssets();
                textView.setTypeface(Typeface.createFromAsset(assets, "fonts/" + PreviewActivity.this.label9_0_Font_name[0] + ".ttf"));
                textView.setLayoutParams(layoutParams2);
                PreviewActivity.this.relative0.addView(textView);
                TextView textView2 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._30sdp), 0, 0);
                textView2.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView2.setGravity(1);
                textView2.setText(PreviewActivity.this.p_getfirstNameG);
                textView2.setTextColor(Color.parseColor(PreviewActivity.this.label9_0_font_color[1]));
                AssetManager assets2 = PreviewActivity.this.getAssets();
                textView2.setTypeface(Typeface.createFromAsset(assets2, "fonts/" + PreviewActivity.this.label9_0_Font_name[1] + ".ttf"));
                textView2.setLayoutParams(layoutParams3);
                PreviewActivity.this.relative0.addView(textView2);
                TextView textView3 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams4.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._62sdp), 0, 0);
                textView3.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView3.setGravity(1);
                textView3.setText(PreviewActivity.this.label9_0_Text[2]);
                textView3.setTextColor(Color.parseColor(PreviewActivity.this.label9_0_font_color[2]));
                AssetManager assets3 = PreviewActivity.this.getAssets();
                textView3.setTypeface(Typeface.createFromAsset(assets3, "fonts/" + PreviewActivity.this.label9_0_Font_name[2] + ".ttf"));
                textView3.setLayoutParams(layoutParams4);
                PreviewActivity.this.relative0.addView(textView3);
                TextView textView4 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams5.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._95sdp), 0, 0);
                textView4.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView4.setGravity(1);
                textView4.setText(PreviewActivity.this.p_getfirstnameB);
                textView4.setTextColor(Color.parseColor(PreviewActivity.this.label9_0_font_color[3]));
                AssetManager assets4 = PreviewActivity.this.getAssets();
                textView4.setTypeface(Typeface.createFromAsset(assets4, "fonts/" + PreviewActivity.this.label9_0_Font_name[3] + ".ttf"));
                textView4.setLayoutParams(layoutParams5);
                PreviewActivity.this.relative0.addView(textView4);
                TextView textView5 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams6.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._380sdp), 0, 0);
                textView5.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                textView5.setGravity(1);
                textView5.setText(PreviewActivity.this.p_getdate1);
                textView5.setTextColor(Color.parseColor(PreviewActivity.this.label9_0_font_color[4]));
                AssetManager assets5 = PreviewActivity.this.getAssets();
                textView5.setTypeface(Typeface.createFromAsset(assets5, "fonts/" + PreviewActivity.this.label9_0_Font_name[4] + ".ttf"));
                textView5.setLayoutParams(layoutParams6);
                PreviewActivity.this.relative0.addView(textView5);
                TextView textView6 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams7.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._400sdp), 0, 0);
                textView6.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView6.setGravity(1);
                textView6.setText(PreviewActivity.this.label9_0_Text[5]);
                textView6.setTextColor(Color.parseColor(PreviewActivity.this.label9_0_font_color[5]));
                AssetManager assets6 = PreviewActivity.this.getAssets();
                textView6.setTypeface(Typeface.createFromAsset(assets6, "fonts/" + PreviewActivity.this.label9_0_Font_name[5] + ".ttf"));
                textView6.setLayoutParams(layoutParams7);
                PreviewActivity.this.relative0.addView(textView6);
            }
            if (i == 1) {
                PreviewActivity.this.relative1 = (RelativeLayout) inflate.findViewById(R.id.rel1);
                ImageView imageView2 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity2 = PreviewActivity.this;
                previewActivity2.bmp = previewActivity2.setBgImg(R.drawable.w_9_up_img_1);
                imageView2.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams8.setMargins(0, 0, 0, 0);
                imageView2.setLayoutParams(layoutParams8);
                PreviewActivity.this.relative1.addView(imageView2, 0);
                TextView textView7 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams9.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._70sdp), 0, 0);
                textView7.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView7.setGravity(1);
                textView7.setText(PreviewActivity.this.label9_1_Text[0]);
                textView7.setLetterSpacing(0.1f);
                textView7.setTextColor(Color.parseColor(PreviewActivity.this.label9_1_font_color[0]));
                AssetManager assets7 = PreviewActivity.this.getAssets();
                textView7.setTypeface(Typeface.createFromAsset(assets7, "fonts/" + PreviewActivity.this.label9_1_Font_name[0] + ".ttf"));
                textView7.setLayoutParams(layoutParams9);
                PreviewActivity.this.relative1.addView(textView7);
                TextView textView8 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams10.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._115sdp), 0, 0);
                textView8.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView8.setGravity(1);
                textView8.setText(PreviewActivity.this.p_getfirstNameG);
                textView8.setTextColor(Color.parseColor(PreviewActivity.this.label9_1_font_color[1]));
                AssetManager assets8 = PreviewActivity.this.getAssets();
                textView8.setTypeface(Typeface.createFromAsset(assets8, "fonts/" + PreviewActivity.this.label9_1_Font_name[1] + ".ttf"));
                textView8.setLayoutParams(layoutParams10);
                PreviewActivity.this.relative1.addView(textView8);
                TextView textView9 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams11.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._155sdp), 0, 0);
                textView9.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView9.setGravity(1);
                textView9.setText(PreviewActivity.this.p_getrelation);
                textView9.setAllCaps(true);
                textView9.setTextColor(Color.parseColor(PreviewActivity.this.label9_1_font_color[2]));
                AssetManager assets9 = PreviewActivity.this.getAssets();
                textView9.setTypeface(Typeface.createFromAsset(assets9, "fonts/" + PreviewActivity.this.label9_1_Font_name[2] + ".ttf"));
                textView9.setLayoutParams(layoutParams11);
                PreviewActivity.this.relative1.addView(textView9);
                TextView textView10 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams12.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._170sdp), 0, 0);
                textView10.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView10.setGravity(1);
                textView10.setText("Mr. " + PreviewActivity.this.p_getfatherNAmeG + " " + PreviewActivity.this.p_getlastNameG + " & mrs." + PreviewActivity.this.p_getmotherNameG + " " + PreviewActivity.this.p_getlastNameG);
                textView10.setAllCaps(true);
                textView10.setTextColor(Color.parseColor(PreviewActivity.this.label9_1_font_color[3]));
                AssetManager assets10 = PreviewActivity.this.getAssets();
                StringBuilder sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(PreviewActivity.this.label9_1_Font_name[3]);
                sb.append(".ttf");
                textView10.setTypeface(Typeface.createFromAsset(assets10, sb.toString()));
                textView10.setLayoutParams(layoutParams12);
                PreviewActivity.this.relative1.addView(textView10);
                if (!PreviewActivity.this.p_getgrandMothernameG.isEmpty() && !PreviewActivity.this.p_getgrandFathernameG.isEmpty()) {
                    TextView textView11 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams13.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._195sdp), 0, 0);
                    textView11.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView11.setGravity(1);
                    textView11.setText(PreviewActivity.this.p_getgrandrelation);
                    textView11.setAllCaps(true);
                    textView11.setTextColor(Color.parseColor(PreviewActivity.this.label9_1_font_color[4]));
                    AssetManager assets11 = PreviewActivity.this.getAssets();
                    textView11.setTypeface(Typeface.createFromAsset(assets11, "fonts/" + PreviewActivity.this.label9_1_Font_name[4] + ".ttf"));
                    textView11.setLayoutParams(layoutParams13);
                    PreviewActivity.this.relative1.addView(textView11);
                    TextView textView12 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams14.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._210sdp), 0, 0);
                    textView12.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView12.setGravity(1);
                    textView12.setText("Mr. " + PreviewActivity.this.p_getgrandFathernameG + " " + PreviewActivity.this.p_getlastNameG + " & mrs." + PreviewActivity.this.p_getgrandMothernameG + " " + PreviewActivity.this.p_getlastNameG);
                    textView12.setAllCaps(true);
                    textView12.setTextColor(Color.parseColor(PreviewActivity.this.label9_1_font_color[5]));
                    AssetManager assets12 = PreviewActivity.this.getAssets();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fonts/");
                    sb2.append(PreviewActivity.this.label9_1_Font_name[5]);
                    sb2.append(".ttf");
                    textView12.setTypeface(Typeface.createFromAsset(assets12, sb2.toString()));
                    textView12.setLayoutParams(layoutParams14);
                    PreviewActivity.this.relative1.addView(textView12);
                }
                TextView textView13 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams15.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._235sdp), 0, 0);
                textView13.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView13.setGravity(1);
                textView13.setText(PreviewActivity.this.p_getfirstnameB);
                textView13.setTextColor(Color.parseColor(PreviewActivity.this.label9_1_font_color[6]));
                AssetManager assets13 = PreviewActivity.this.getAssets();
                textView13.setTypeface(Typeface.createFromAsset(assets13, "fonts/" + PreviewActivity.this.label9_1_Font_name[6] + ".ttf"));
                textView13.setLayoutParams(layoutParams15);
                PreviewActivity.this.relative1.addView(textView13);
                TextView textView14 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams16.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._275sdp), 0, 0);
                textView14.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView14.setGravity(1);
                textView14.setText(PreviewActivity.this.p_getsecondrelation);
                textView14.setAllCaps(true);
                textView14.setTextColor(Color.parseColor(PreviewActivity.this.label9_1_font_color[7]));
                AssetManager assets14 = PreviewActivity.this.getAssets();
                textView14.setTypeface(Typeface.createFromAsset(assets14, "fonts/" + PreviewActivity.this.label9_1_Font_name[7] + ".ttf"));
                textView14.setLayoutParams(layoutParams16);
                PreviewActivity.this.relative1.addView(textView14);
                TextView textView15 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams17.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._288sdp), 0, 0);
                textView15.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView15.setGravity(1);
                textView15.setText("Mr. " + PreviewActivity.this.p_getfatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & mrs." + PreviewActivity.this.p_getmotherNameB + " " + PreviewActivity.this.p_getlastNameB);
                textView15.setAllCaps(true);
                textView15.setTextColor(Color.parseColor(PreviewActivity.this.label9_1_font_color[8]));
                AssetManager assets15 = PreviewActivity.this.getAssets();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("fonts/");
                sb3.append(PreviewActivity.this.label9_1_Font_name[8]);
                sb3.append(".ttf");
                textView15.setTypeface(Typeface.createFromAsset(assets15, sb3.toString()));
                textView15.setLayoutParams(layoutParams17);
                PreviewActivity.this.relative1.addView(textView15);
                if (!PreviewActivity.this.p_getgrandMothernameB.isEmpty() && !PreviewActivity.this.p_getgrandFatherNameB.isEmpty()) {
                    TextView textView16 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams18.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._312sdp), 0, 0);
                    textView16.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView16.setGravity(1);
                    textView16.setText(PreviewActivity.this.p_getsecondgrandrelation);
                    textView16.setAllCaps(true);
                    textView16.setTextColor(Color.parseColor(PreviewActivity.this.label9_1_font_color[9]));
                    AssetManager assets16 = PreviewActivity.this.getAssets();
                    textView16.setTypeface(Typeface.createFromAsset(assets16, "fonts/" + PreviewActivity.this.label9_1_Font_name[9] + ".ttf"));
                    textView16.setLayoutParams(layoutParams18);
                    PreviewActivity.this.relative1.addView(textView16);
                    TextView textView17 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams19.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._325sdp), 0, 0);
                    textView17.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView17.setGravity(1);
                    textView17.setText("Mr. " + PreviewActivity.this.p_getgrandFatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & mrs." + PreviewActivity.this.p_getgrandMothernameB + " " + PreviewActivity.this.p_getlastNameB);
                    textView17.setAllCaps(true);
                    textView17.setTextColor(Color.parseColor(PreviewActivity.this.label9_1_font_color[10]));
                    AssetManager assets17 = PreviewActivity.this.getAssets();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("fonts/");
                    sb4.append(PreviewActivity.this.label9_1_Font_name[10]);
                    sb4.append(".ttf");
                    textView17.setTypeface(Typeface.createFromAsset(assets17, sb4.toString()));
                    textView17.setLayoutParams(layoutParams19);
                    PreviewActivity.this.relative1.addView(textView17);
                }
            }
            if (i == 2) {
                PreviewActivity.this.relative2 = (RelativeLayout) inflate.findViewById(R.id.rel2);
                ImageView imageView3 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity3 = PreviewActivity.this;
                previewActivity3.bmp = previewActivity3.setBgImg(R.drawable.w_9_up_img_2);
                imageView3.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams20.setMargins(0, 0, 0, 0);
                imageView3.setLayoutParams(layoutParams20);
                PreviewActivity.this.relative2.addView(imageView3, 0);
                TextView textView18 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams21 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams21.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._65sdp), 0, 0);
                textView18.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView18.setGravity(1);
                textView18.setText(PreviewActivity.this.label9_2_Text[0]);
                textView18.setTextColor(Color.parseColor(PreviewActivity.this.label9_2_font_color[0]));
                AssetManager assets18 = PreviewActivity.this.getAssets();
                textView18.setTypeface(Typeface.createFromAsset(assets18, "fonts/" + PreviewActivity.this.label9_2_Font_name[0] + ".ttf"));
                textView18.setLayoutParams(layoutParams21);
                PreviewActivity.this.relative2.addView(textView18);
                if (PreviewActivity.this.lenear2 != null) {
                    TextView textView19 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams22.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._115sdp), 0, 0);
                    textView19.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    textView19.setGravity(1);
                    textView19.setText(PreviewActivity.this.p_getfunctionname1);
                    textView19.setTextColor(Color.parseColor(PreviewActivity.this.label9_2_font_color[1]));
                    AssetManager assets19 = PreviewActivity.this.getAssets();
                    textView19.setTypeface(Typeface.createFromAsset(assets19, "fonts/" + PreviewActivity.this.label9_2_Font_name[1] + ".ttf"));
                    textView19.setLayoutParams(layoutParams22);
                    PreviewActivity.this.relative2.addView(textView19);
                    TextView textView20 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams23 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams23.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._150sdp), 0, 0);
                    textView20.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView20.setGravity(1);
                    textView20.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView20.setTextColor(Color.parseColor(PreviewActivity.this.label9_2_font_color[2]));
                    AssetManager assets20 = PreviewActivity.this.getAssets();
                    textView20.setTypeface(Typeface.createFromAsset(assets20, "fonts/" + PreviewActivity.this.label9_2_Font_name[2] + ".ttf"));
                    textView20.setLayoutParams(layoutParams23);
                    PreviewActivity.this.relative2.addView(textView20);
                    TextView textView21 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams24.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._165sdp), 0, 0);
                    textView21.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView21.setGravity(1);
                    textView21.setText(PreviewActivity.this.p_getvenue1);
                    textView21.setTextColor(Color.parseColor(PreviewActivity.this.label9_2_font_color[3]));
                    AssetManager assets21 = PreviewActivity.this.getAssets();
                    textView21.setTypeface(Typeface.createFromAsset(assets21, "fonts/" + PreviewActivity.this.label9_2_Font_name[3] + ".ttf"));
                    textView21.setLayoutParams(layoutParams24);
                    PreviewActivity.this.relative2.addView(textView21);
                } else {
                    TextView textView22 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams25.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._185sdp), 0, 0);
                    textView22.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    textView22.setGravity(1);
                    textView22.setText(PreviewActivity.this.p_getfunctionname1);
                    textView22.setTextColor(Color.parseColor(PreviewActivity.this.label9_2_font_color[1]));
                    AssetManager assets22 = PreviewActivity.this.getAssets();
                    textView22.setTypeface(Typeface.createFromAsset(assets22, "fonts/" + PreviewActivity.this.label9_2_Font_name[1] + ".ttf"));
                    textView22.setLayoutParams(layoutParams25);
                    PreviewActivity.this.relative2.addView(textView22);
                    TextView textView23 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams26 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams26.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._222sdp), 0, 0);
                    textView23.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView23.setGravity(1);
                    textView23.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView23.setTextColor(Color.parseColor(PreviewActivity.this.label9_2_font_color[2]));
                    AssetManager assets23 = PreviewActivity.this.getAssets();
                    textView23.setTypeface(Typeface.createFromAsset(assets23, "fonts/" + PreviewActivity.this.label9_2_Font_name[2] + ".ttf"));
                    textView23.setLayoutParams(layoutParams26);
                    PreviewActivity.this.relative2.addView(textView23);
                    TextView textView24 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams27.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._237sdp), 0, 0);
                    textView24.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView24.setGravity(1);
                    textView24.setText(PreviewActivity.this.p_getvenue1);
                    textView24.setTextColor(Color.parseColor(PreviewActivity.this.label9_2_font_color[6]));
                    AssetManager assets24 = PreviewActivity.this.getAssets();
                    textView24.setTypeface(Typeface.createFromAsset(assets24, "fonts/" + PreviewActivity.this.label9_2_Font_name[6] + ".ttf"));
                    textView24.setLayoutParams(layoutParams27);
                    PreviewActivity.this.relative2.addView(textView24);
                }
                if (PreviewActivity.this.p_getfunctionname2 != null) {
                    TextView textView25 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams28 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams28.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._185sdp), 0, 0);
                    textView25.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    textView25.setGravity(1);
                    textView25.setText(PreviewActivity.this.p_getfunctionname2);
                    textView25.setTextColor(Color.parseColor(PreviewActivity.this.label9_2_font_color[4]));
                    AssetManager assets25 = PreviewActivity.this.getAssets();
                    textView25.setTypeface(Typeface.createFromAsset(assets25, "fonts/" + PreviewActivity.this.label9_2_Font_name[4] + ".ttf"));
                    textView25.setLayoutParams(layoutParams28);
                    PreviewActivity.this.relative2.addView(textView25);
                    TextView textView26 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams29 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams29.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._222sdp), 0, 0);
                    textView26.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView26.setGravity(1);
                    textView26.setText(PreviewActivity.this.p_getdate2 + ", " + PreviewActivity.this.p_gettime2 + " Onwards");
                    textView26.setTextColor(Color.parseColor(PreviewActivity.this.label9_2_font_color[5]));
                    AssetManager assets26 = PreviewActivity.this.getAssets();
                    textView26.setTypeface(Typeface.createFromAsset(assets26, "fonts/" + PreviewActivity.this.label9_2_Font_name[5] + ".ttf"));
                    textView26.setLayoutParams(layoutParams29);
                    PreviewActivity.this.relative2.addView(textView26);
                    TextView textView27 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams30 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams30.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._237sdp), 0, 0);
                    textView27.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView27.setGravity(1);
                    textView27.setText(PreviewActivity.this.p_getvenue2);
                    textView27.setTextColor(Color.parseColor(PreviewActivity.this.label9_2_font_color[6]));
                    AssetManager assets27 = PreviewActivity.this.getAssets();
                    textView27.setTypeface(Typeface.createFromAsset(assets27, "fonts/" + PreviewActivity.this.label9_2_Font_name[6] + ".ttf"));
                    textView27.setLayoutParams(layoutParams30);
                    PreviewActivity.this.relative2.addView(textView27);
                }
                if (PreviewActivity.this.p_getfunctionname3 != null) {
                    TextView textView28 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams31 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams31.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._258sdp), 0, 0);
                    textView28.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    textView28.setGravity(1);
                    textView28.setText(PreviewActivity.this.p_getfunctionname3);
                    textView28.setTextColor(Color.parseColor(PreviewActivity.this.label9_2_font_color[7]));
                    AssetManager assets28 = PreviewActivity.this.getAssets();
                    textView28.setTypeface(Typeface.createFromAsset(assets28, "fonts/" + PreviewActivity.this.label9_2_Font_name[7] + ".ttf"));
                    textView28.setLayoutParams(layoutParams31);
                    PreviewActivity.this.relative2.addView(textView28);
                    TextView textView29 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams32 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams32.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._295sdp), 0, 0);
                    textView29.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView29.setGravity(1);
                    textView29.setText(PreviewActivity.this.p_getdate3 + ", " + PreviewActivity.this.p_gettime3 + " Onwards");
                    textView29.setTextColor(Color.parseColor(PreviewActivity.this.label9_2_font_color[8]));
                    AssetManager assets29 = PreviewActivity.this.getAssets();
                    textView29.setTypeface(Typeface.createFromAsset(assets29, "fonts/" + PreviewActivity.this.label9_2_Font_name[8] + ".ttf"));
                    textView29.setLayoutParams(layoutParams32);
                    PreviewActivity.this.relative2.addView(textView29);
                    TextView textView30 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams33 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams33.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._313sdp), 0, 0);
                    textView30.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                    textView30.setGravity(1);
                    textView30.setText(PreviewActivity.this.p_getvenue3);
                    textView30.setTextColor(Color.parseColor(PreviewActivity.this.label9_2_font_color[9]));
                    AssetManager assets30 = PreviewActivity.this.getAssets();
                    textView30.setTypeface(Typeface.createFromAsset(assets30, "fonts/" + PreviewActivity.this.label9_2_Font_name[9] + ".ttf"));
                    textView30.setLayoutParams(layoutParams33);
                    PreviewActivity.this.relative2.addView(textView30);
                }
            }
            if (i == 3) {
                PreviewActivity.this.relative3 = (RelativeLayout) inflate.findViewById(R.id.rel3);
                ImageView imageView4 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity4 = PreviewActivity.this;
                previewActivity4.bmp = previewActivity4.setBgImg(R.drawable.w_9_up_img_3);
                imageView4.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams34 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams34.setMargins(0, 0, 0, 0);
                imageView4.setLayoutParams(layoutParams34);
                PreviewActivity.this.relative3.addView(imageView4, 0);
                TextView textView31 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams35 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams35.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._80sdp), 0, 0);
                textView31.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView31.setGravity(1);
                textView31.setText(PreviewActivity.this.label9_3_Text[0]);
                textView31.setTextColor(Color.parseColor(PreviewActivity.this.label9_3_font_color[0]));
                AssetManager assets31 = PreviewActivity.this.getAssets();
                textView31.setTypeface(Typeface.createFromAsset(assets31, "fonts/" + PreviewActivity.this.label9_3_Font_name[0] + ".ttf"));
                textView31.setLayoutParams(layoutParams35);
                PreviewActivity.this.relative3.addView(textView31);
                TextView textView32 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams36 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams36.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._130sdp), 0, 0);
                textView32.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView32.setGravity(1);
                textView32.setText(PreviewActivity.this.p_getvenue_other);
                textView32.setAllCaps(true);
                textView32.setTextColor(Color.parseColor(PreviewActivity.this.label9_3_font_color[1]));
                AssetManager assets32 = PreviewActivity.this.getAssets();
                textView32.setTypeface(Typeface.createFromAsset(assets32, "fonts/" + PreviewActivity.this.label9_3_Font_name[1] + ".ttf"));
                textView32.setLayoutParams(layoutParams36);
                PreviewActivity.this.relative3.addView(textView32);
                TextView textView33 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams37 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams37.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._165sdp), 0, 0);
                textView33.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView33.setGravity(1);
                textView33.setText("Rsvp");
                textView33.setTextColor(Color.parseColor(PreviewActivity.this.label9_3_font_color[2]));
                AssetManager assets33 = PreviewActivity.this.getAssets();
                textView33.setTypeface(Typeface.createFromAsset(assets33, "fonts/" + PreviewActivity.this.label9_3_Font_name[2] + ".ttf"));
                textView33.setLayoutParams(layoutParams37);
                PreviewActivity.this.relative3.addView(textView33);
                TextView textView34 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams38 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams38.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._210sdp), 0, 0);
                textView34.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView34.setGravity(1);
                textView34.setText(PreviewActivity.this.p_getRsvp);
                textView34.setAllCaps(true);
                textView34.setTextColor(Color.parseColor(PreviewActivity.this.label9_3_font_color[3]));
                AssetManager assets34 = PreviewActivity.this.getAssets();
                textView34.setTypeface(Typeface.createFromAsset(assets34, "fonts/" + PreviewActivity.this.label9_3_Font_name[3] + ".ttf"));
                textView34.setLayoutParams(layoutParams38);
                PreviewActivity.this.relative3.addView(textView34);
                TextView textView35 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams39 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams39.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._275sdp), 0, 0);
                textView35.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView35.setGravity(1);
                textView35.setText(PreviewActivity.this.p_getdate_other);
                textView35.setTextColor(Color.parseColor(PreviewActivity.this.label9_3_font_color[4]));
                AssetManager assets35 = PreviewActivity.this.getAssets();
                textView35.setTypeface(Typeface.createFromAsset(assets35, "fonts/" + PreviewActivity.this.label9_3_Font_name[4] + ".ttf"));
                textView35.setLayoutParams(layoutParams39);
                PreviewActivity.this.relative3.addView(textView35);
                TextView textView36 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams40 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams40.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._305sdp), 0, 0);
                textView36.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView36.setGravity(1);
                textView36.setText(PreviewActivity.this.label9_3_Text[5]);
                textView36.setTextColor(Color.parseColor(PreviewActivity.this.label9_3_font_color[5]));
                AssetManager assets36 = PreviewActivity.this.getAssets();
                textView36.setTypeface(Typeface.createFromAsset(assets36, "fonts/" + PreviewActivity.this.label9_3_Font_name[5] + ".ttf"));
                textView36.setLayoutParams(layoutParams40);
                PreviewActivity.this.relative3.addView(textView36);
            }
            viewGroup.addView(inflate);
            return inflate;
        }

        @Override 
        public int getCount() {
            return PreviewActivity.this.layouts.length;
        }

        @Override 
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    
    public class MyViewPagerAdapter10 extends PagerAdapter {
        private LayoutInflater layoutInflater;

        @Override 
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public MyViewPagerAdapter10() {
        }

        @Override 
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = (LayoutInflater) PreviewActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.layoutInflater = layoutInflater;
            View inflate = layoutInflater.inflate(PreviewActivity.this.layouts[i], viewGroup, false);
            if (i == 0) {
                PreviewActivity.this.relative0 = (RelativeLayout) inflate.findViewById(R.id.rel0);
                ImageView imageView = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity = PreviewActivity.this;
                previewActivity.bmp = previewActivity.setBgImg(R.drawable.w_10_up_img_0);
                imageView.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams.setMargins(0, 0, 0, 0);
                imageView.setLayoutParams(layoutParams);
                PreviewActivity.this.relative0.addView(imageView, 0);
                TextView textView = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._80sdp), 0, 0);
                textView.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView.setGravity(1);
                textView.setText(PreviewActivity.this.label10_0_Text[0]);
                textView.setLetterSpacing(0.2f);
                textView.setTextColor(Color.parseColor(PreviewActivity.this.label10_0_font_color[0]));
                AssetManager assets = PreviewActivity.this.getAssets();
                textView.setTypeface(Typeface.createFromAsset(assets, "fonts/" + PreviewActivity.this.label10_0_Font_name[0] + ".ttf"));
                textView.setLayoutParams(layoutParams2);
                PreviewActivity.this.relative0.addView(textView);
                TextView textView2 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._110sdp), 0, 0);
                textView2.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView2.setGravity(1);
                textView2.setText(PreviewActivity.this.p_getfirstNameG);
                textView2.setTextColor(Color.parseColor(PreviewActivity.this.label10_0_font_color[1]));
                AssetManager assets2 = PreviewActivity.this.getAssets();
                textView2.setTypeface(Typeface.createFromAsset(assets2, "fonts/" + PreviewActivity.this.label10_0_Font_name[1] + ".ttf"));
                textView2.setLayoutParams(layoutParams3);
                PreviewActivity.this.relative0.addView(textView2);
                TextView textView3 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams4.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._145sdp), 0, 0);
                textView3.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._7sdp));
                textView3.setGravity(1);
                textView3.setText(PreviewActivity.this.label10_0_Text[2]);
                textView3.setTextColor(Color.parseColor(PreviewActivity.this.label10_0_font_color[2]));
                AssetManager assets3 = PreviewActivity.this.getAssets();
                textView3.setTypeface(Typeface.createFromAsset(assets3, "fonts/" + PreviewActivity.this.label10_0_Font_name[2] + ".ttf"));
                textView3.setLayoutParams(layoutParams4);
                PreviewActivity.this.relative0.addView(textView3);
                TextView textView4 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams5.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._170sdp), 0, 0);
                textView4.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView4.setGravity(1);
                textView4.setText(PreviewActivity.this.p_getfirstnameB);
                textView4.setTextColor(Color.parseColor(PreviewActivity.this.label10_0_font_color[3]));
                AssetManager assets4 = PreviewActivity.this.getAssets();
                textView4.setTypeface(Typeface.createFromAsset(assets4, "fonts/" + PreviewActivity.this.label10_0_Font_name[3] + ".ttf"));
                textView4.setLayoutParams(layoutParams5);
                PreviewActivity.this.relative0.addView(textView4);
                TextView textView5 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams6.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._225sdp), 0, 0);
                textView5.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._4sdp));
                textView5.setGravity(1);
                textView5.setText("REQUEST THE HONOR OF \n YOUR PRESENCE AT \n THEIR MARRIAGE ");
                textView5.setTextColor(Color.parseColor(PreviewActivity.this.label10_0_font_color[4]));
                AssetManager assets5 = PreviewActivity.this.getAssets();
                textView5.setTypeface(Typeface.createFromAsset(assets5, "fonts/" + PreviewActivity.this.label10_0_Font_name[4] + ".ttf"));
                textView5.setLayoutParams(layoutParams6);
                PreviewActivity.this.relative0.addView(textView5);
                TextView textView6 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams7.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._300sdp), 0, 0);
                textView6.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView6.setGravity(1);
                textView6.setText(PreviewActivity.this.p_getdate1);
                textView6.setLetterSpacing(0.2f);
                textView6.setTextColor(Color.parseColor(PreviewActivity.this.label10_0_font_color[5]));
                AssetManager assets6 = PreviewActivity.this.getAssets();
                textView6.setTypeface(Typeface.createFromAsset(assets6, "fonts/" + PreviewActivity.this.label10_0_Font_name[5] + ".ttf"));
                textView6.setLayoutParams(layoutParams7);
                PreviewActivity.this.relative0.addView(textView6);
                TextView textView7 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams8.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._325sdp), 0, 0);
                textView7.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                textView7.setGravity(1);
                textView7.setText(PreviewActivity.this.label10_0_Text[6]);
                textView7.setTextColor(Color.parseColor(PreviewActivity.this.label10_0_font_color[6]));
                AssetManager assets7 = PreviewActivity.this.getAssets();
                textView7.setTypeface(Typeface.createFromAsset(assets7, "fonts/" + PreviewActivity.this.label10_0_Font_name[6] + ".ttf"));
                textView7.setLayoutParams(layoutParams8);
                PreviewActivity.this.relative0.addView(textView7);
            }
            if (i == 1) {
                PreviewActivity.this.relative1 = (RelativeLayout) inflate.findViewById(R.id.rel1);
                ImageView imageView2 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity2 = PreviewActivity.this;
                previewActivity2.bmp = previewActivity2.setBgImg(R.drawable.w_10_up_img_1);
                imageView2.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams9.setMargins(0, 0, 0, 0);
                imageView2.setLayoutParams(layoutParams9);
                PreviewActivity.this.relative1.addView(imageView2, 0);
                TextView textView8 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams10.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._70sdp), 0, 0);
                textView8.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView8.setGravity(1);
                textView8.setText(PreviewActivity.this.label10_1_Text[0]);
                textView8.setAllCaps(true);
                textView8.setLetterSpacing(0.3f);
                textView8.setTextColor(Color.parseColor(PreviewActivity.this.label10_1_font_color[0]));
                AssetManager assets8 = PreviewActivity.this.getAssets();
                textView8.setTypeface(Typeface.createFromAsset(assets8, "fonts/" + PreviewActivity.this.label10_1_Font_name[0] + ".ttf"));
                textView8.setLayoutParams(layoutParams10);
                PreviewActivity.this.relative1.addView(textView8);
                TextView textView9 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams11.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._110sdp), 0, 0);
                textView9.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView9.setGravity(1);
                textView9.setText(PreviewActivity.this.p_getfirstNameG);
                textView9.setTextColor(Color.parseColor(PreviewActivity.this.label10_1_font_color[1]));
                AssetManager assets9 = PreviewActivity.this.getAssets();
                textView9.setTypeface(Typeface.createFromAsset(assets9, "fonts/" + PreviewActivity.this.label10_1_Font_name[1] + ".ttf"));
                textView9.setLayoutParams(layoutParams11);
                PreviewActivity.this.relative1.addView(textView9);
                TextView textView10 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams12.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._148sdp), 0, 0);
                textView10.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView10.setGravity(1);
                textView10.setText(PreviewActivity.this.p_getrelation);
                textView10.setTextColor(Color.parseColor(PreviewActivity.this.label10_1_font_color[2]));
                AssetManager assets10 = PreviewActivity.this.getAssets();
                textView10.setTypeface(Typeface.createFromAsset(assets10, "fonts/" + PreviewActivity.this.label10_1_Font_name[2] + ".ttf"));
                textView10.setLayoutParams(layoutParams12);
                PreviewActivity.this.relative1.addView(textView10);
                TextView textView11 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams13.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._158sdp), 0, 0);
                textView11.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView11.setGravity(1);
                textView11.setText("Mr. " + PreviewActivity.this.p_getfatherNAmeG + " " + PreviewActivity.this.p_getlastNameG + " & Mrs. " + PreviewActivity.this.p_getmotherNameG + " " + PreviewActivity.this.p_getlastNameG);
                textView11.setTextColor(Color.parseColor(PreviewActivity.this.label10_1_font_color[3]));
                AssetManager assets11 = PreviewActivity.this.getAssets();
                StringBuilder sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(PreviewActivity.this.label10_1_Font_name[3]);
                sb.append(".ttf");
                Typeface createFromAsset = Typeface.createFromAsset(assets11, sb.toString());
                textView11.setTypeface(createFromAsset);
                textView11.setLayoutParams(layoutParams13);
                PreviewActivity.this.relative1.addView(textView11);
                if (!PreviewActivity.this.p_getgrandMothernameG.isEmpty() && !PreviewActivity.this.p_getgrandFathernameG.isEmpty()) {
                    TextView textView12 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams14.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._180sdp), 0, 0);
                    textView12.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView12.setGravity(1);
                    textView12.setText(PreviewActivity.this.p_getgrandrelation);
                    textView12.setTextColor(Color.parseColor(PreviewActivity.this.label10_1_font_color[4]));
                    AssetManager assets12 = PreviewActivity.this.getAssets();
                    Typeface.createFromAsset(assets12, "fonts/" + PreviewActivity.this.label10_1_Font_name[4] + ".ttf");
                    textView12.setTypeface(createFromAsset);
                    textView12.setLayoutParams(layoutParams14);
                    PreviewActivity.this.relative1.addView(textView12);
                    TextView textView13 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams15.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._190sdp), 0, 0);
                    textView13.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView13.setGravity(1);
                    textView13.setText("Mr. " + PreviewActivity.this.p_getgrandFathernameG + " " + PreviewActivity.this.p_getlastNameG + " & Mrs. " + PreviewActivity.this.p_getgrandMothernameG + " " + PreviewActivity.this.p_getlastNameG);
                    textView13.setTextColor(Color.parseColor(PreviewActivity.this.label10_1_font_color[5]));
                    AssetManager assets13 = PreviewActivity.this.getAssets();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fonts/");
                    sb2.append(PreviewActivity.this.label10_1_Font_name[5]);
                    sb2.append(".ttf");
                    textView13.setTypeface(Typeface.createFromAsset(assets13, sb2.toString()));
                    textView13.setLayoutParams(layoutParams15);
                    PreviewActivity.this.relative1.addView(textView13);
                }
                TextView textView14 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams16.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._215sdp), 0, 0);
                textView14.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView14.setGravity(1);
                textView14.setText(PreviewActivity.this.p_getfirstnameB);
                textView14.setTextColor(Color.parseColor(PreviewActivity.this.label10_1_font_color[6]));
                AssetManager assets14 = PreviewActivity.this.getAssets();
                textView14.setTypeface(Typeface.createFromAsset(assets14, "fonts/" + PreviewActivity.this.label10_1_Font_name[6] + ".ttf"));
                textView14.setLayoutParams(layoutParams16);
                PreviewActivity.this.relative1.addView(textView14);
                TextView textView15 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams17.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._255sdp), 0, 0);
                textView15.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView15.setGravity(1);
                textView15.setText(PreviewActivity.this.p_getsecondrelation);
                textView15.setTextColor(Color.parseColor(PreviewActivity.this.label10_1_font_color[7]));
                AssetManager assets15 = PreviewActivity.this.getAssets();
                textView15.setTypeface(Typeface.createFromAsset(assets15, "fonts/" + PreviewActivity.this.label10_1_Font_name[7] + ".ttf"));
                textView15.setLayoutParams(layoutParams17);
                PreviewActivity.this.relative1.addView(textView15);
                TextView textView16 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams18.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._265sdp), 0, 0);
                textView16.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView16.setGravity(1);
                textView16.setText("Mr. " + PreviewActivity.this.p_getfatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & Mrs. " + PreviewActivity.this.p_getmotherNameB + " " + PreviewActivity.this.p_getlastNameB);
                textView16.setTextColor(Color.parseColor(PreviewActivity.this.label10_1_font_color[8]));
                AssetManager assets16 = PreviewActivity.this.getAssets();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("fonts/");
                sb3.append(PreviewActivity.this.label10_1_Font_name[8]);
                sb3.append(".ttf");
                textView16.setTypeface(Typeface.createFromAsset(assets16, sb3.toString()));
                textView16.setLayoutParams(layoutParams18);
                PreviewActivity.this.relative1.addView(textView16);
                if (!PreviewActivity.this.p_getgrandMothernameB.isEmpty() && !PreviewActivity.this.p_getgrandFatherNameB.isEmpty()) {
                    TextView textView17 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams19.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._285sdp), 0, 0);
                    textView17.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView17.setGravity(1);
                    textView17.setText(PreviewActivity.this.p_getsecondgrandrelation);
                    textView17.setTextColor(Color.parseColor(PreviewActivity.this.label10_1_font_color[9]));
                    AssetManager assets17 = PreviewActivity.this.getAssets();
                    textView17.setTypeface(Typeface.createFromAsset(assets17, "fonts/" + PreviewActivity.this.label10_1_Font_name[9] + ".ttf"));
                    textView17.setLayoutParams(layoutParams19);
                    PreviewActivity.this.relative1.addView(textView17);
                    TextView textView18 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams20 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams20.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._295sdp), 0, 0);
                    textView18.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView18.setGravity(1);
                    textView18.setText("Mr. " + PreviewActivity.this.p_getgrandFatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & Mrs. " + PreviewActivity.this.p_getgrandMothernameB + " " + PreviewActivity.this.p_getlastNameB);
                    textView18.setTextColor(Color.parseColor(PreviewActivity.this.label10_1_font_color[10]));
                    AssetManager assets18 = PreviewActivity.this.getAssets();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("fonts/");
                    sb4.append(PreviewActivity.this.label10_1_Font_name[10]);
                    sb4.append(".ttf");
                    textView18.setTypeface(Typeface.createFromAsset(assets18, sb4.toString()));
                    textView18.setLayoutParams(layoutParams20);
                    PreviewActivity.this.relative1.addView(textView18);
                }
                TextView textView19 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams21 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams21.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._320sdp), 0, 0);
                textView19.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView19.setGravity(1);
                textView19.setText(PreviewActivity.this.label10_1_Text[11]);
                textView19.setTextColor(Color.parseColor(PreviewActivity.this.label10_1_font_color[11]));
                AssetManager assets19 = PreviewActivity.this.getAssets();
                textView19.setTypeface(Typeface.createFromAsset(assets19, "fonts/" + PreviewActivity.this.label10_1_Font_name[11] + ".ttf"));
                textView19.setLayoutParams(layoutParams21);
                PreviewActivity.this.relative1.addView(textView19);
            }
            if (i == 2) {
                PreviewActivity.this.relative2 = (RelativeLayout) inflate.findViewById(R.id.rel2);
                ImageView imageView3 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity3 = PreviewActivity.this;
                previewActivity3.bmp = previewActivity3.setBgImg(R.drawable.w_10_up_img_2);
                imageView3.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams22.setMargins(0, 0, 0, 0);
                imageView3.setLayoutParams(layoutParams22);
                PreviewActivity.this.relative2.addView(imageView3, 0);
                TextView textView20 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams23 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams23.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._80sdp), 0, 0);
                textView20.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._7sdp));
                textView20.setGravity(1);
                textView20.setText(PreviewActivity.this.label10_2_Text[0]);
                textView20.setLetterSpacing(0.3f);
                textView20.setTextColor(Color.parseColor(PreviewActivity.this.label10_2_font_color[0]));
                AssetManager assets20 = PreviewActivity.this.getAssets();
                textView20.setTypeface(Typeface.createFromAsset(assets20, "fonts/" + PreviewActivity.this.label10_2_Font_name[0] + ".ttf"));
                textView20.setLayoutParams(layoutParams23);
                PreviewActivity.this.relative2.addView(textView20);
                if (PreviewActivity.this.lenear2 != null) {
                    TextView textView21 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams24.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._115sdp), 0, 0);
                    textView21.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    textView21.setGravity(1);
                    textView21.setText(PreviewActivity.this.p_getfunctionname1);
                    textView21.setTextColor(Color.parseColor(PreviewActivity.this.label10_2_font_color[1]));
                    AssetManager assets21 = PreviewActivity.this.getAssets();
                    textView21.setTypeface(Typeface.createFromAsset(assets21, "fonts/" + PreviewActivity.this.label10_2_Font_name[1] + ".ttf"));
                    textView21.setLayoutParams(layoutParams24);
                    PreviewActivity.this.relative2.addView(textView21);
                    TextView textView22 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams25.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._158sdp), 0, 0);
                    textView22.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView22.setGravity(1);
                    textView22.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView22.setTextColor(Color.parseColor(PreviewActivity.this.label10_2_font_color[2]));
                    AssetManager assets22 = PreviewActivity.this.getAssets();
                    textView22.setTypeface(Typeface.createFromAsset(assets22, "fonts/" + PreviewActivity.this.label10_2_Font_name[2] + ".ttf"));
                    textView22.setLayoutParams(layoutParams25);
                    PreviewActivity.this.relative2.addView(textView22);
                    TextView textView23 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams26 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams26.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._170sdp), 0, 0);
                    textView23.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView23.setGravity(1);
                    textView23.setText(PreviewActivity.this.p_getvenue1);
                    textView23.setTextColor(Color.parseColor(PreviewActivity.this.label10_2_font_color[3]));
                    AssetManager assets23 = PreviewActivity.this.getAssets();
                    textView23.setTypeface(Typeface.createFromAsset(assets23, "fonts/" + PreviewActivity.this.label10_2_Font_name[3] + ".ttf"));
                    textView23.setLayoutParams(layoutParams26);
                    PreviewActivity.this.relative2.addView(textView23);
                } else {
                    TextView textView24 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams27.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._192sdp), 0, 0);
                    textView24.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    textView24.setGravity(1);
                    textView24.setText(PreviewActivity.this.p_getfunctionname1);
                    textView24.setTextColor(Color.parseColor(PreviewActivity.this.label10_2_font_color[1]));
                    AssetManager assets24 = PreviewActivity.this.getAssets();
                    textView24.setTypeface(Typeface.createFromAsset(assets24, "fonts/" + PreviewActivity.this.label10_2_Font_name[1] + ".ttf"));
                    textView24.setLayoutParams(layoutParams27);
                    PreviewActivity.this.relative2.addView(textView24);
                    TextView textView25 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams28 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams28.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._235sdp), 0, 0);
                    textView25.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView25.setGravity(1);
                    textView25.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView25.setTextColor(Color.parseColor(PreviewActivity.this.label10_2_font_color[2]));
                    AssetManager assets25 = PreviewActivity.this.getAssets();
                    textView25.setTypeface(Typeface.createFromAsset(assets25, "fonts/" + PreviewActivity.this.label10_2_Font_name[2] + ".ttf"));
                    textView25.setLayoutParams(layoutParams28);
                    PreviewActivity.this.relative2.addView(textView25);
                    TextView textView26 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams29 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams29.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._248sdp), 0, 0);
                    textView26.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView26.setGravity(1);
                    textView26.setText(PreviewActivity.this.p_getvenue1);
                    textView26.setTextColor(Color.parseColor(PreviewActivity.this.label10_2_font_color[3]));
                    AssetManager assets26 = PreviewActivity.this.getAssets();
                    textView26.setTypeface(Typeface.createFromAsset(assets26, "fonts/" + PreviewActivity.this.label10_2_Font_name[3] + ".ttf"));
                    textView26.setLayoutParams(layoutParams29);
                    PreviewActivity.this.relative2.addView(textView26);
                }
                if (PreviewActivity.this.p_getfunctionname2 != null) {
                    TextView textView27 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams30 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams30.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._192sdp), 0, 0);
                    textView27.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    textView27.setGravity(1);
                    textView27.setText(PreviewActivity.this.p_getfunctionname2);
                    textView27.setTextColor(Color.parseColor(PreviewActivity.this.label10_2_font_color[4]));
                    AssetManager assets27 = PreviewActivity.this.getAssets();
                    textView27.setTypeface(Typeface.createFromAsset(assets27, "fonts/" + PreviewActivity.this.label10_2_Font_name[4] + ".ttf"));
                    textView27.setLayoutParams(layoutParams30);
                    PreviewActivity.this.relative2.addView(textView27);
                    TextView textView28 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams31 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams31.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._235sdp), 0, 0);
                    textView28.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView28.setGravity(1);
                    textView28.setText(PreviewActivity.this.p_getdate2 + ", " + PreviewActivity.this.p_gettime2 + " Onwards");
                    textView28.setTextColor(Color.parseColor(PreviewActivity.this.label10_2_font_color[5]));
                    AssetManager assets28 = PreviewActivity.this.getAssets();
                    textView28.setTypeface(Typeface.createFromAsset(assets28, "fonts/" + PreviewActivity.this.label10_2_Font_name[5] + ".ttf"));
                    textView28.setLayoutParams(layoutParams31);
                    PreviewActivity.this.relative2.addView(textView28);
                    TextView textView29 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams32 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams32.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._248sdp), 0, 0);
                    textView29.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView29.setGravity(1);
                    textView29.setText(PreviewActivity.this.p_getvenue2);
                    textView29.setTextColor(Color.parseColor(PreviewActivity.this.label10_2_font_color[6]));
                    AssetManager assets29 = PreviewActivity.this.getAssets();
                    textView29.setTypeface(Typeface.createFromAsset(assets29, "fonts/" + PreviewActivity.this.label10_2_Font_name[6] + ".ttf"));
                    textView29.setLayoutParams(layoutParams32);
                    PreviewActivity.this.relative2.addView(textView29);
                }
                if (PreviewActivity.this.p_getfunctionname3 != null) {
                    TextView textView30 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams33 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams33.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._270sdp), 0, 0);
                    textView30.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    textView30.setGravity(1);
                    textView30.setText(PreviewActivity.this.p_getfunctionname3);
                    textView30.setTextColor(Color.parseColor(PreviewActivity.this.label10_2_font_color[7]));
                    AssetManager assets30 = PreviewActivity.this.getAssets();
                    textView30.setTypeface(Typeface.createFromAsset(assets30, "fonts/" + PreviewActivity.this.label10_2_Font_name[7] + ".ttf"));
                    textView30.setLayoutParams(layoutParams33);
                    PreviewActivity.this.relative2.addView(textView30);
                    TextView textView31 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams34 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams34.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._312sdp), 0, 0);
                    textView31.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView31.setGravity(1);
                    textView31.setText(PreviewActivity.this.p_getdate3 + ", " + PreviewActivity.this.p_gettime3 + " Onwards");
                    textView31.setTextColor(Color.parseColor(PreviewActivity.this.label10_2_font_color[8]));
                    AssetManager assets31 = PreviewActivity.this.getAssets();
                    textView31.setTypeface(Typeface.createFromAsset(assets31, "fonts/" + PreviewActivity.this.label10_2_Font_name[8] + ".ttf"));
                    textView31.setLayoutParams(layoutParams34);
                    PreviewActivity.this.relative2.addView(textView31);
                    TextView textView32 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams35 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams35.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._325sdp), 0, 0);
                    textView32.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView32.setGravity(1);
                    textView32.setText(PreviewActivity.this.p_getvenue3);
                    textView32.setTextColor(Color.parseColor(PreviewActivity.this.label10_2_font_color[9]));
                    AssetManager assets32 = PreviewActivity.this.getAssets();
                    textView32.setTypeface(Typeface.createFromAsset(assets32, "fonts/" + PreviewActivity.this.label10_2_Font_name[9] + ".ttf"));
                    textView32.setLayoutParams(layoutParams35);
                    PreviewActivity.this.relative2.addView(textView32);
                }
            }
            if (i == 3) {
                PreviewActivity.this.relative3 = (RelativeLayout) inflate.findViewById(R.id.rel3);
                ImageView imageView4 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity4 = PreviewActivity.this;
                previewActivity4.bmp = previewActivity4.setBgImg(R.drawable.w_10_up_img_3);
                imageView4.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams36 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams36.setMargins(0, 0, 0, 0);
                imageView4.setLayoutParams(layoutParams36);
                PreviewActivity.this.relative3.addView(imageView4, 0);
                TextView textView33 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams37 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams37.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._80sdp), 0, 0);
                textView33.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView33.setGravity(1);
                textView33.setText(PreviewActivity.this.label10_3_Text[0]);
                textView33.setTextColor(Color.parseColor(PreviewActivity.this.label10_3_font_color[0]));
                AssetManager assets33 = PreviewActivity.this.getAssets();
                textView33.setTypeface(Typeface.createFromAsset(assets33, "fonts/" + PreviewActivity.this.label10_3_Font_name[0] + ".ttf"));
                textView33.setLayoutParams(layoutParams37);
                PreviewActivity.this.relative3.addView(textView33);
                TextView textView34 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams38 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams38.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._130sdp), 0, 0);
                textView34.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView34.setGravity(1);
                textView34.setText(PreviewActivity.this.p_getvenue_other);
                textView34.setTextColor(Color.parseColor(PreviewActivity.this.label10_3_font_color[1]));
                AssetManager assets34 = PreviewActivity.this.getAssets();
                textView34.setTypeface(Typeface.createFromAsset(assets34, "fonts/" + PreviewActivity.this.label10_3_Font_name[1] + ".ttf"));
                textView34.setLayoutParams(layoutParams38);
                PreviewActivity.this.relative3.addView(textView34);
                TextView textView35 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams39 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams39.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._175sdp), 0, 0);
                textView35.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView35.setGravity(1);
                textView35.setText("Rsvp");
                textView35.setTextColor(Color.parseColor(PreviewActivity.this.label10_3_font_color[2]));
                AssetManager assets35 = PreviewActivity.this.getAssets();
                textView35.setTypeface(Typeface.createFromAsset(assets35, "fonts/" + PreviewActivity.this.label10_3_Font_name[2] + ".ttf"));
                textView35.setLayoutParams(layoutParams39);
                PreviewActivity.this.relative3.addView(textView35);
                TextView textView36 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams40 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams40.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._225sdp), 0, 0);
                textView36.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView36.setGravity(1);
                textView36.setText(PreviewActivity.this.p_getRsvp);
                textView36.setTextColor(Color.parseColor(PreviewActivity.this.label10_3_font_color[3]));
                AssetManager assets36 = PreviewActivity.this.getAssets();
                textView36.setTypeface(Typeface.createFromAsset(assets36, "fonts/" + PreviewActivity.this.label10_3_Font_name[3] + ".ttf"));
                textView36.setLayoutParams(layoutParams40);
                PreviewActivity.this.relative3.addView(textView36);
                TextView textView37 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams41 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams41.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._300sdp), 0, 0);
                textView37.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView37.setGravity(1);
                textView37.setText(PreviewActivity.this.p_getdate_other);
                textView37.setLetterSpacing(0.2f);
                textView37.setTextColor(Color.parseColor(PreviewActivity.this.label10_3_font_color[4]));
                AssetManager assets37 = PreviewActivity.this.getAssets();
                textView37.setTypeface(Typeface.createFromAsset(assets37, "fonts/" + PreviewActivity.this.label10_3_Font_name[4] + ".ttf"));
                textView37.setLayoutParams(layoutParams41);
                PreviewActivity.this.relative3.addView(textView37);
                TextView textView38 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams42 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams42.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._325sdp), 0, 0);
                textView38.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._5sdp));
                textView38.setGravity(1);
                textView38.setText(PreviewActivity.this.label10_3_Text[5]);
                textView38.setTextColor(Color.parseColor(PreviewActivity.this.label10_3_font_color[5]));
                AssetManager assets38 = PreviewActivity.this.getAssets();
                textView38.setTypeface(Typeface.createFromAsset(assets38, "fonts/" + PreviewActivity.this.label10_3_Font_name[5] + ".ttf"));
                textView38.setLayoutParams(layoutParams42);
                PreviewActivity.this.relative3.addView(textView38);
            }
            viewGroup.addView(inflate);
            return inflate;
        }

        @Override 
        public int getCount() {
            return PreviewActivity.this.layouts.length;
        }

        @Override 
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    
    public class MyViewPagerAdapter11 extends PagerAdapter {
        private LayoutInflater layoutInflater;

        @Override 
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public MyViewPagerAdapter11() {
        }

        @Override 
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            LayoutInflater layoutInflater = (LayoutInflater) PreviewActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            this.layoutInflater = layoutInflater;
            View inflate = layoutInflater.inflate(PreviewActivity.this.layouts[i], viewGroup, false);
            if (i == 0) {
                PreviewActivity.this.relative0 = (RelativeLayout) inflate.findViewById(R.id.rel0);
                ImageView imageView = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity = PreviewActivity.this;
                previewActivity.bmp = previewActivity.setBgImg(R.drawable.w_11_up_img_0);
                imageView.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams.setMargins(0, 0, 0, 0);
                imageView.setLayoutParams(layoutParams);
                PreviewActivity.this.relative0.addView(imageView, 0);
                TextView textView = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._100sdp), 0, 0);
                textView.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView.setGravity(1);
                textView.setText(PreviewActivity.this.label11_0_Text[0]);
                textView.setTextColor(Color.parseColor(PreviewActivity.this.label11_0_font_color[0]));
                AssetManager assets = PreviewActivity.this.getAssets();
                textView.setTypeface(Typeface.createFromAsset(assets, "fonts/" + PreviewActivity.this.label11_0_Font_name[0] + ".ttf"));
                textView.setLayoutParams(layoutParams2);
                PreviewActivity.this.relative0.addView(textView);
                TextView textView2 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._170sdp), 0, 0);
                textView2.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView2.setGravity(1);
                textView2.setText(PreviewActivity.this.p_getfirstNameG);
                textView2.setTextColor(Color.parseColor(PreviewActivity.this.label11_0_font_color[1]));
                AssetManager assets2 = PreviewActivity.this.getAssets();
                textView2.setTypeface(Typeface.createFromAsset(assets2, "fonts/" + PreviewActivity.this.label11_0_Font_name[1] + ".ttf"));
                textView2.setLayoutParams(layoutParams3);
                PreviewActivity.this.relative0.addView(textView2);
                TextView textView3 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams4.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._220sdp), 0, 0);
                textView3.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView3.setGravity(1);
                textView3.setText(PreviewActivity.this.label11_0_Text[2]);
                textView3.setTextColor(Color.parseColor(PreviewActivity.this.label11_0_font_color[2]));
                AssetManager assets3 = PreviewActivity.this.getAssets();
                textView3.setTypeface(Typeface.createFromAsset(assets3, "fonts/" + PreviewActivity.this.label11_0_Font_name[2] + ".ttf"));
                textView3.setLayoutParams(layoutParams4);
                PreviewActivity.this.relative0.addView(textView3);
                TextView textView4 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams5.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._255sdp), 0, 0);
                textView4.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView4.setGravity(1);
                textView4.setText(PreviewActivity.this.p_getfirstnameB);
                textView4.setTextColor(Color.parseColor(PreviewActivity.this.label11_0_font_color[3]));
                AssetManager assets4 = PreviewActivity.this.getAssets();
                textView4.setTypeface(Typeface.createFromAsset(assets4, "fonts/" + PreviewActivity.this.label11_0_Font_name[3] + ".ttf"));
                textView4.setLayoutParams(layoutParams5);
                PreviewActivity.this.relative0.addView(textView4);
                TextView textView5 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams6.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._340sdp), 0, 0);
                textView5.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView5.setGravity(1);
                textView5.setText(PreviewActivity.this.label11_0_Text[4]);
                textView5.setTextColor(Color.parseColor(PreviewActivity.this.label11_0_font_color[4]));
                AssetManager assets5 = PreviewActivity.this.getAssets();
                textView5.setTypeface(Typeface.createFromAsset(assets5, "fonts/" + PreviewActivity.this.label11_0_Font_name[4] + ".ttf"));
                textView5.setLayoutParams(layoutParams6);
                PreviewActivity.this.relative0.addView(textView5);
                TextView textView6 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams7.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._365sdp), 0, 0);
                textView6.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView6.setGravity(1);
                textView6.setText(PreviewActivity.this.p_getdate_other);
                textView6.setLetterSpacing(0.1f);
                textView6.setTextColor(Color.parseColor(PreviewActivity.this.label11_0_font_color[5]));
                AssetManager assets6 = PreviewActivity.this.getAssets();
                textView6.setTypeface(Typeface.createFromAsset(assets6, "fonts/" + PreviewActivity.this.label11_0_Font_name[5] + ".ttf"));
                textView6.setLayoutParams(layoutParams7);
                PreviewActivity.this.relative0.addView(textView6);
            }
            if (i == 1) {
                PreviewActivity.this.relative1 = (RelativeLayout) inflate.findViewById(R.id.rel1);
                ImageView imageView2 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity2 = PreviewActivity.this;
                previewActivity2.bmp = previewActivity2.setBgImg(R.drawable.w_11_up_img_1);
                imageView2.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams8.setMargins(0, 0, 0, 0);
                imageView2.setLayoutParams(layoutParams8);
                PreviewActivity.this.relative1.addView(imageView2, 0);
                TextView textView7 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams9.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._40sdp), 0, 0);
                textView7.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView7.setGravity(1);
                textView7.setText(PreviewActivity.this.label11_1_Text[0]);
                textView7.setTextColor(Color.parseColor(PreviewActivity.this.label11_1_font_color[0]));
                AssetManager assets7 = PreviewActivity.this.getAssets();
                textView7.setTypeface(Typeface.createFromAsset(assets7, "fonts/" + PreviewActivity.this.label11_1_Font_name[0] + ".ttf"));
                textView7.setLayoutParams(layoutParams9);
                PreviewActivity.this.relative1.addView(textView7);
                TextView textView8 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams10.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._100sdp), 0, 0);
                textView8.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView8.setGravity(1);
                textView8.setText(PreviewActivity.this.p_getfirstNameG);
                textView8.setTextColor(Color.parseColor(PreviewActivity.this.label11_1_font_color[1]));
                AssetManager assets8 = PreviewActivity.this.getAssets();
                textView8.setTypeface(Typeface.createFromAsset(assets8, "fonts/" + PreviewActivity.this.label11_1_Font_name[1] + ".ttf"));
                textView8.setLayoutParams(layoutParams10);
                PreviewActivity.this.relative1.addView(textView8);
                TextView textView9 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams11.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._140sdp), 0, 0);
                textView9.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView9.setGravity(1);
                textView9.setText(PreviewActivity.this.p_getrelation);
                textView9.setAllCaps(true);
                textView9.setTextColor(Color.parseColor(PreviewActivity.this.label11_1_font_color[2]));
                AssetManager assets9 = PreviewActivity.this.getAssets();
                textView9.setTypeface(Typeface.createFromAsset(assets9, "fonts/" + PreviewActivity.this.label11_1_Font_name[2] + ".ttf"));
                textView9.setLayoutParams(layoutParams11);
                PreviewActivity.this.relative1.addView(textView9);
                TextView textView10 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams12.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._152sdp), 0, 0);
                textView10.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView10.setGravity(1);
                textView10.setText("mr. " + PreviewActivity.this.p_getfatherNAmeG + " " + PreviewActivity.this.p_getlastNameG + " & mrs. " + PreviewActivity.this.p_getmotherNameG + " " + PreviewActivity.this.p_getlastNameG);
                textView10.setAllCaps(true);
                textView10.setTextColor(Color.parseColor(PreviewActivity.this.label11_1_font_color[3]));
                AssetManager assets10 = PreviewActivity.this.getAssets();
                StringBuilder sb = new StringBuilder();
                sb.append("fonts/");
                sb.append(PreviewActivity.this.label11_1_Font_name[3]);
                sb.append(".ttf");
                textView10.setTypeface(Typeface.createFromAsset(assets10, sb.toString()));
                textView10.setLayoutParams(layoutParams12);
                PreviewActivity.this.relative1.addView(textView10);
                if (!PreviewActivity.this.p_getgrandMothernameG.isEmpty() && !PreviewActivity.this.p_getgrandFathernameG.isEmpty()) {
                    TextView textView11 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams13.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._178sdp), 0, 0);
                    textView11.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView11.setGravity(1);
                    textView11.setText(PreviewActivity.this.p_getgrandrelation);
                    textView11.setAllCaps(true);
                    textView11.setTextColor(Color.parseColor(PreviewActivity.this.label11_1_font_color[4]));
                    AssetManager assets11 = PreviewActivity.this.getAssets();
                    textView11.setTypeface(Typeface.createFromAsset(assets11, "fonts/" + PreviewActivity.this.label11_1_Font_name[4] + ".ttf"));
                    textView11.setLayoutParams(layoutParams13);
                    PreviewActivity.this.relative1.addView(textView11);
                    TextView textView12 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams14.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._190sdp), 0, 0);
                    textView12.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView12.setGravity(1);
                    textView12.setText("mr. " + PreviewActivity.this.p_getgrandFathernameG + " " + PreviewActivity.this.p_getlastNameG + " & mrs. " + PreviewActivity.this.p_getgrandMothernameG + " " + PreviewActivity.this.p_getlastNameG);
                    textView12.setAllCaps(true);
                    textView12.setTextColor(Color.parseColor(PreviewActivity.this.label11_1_font_color[5]));
                    AssetManager assets12 = PreviewActivity.this.getAssets();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("fonts/");
                    sb2.append(PreviewActivity.this.label11_1_Font_name[5]);
                    sb2.append(".ttf");
                    textView12.setTypeface(Typeface.createFromAsset(assets12, sb2.toString()));
                    textView12.setLayoutParams(layoutParams14);
                    PreviewActivity.this.relative1.addView(textView12);
                }
                TextView textView13 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams15.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._225sdp), 0, 0);
                textView13.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView13.setGravity(1);
                textView13.setText(PreviewActivity.this.p_getfirstnameB);
                textView13.setTextColor(Color.parseColor(PreviewActivity.this.label11_1_font_color[6]));
                AssetManager assets13 = PreviewActivity.this.getAssets();
                textView13.setTypeface(Typeface.createFromAsset(assets13, "fonts/" + PreviewActivity.this.label11_1_Font_name[6] + ".ttf"));
                textView13.setLayoutParams(layoutParams15);
                PreviewActivity.this.relative1.addView(textView13);
                TextView textView14 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams16.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._265sdp), 0, 0);
                textView14.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView14.setGravity(1);
                textView14.setText(PreviewActivity.this.p_getsecondrelation);
                textView14.setTextColor(Color.parseColor(PreviewActivity.this.label11_1_font_color[7]));
                AssetManager assets14 = PreviewActivity.this.getAssets();
                textView14.setTypeface(Typeface.createFromAsset(assets14, "fonts/" + PreviewActivity.this.label11_1_Font_name[7] + ".ttf"));
                textView14.setLayoutParams(layoutParams16);
                PreviewActivity.this.relative1.addView(textView14);
                TextView textView15 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams17.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._275sdp), 0, 0);
                textView15.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView15.setGravity(1);
                textView15.setText("mr. " + PreviewActivity.this.p_getfatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & mrs. " + PreviewActivity.this.p_getmotherNameB + " " + PreviewActivity.this.p_getlastNameB);
                textView15.setTextColor(Color.parseColor(PreviewActivity.this.label11_1_font_color[8]));
                AssetManager assets15 = PreviewActivity.this.getAssets();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("fonts/");
                sb3.append(PreviewActivity.this.label11_1_Font_name[8]);
                sb3.append(".ttf");
                textView15.setTypeface(Typeface.createFromAsset(assets15, sb3.toString()));
                textView15.setLayoutParams(layoutParams17);
                PreviewActivity.this.relative1.addView(textView15);
                if (!PreviewActivity.this.p_getgrandMothernameB.isEmpty() && !PreviewActivity.this.p_getgrandFatherNameB.isEmpty()) {
                    TextView textView16 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams18 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams18.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._300sdp), 0, 0);
                    textView16.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView16.setGravity(1);
                    textView16.setText(PreviewActivity.this.p_getsecondgrandrelation);
                    textView16.setTextColor(Color.parseColor(PreviewActivity.this.label11_1_font_color[9]));
                    AssetManager assets16 = PreviewActivity.this.getAssets();
                    textView16.setTypeface(Typeface.createFromAsset(assets16, "fonts/" + PreviewActivity.this.label11_1_Font_name[9] + ".ttf"));
                    textView16.setLayoutParams(layoutParams18);
                    PreviewActivity.this.relative1.addView(textView16);
                    TextView textView17 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams19 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams19.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._310sdp), 0, 0);
                    textView17.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView17.setGravity(1);
                    textView17.setText("mr. " + PreviewActivity.this.p_getgrandFatherNameB + " " + PreviewActivity.this.p_getlastNameB + " & mrs. " + PreviewActivity.this.p_getgrandMothernameB + " " + PreviewActivity.this.p_getlastNameB);
                    textView17.setTextColor(Color.parseColor(PreviewActivity.this.label11_1_font_color[10]));
                    AssetManager assets17 = PreviewActivity.this.getAssets();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("fonts/");
                    sb4.append(PreviewActivity.this.label11_1_Font_name[10]);
                    sb4.append(".ttf");
                    textView17.setTypeface(Typeface.createFromAsset(assets17, sb4.toString()));
                    textView17.setLayoutParams(layoutParams19);
                    PreviewActivity.this.relative1.addView(textView17);
                }
                TextView textView18 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams20 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams20.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._360sdp), 0, 0);
                textView18.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView18.setGravity(1);
                textView18.setText(PreviewActivity.this.label11_1_Text[11]);
                textView18.setTextColor(Color.parseColor(PreviewActivity.this.label11_1_font_color[11]));
                AssetManager assets18 = PreviewActivity.this.getAssets();
                textView18.setTypeface(Typeface.createFromAsset(assets18, "fonts/" + PreviewActivity.this.label11_1_Font_name[11] + ".ttf"));
                textView18.setLayoutParams(layoutParams20);
                PreviewActivity.this.relative1.addView(textView18);
            }
            if (i == 2) {
                PreviewActivity.this.relative2 = (RelativeLayout) inflate.findViewById(R.id.rel2);
                ImageView imageView3 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity3 = PreviewActivity.this;
                previewActivity3.bmp = previewActivity3.setBgImg(R.drawable.w_11_up_img_2);
                imageView3.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams21.setMargins(0, 0, 0, 0);
                imageView3.setLayoutParams(layoutParams21);
                PreviewActivity.this.relative2.addView(imageView3, 0);
                TextView textView19 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams22 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams22.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._50sdp), 0, 0);
                textView19.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                textView19.setGravity(1);
                textView19.setText(PreviewActivity.this.label11_2_Text[0]);
                textView19.setTextColor(Color.parseColor(PreviewActivity.this.label11_2_font_color[0]));
                AssetManager assets19 = PreviewActivity.this.getAssets();
                textView19.setTypeface(Typeface.createFromAsset(assets19, "fonts/" + PreviewActivity.this.label11_2_Font_name[0] + ".ttf"));
                textView19.setLayoutParams(layoutParams22);
                PreviewActivity.this.relative2.addView(textView19);
                if (PreviewActivity.this.lenear2 != null) {
                    TextView textView20 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams23 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams23.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._110sdp), 0, 0);
                    textView20.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    textView20.setGravity(1);
                    textView20.setText(PreviewActivity.this.p_getfunctionname1);
                    textView20.setTextColor(Color.parseColor(PreviewActivity.this.label11_2_font_color[1]));
                    AssetManager assets20 = PreviewActivity.this.getAssets();
                    textView20.setTypeface(Typeface.createFromAsset(assets20, "fonts/" + PreviewActivity.this.label11_2_Font_name[1] + ".ttf"));
                    textView20.setLayoutParams(layoutParams23);
                    PreviewActivity.this.relative2.addView(textView20);
                    TextView textView21 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams24 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams24.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._150sdp), 0, 0);
                    textView21.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView21.setGravity(1);
                    textView21.setAllCaps(true);
                    textView21.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView21.setTextColor(Color.parseColor(PreviewActivity.this.label11_2_font_color[2]));
                    AssetManager assets21 = PreviewActivity.this.getAssets();
                    textView21.setTypeface(Typeface.createFromAsset(assets21, "fonts/" + PreviewActivity.this.label11_2_Font_name[2] + ".ttf"));
                    textView21.setLayoutParams(layoutParams24);
                    PreviewActivity.this.relative2.addView(textView21);
                    TextView textView22 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams25 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams25.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._165sdp), 0, 0);
                    textView22.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView22.setGravity(1);
                    textView22.setAllCaps(true);
                    textView22.setText(PreviewActivity.this.p_getvenue1);
                    textView22.setTextColor(Color.parseColor(PreviewActivity.this.label11_2_font_color[3]));
                    AssetManager assets22 = PreviewActivity.this.getAssets();
                    textView22.setTypeface(Typeface.createFromAsset(assets22, "fonts/" + PreviewActivity.this.label11_2_Font_name[3] + ".ttf"));
                    textView22.setLayoutParams(layoutParams25);
                    PreviewActivity.this.relative2.addView(textView22);
                } else {
                    TextView textView23 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams26 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams26.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._195sdp), 0, 0);
                    textView23.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    textView23.setGravity(1);
                    textView23.setText(PreviewActivity.this.p_getfunctionname1);
                    textView23.setTextColor(Color.parseColor(PreviewActivity.this.label11_2_font_color[1]));
                    AssetManager assets23 = PreviewActivity.this.getAssets();
                    textView23.setTypeface(Typeface.createFromAsset(assets23, "fonts/" + PreviewActivity.this.label11_2_Font_name[1] + ".ttf"));
                    textView23.setLayoutParams(layoutParams26);
                    PreviewActivity.this.relative2.addView(textView23);
                    TextView textView24 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams27 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams27.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._238sdp), 0, 0);
                    textView24.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView24.setGravity(1);
                    textView24.setText(PreviewActivity.this.p_getdate1 + ", " + PreviewActivity.this.p_gettime1 + " Onwards");
                    textView24.setTextColor(Color.parseColor(PreviewActivity.this.label11_2_font_color[2]));
                    AssetManager assets24 = PreviewActivity.this.getAssets();
                    textView24.setTypeface(Typeface.createFromAsset(assets24, "fonts/" + PreviewActivity.this.label11_2_Font_name[2] + ".ttf"));
                    textView24.setLayoutParams(layoutParams27);
                    PreviewActivity.this.relative2.addView(textView24);
                    TextView textView25 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams28 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams28.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._252sdp), 0, 0);
                    textView25.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView25.setGravity(1);
                    textView25.setText(PreviewActivity.this.p_getvenue1);
                    textView25.setTextColor(Color.parseColor(PreviewActivity.this.label11_2_font_color[3]));
                    AssetManager assets25 = PreviewActivity.this.getAssets();
                    textView25.setTypeface(Typeface.createFromAsset(assets25, "fonts/" + PreviewActivity.this.label11_2_Font_name[3] + ".ttf"));
                    textView25.setLayoutParams(layoutParams28);
                    PreviewActivity.this.relative2.addView(textView25);
                }
                if (PreviewActivity.this.p_getfunctionname2 != null) {
                    TextView textView26 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams29 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams29.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._195sdp), 0, 0);
                    textView26.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    textView26.setGravity(1);
                    textView26.setText(PreviewActivity.this.p_getfunctionname2);
                    textView26.setTextColor(Color.parseColor(PreviewActivity.this.label11_2_font_color[4]));
                    AssetManager assets26 = PreviewActivity.this.getAssets();
                    textView26.setTypeface(Typeface.createFromAsset(assets26, "fonts/" + PreviewActivity.this.label11_2_Font_name[4] + ".ttf"));
                    textView26.setLayoutParams(layoutParams29);
                    PreviewActivity.this.relative2.addView(textView26);
                    TextView textView27 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams30 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams30.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._238sdp), 0, 0);
                    textView27.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView27.setGravity(1);
                    textView27.setText(PreviewActivity.this.p_getdate2 + ", " + PreviewActivity.this.p_gettime2 + " Onwards");
                    textView27.setTextColor(Color.parseColor(PreviewActivity.this.label11_2_font_color[5]));
                    AssetManager assets27 = PreviewActivity.this.getAssets();
                    textView27.setTypeface(Typeface.createFromAsset(assets27, "fonts/" + PreviewActivity.this.label11_2_Font_name[5] + ".ttf"));
                    textView27.setLayoutParams(layoutParams30);
                    PreviewActivity.this.relative2.addView(textView27);
                    TextView textView28 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams31 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams31.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._252sdp), 0, 0);
                    textView28.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView28.setGravity(1);
                    textView28.setText(PreviewActivity.this.p_getvenue2);
                    textView28.setTextColor(Color.parseColor(PreviewActivity.this.label11_2_font_color[6]));
                    AssetManager assets28 = PreviewActivity.this.getAssets();
                    textView28.setTypeface(Typeface.createFromAsset(assets28, "fonts/" + PreviewActivity.this.label11_2_Font_name[6] + ".ttf"));
                    textView28.setLayoutParams(layoutParams31);
                    PreviewActivity.this.relative2.addView(textView28);
                }
                if (PreviewActivity.this.p_getfunctionname3 != null) {
                    TextView textView29 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams32 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams32.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._285sdp), 0, 0);
                    textView29.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._10sdp));
                    textView29.setGravity(1);
                    textView29.setText(PreviewActivity.this.p_getfunctionname3);
                    textView29.setTextColor(Color.parseColor(PreviewActivity.this.label11_2_font_color[7]));
                    AssetManager assets29 = PreviewActivity.this.getAssets();
                    textView29.setTypeface(Typeface.createFromAsset(assets29, "fonts/" + PreviewActivity.this.label11_2_Font_name[7] + ".ttf"));
                    textView29.setLayoutParams(layoutParams32);
                    PreviewActivity.this.relative2.addView(textView29);
                    TextView textView30 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams33 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams33.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._330sdp), 0, 0);
                    textView30.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView30.setGravity(1);
                    textView30.setText(PreviewActivity.this.p_getdate3 + ", " + PreviewActivity.this.p_gettime3 + " Onwards");
                    textView30.setTextColor(Color.parseColor(PreviewActivity.this.label11_2_font_color[8]));
                    AssetManager assets30 = PreviewActivity.this.getAssets();
                    textView30.setTypeface(Typeface.createFromAsset(assets30, "fonts/" + PreviewActivity.this.label11_2_Font_name[8] + ".ttf"));
                    textView30.setLayoutParams(layoutParams33);
                    PreviewActivity.this.relative2.addView(textView30);
                    TextView textView31 = new TextView(PreviewActivity.this);
                    RelativeLayout.LayoutParams layoutParams34 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams34.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._345sdp), 0, 0);
                    textView31.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                    textView31.setGravity(1);
                    textView31.setText(PreviewActivity.this.p_getvenue3);
                    textView31.setTextColor(Color.parseColor(PreviewActivity.this.label11_2_font_color[9]));
                    AssetManager assets31 = PreviewActivity.this.getAssets();
                    textView31.setTypeface(Typeface.createFromAsset(assets31, "fonts/" + PreviewActivity.this.label11_2_Font_name[9] + ".ttf"));
                    textView31.setLayoutParams(layoutParams34);
                    PreviewActivity.this.relative2.addView(textView31);
                }
            }
            if (i == 3) {
                PreviewActivity.this.relative3 = (RelativeLayout) inflate.findViewById(R.id.rel3);
                ImageView imageView4 = new ImageView(PreviewActivity.this);
                PreviewActivity previewActivity4 = PreviewActivity.this;
                previewActivity4.bmp = previewActivity4.setBgImg(R.drawable.w_11_up_img_3);
                imageView4.setImageBitmap(PreviewActivity.this.bmp);
                LinearLayout.LayoutParams layoutParams35 = new LinearLayout.LayoutParams((int) PreviewActivity.this.screenWidth, (int) PreviewActivity.this.newHeight);
                layoutParams35.setMargins(0, 0, 0, 0);
                imageView4.setLayoutParams(layoutParams35);
                PreviewActivity.this.relative3.addView(imageView4, 0);
                TextView textView32 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams36 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams36.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._90sdp), 0, 0);
                textView32.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._8sdp));
                textView32.setGravity(1);
                textView32.setText(PreviewActivity.this.label11_3_Text[0]);
                textView32.setTextColor(Color.parseColor(PreviewActivity.this.label11_3_font_color[0]));
                AssetManager assets32 = PreviewActivity.this.getAssets();
                textView32.setTypeface(Typeface.createFromAsset(assets32, "fonts/" + PreviewActivity.this.label11_3_Font_name[0] + ".ttf"));
                textView32.setLayoutParams(layoutParams36);
                PreviewActivity.this.relative3.addView(textView32);
                TextView textView33 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams37 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams37.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._135sdp), 0, 0);
                textView33.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView33.setGravity(1);
                textView33.setText(PreviewActivity.this.label11_3_Text[1]);
                textView33.setTextColor(Color.parseColor(PreviewActivity.this.label11_3_font_color[1]));
                AssetManager assets33 = PreviewActivity.this.getAssets();
                textView33.setTypeface(Typeface.createFromAsset(assets33, "fonts/" + PreviewActivity.this.label11_3_Font_name[1] + ".ttf"));
                textView33.setLayoutParams(layoutParams37);
                PreviewActivity.this.relative3.addView(textView33);
                TextView textView34 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams38 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams38.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._180sdp), 0, 0);
                textView34.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView34.setGravity(1);
                textView34.setText(PreviewActivity.this.p_getvenue_other);
                textView34.setTextColor(Color.parseColor(PreviewActivity.this.label11_3_font_color[2]));
                AssetManager assets34 = PreviewActivity.this.getAssets();
                textView34.setTypeface(Typeface.createFromAsset(assets34, "fonts/" + PreviewActivity.this.label11_3_Font_name[2] + ".ttf"));
                textView34.setLayoutParams(layoutParams38);
                PreviewActivity.this.relative3.addView(textView34);
                TextView textView35 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams39 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams39.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._220sdp), 0, 0);
                textView35.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._12sdp));
                textView35.setGravity(1);
                textView35.setText("Rsvp");
                textView35.setTextColor(Color.parseColor(PreviewActivity.this.label11_3_font_color[3]));
                AssetManager assets35 = PreviewActivity.this.getAssets();
                textView35.setTypeface(Typeface.createFromAsset(assets35, "fonts/" + PreviewActivity.this.label11_3_Font_name[3] + ".ttf"));
                textView35.setLayoutParams(layoutParams39);
                PreviewActivity.this.relative3.addView(textView35);
                TextView textView36 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams40 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams40.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._265sdp), 0, 0);
                textView36.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._3sdp));
                textView36.setGravity(1);
                textView36.setText(PreviewActivity.this.p_getRsvp);
                textView36.setTextColor(Color.parseColor(PreviewActivity.this.label11_3_font_color[4]));
                AssetManager assets36 = PreviewActivity.this.getAssets();
                textView36.setTypeface(Typeface.createFromAsset(assets36, "fonts/" + PreviewActivity.this.label11_3_Font_name[4] + ".ttf"));
                textView36.setLayoutParams(layoutParams40);
                PreviewActivity.this.relative3.addView(textView36);
                TextView textView37 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams41 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams41.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._330sdp), 0, 0);
                textView37.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._7sdp));
                textView37.setGravity(1);
                textView37.setText(PreviewActivity.this.p_getdate_other);
                textView37.setTextColor(Color.parseColor(PreviewActivity.this.label11_3_font_color[5]));
                AssetManager assets37 = PreviewActivity.this.getAssets();
                textView37.setTypeface(Typeface.createFromAsset(assets37, "fonts/" + PreviewActivity.this.label11_3_Font_name[5] + ".ttf"));
                textView37.setLayoutParams(layoutParams41);
                PreviewActivity.this.relative3.addView(textView37);
                TextView textView38 = new TextView(PreviewActivity.this);
                RelativeLayout.LayoutParams layoutParams42 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams42.setMargins(0, PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._365sdp), 0, 0);
                textView38.setTextSize(PreviewActivity.this.getResources().getDimensionPixelSize(R.dimen._6sdp));
                textView38.setGravity(1);
                textView38.setText(PreviewActivity.this.label11_3_Text[6]);
                textView38.setTextColor(Color.parseColor(PreviewActivity.this.label11_3_font_color[6]));
                AssetManager assets38 = PreviewActivity.this.getAssets();
                textView38.setTypeface(Typeface.createFromAsset(assets38, "fonts/" + PreviewActivity.this.label11_3_Font_name[6] + ".ttf"));
                textView38.setLayoutParams(layoutParams42);
                PreviewActivity.this.relative3.addView(textView38);
            }
            viewGroup.addView(inflate);
            return inflate;
        }

        @Override 
        public int getCount() {
            return PreviewActivity.this.layouts.length;
        }

        @Override 
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    @Override 
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override 
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId;

            itemId = menuItem.getItemId();

        if (itemId == R.id.downloadbtn) {
            new AsyncTaskExample().execute(new Void[0]);
        } else if (itemId != R.id.pdfbtn) {
            return super.onOptionsItemSelected(menuItem);
        }
        new AsyncTaskExamplePDF().execute(new Void[0]);
        return super.onOptionsItemSelected(menuItem);
    }

    public void SaveClick() {
        for (int i = 0; i <= 3; i++) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.passingrel);
            if (i == 0) {
                relativeLayout = this.relative0;
            }
            if (i == 1) {
                relativeLayout = this.relative1;
            }
            if (i == 2) {
                relativeLayout = this.relative2;
            }
            if (i == 3) {
                relativeLayout = this.relative3;
            }
            if (saveBitMap(this, relativeLayout) != null) {
                Log.i("TAG", "Drawing saved to the gallery!");
            } else {
                Log.i("TAG", "Oops! Image could not be saved.");
            }
        }
    }

    private File saveBitMap(Context context, View view) {



        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){


        }else{
            if (Build.VERSION.SDK_INT >= 23) {
                if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == PackageManager.PERMISSION_GRANTED && checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == PackageManager.PERMISSION_GRANTED) {
                    Log.v("permition ", "Permission is granted1");
                } else {
                    Log.v("permition", "Permission is revoked1");
                    ActivityCompat.requestPermissions(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 3);
                }
            } else {
                Log.v("permition", "Permission is granted1");
            }
        }

        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), getString(R.string.app_name));
        if (!file.exists()) {
            if (file.mkdirs()) {
                return null;
            }
            Log.i("TAG", "Can't create directory to save the image");
            return null;
        }
        File file2 = new File(file.getPath() + File.separator + System.currentTimeMillis() + ".jpg");
        Bitmap bitmapFromView = getBitmapFromView(view);
        try {
            file2.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmapFromView.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            Log.i("TAG", "There was an issue saving the image.");
        }
        scanGallery(context, file2.getAbsolutePath());
        return file2;
    }

    private Bitmap getBitmapFromView(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        view.draw(canvas);
        return createBitmap;
    }

    private void scanGallery(Context context, String str) {
        try {
            MediaScannerConnection.scanFile(context, new String[]{str}, null, new MediaScannerConnection.OnScanCompletedListener() { 
                @Override 
                public void onScanCompleted(String str2, Uri uri) {
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            Log.i("TAG", "There was an issue scanning gallery.");
        }
    }

    public void savePDF() {
        Bitmap createBitmap = Bitmap.createBitmap((int) this.screenWidth, (int) this.newHeight, Bitmap.Config.ARGB_8888);
        Bitmap createBitmap2 = Bitmap.createBitmap((int) this.screenWidth, (int) this.newHeight, Bitmap.Config.ARGB_8888);
        Bitmap createBitmap3 = Bitmap.createBitmap((int) this.screenWidth, (int) this.newHeight, Bitmap.Config.ARGB_8888);
        Bitmap createBitmap4 = Bitmap.createBitmap((int) this.screenWidth, (int) this.newHeight, Bitmap.Config.ARGB_8888);
        PdfDocument pdfDocument = new PdfDocument();
        this.relative0.draw(new Canvas(createBitmap));
        PdfDocument.Page startPage = pdfDocument.startPage(new PdfDocument.PageInfo.Builder((int) this.screenWidth, (int) this.newHeight, 1).create());
        startPage.getCanvas().drawBitmap(createBitmap, 0.0f, 0.0f, new Paint());
        pdfDocument.finishPage(startPage);
        this.relative1.draw(new Canvas(createBitmap2));
        PdfDocument.Page startPage2 = pdfDocument.startPage(new PdfDocument.PageInfo.Builder((int) this.screenWidth, (int) this.newHeight, 2).create());
        startPage2.getCanvas().drawBitmap(createBitmap2, 0.0f, 0.0f, new Paint());
        pdfDocument.finishPage(startPage2);
        this.relative2.draw(new Canvas(createBitmap3));
        PdfDocument.Page startPage3 = pdfDocument.startPage(new PdfDocument.PageInfo.Builder((int) this.screenWidth, (int) this.newHeight, 3).create());
        startPage3.getCanvas().drawBitmap(createBitmap3, 0.0f, 0.0f, new Paint());
        pdfDocument.finishPage(startPage3);
        this.relative3.draw(new Canvas(createBitmap4));
        PdfDocument.Page startPage4 = pdfDocument.startPage(new PdfDocument.PageInfo.Builder((int) this.screenWidth, (int) this.newHeight, 4).create());
        startPage4.getCanvas().drawBitmap(createBitmap4, 0.0f, 0.0f, new Paint());
        pdfDocument.finishPage(startPage4);
        try {
            File externalStorageDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS);
            File file = new File(externalStorageDirectory.getAbsolutePath() + "/" + getString(R.string.app_name));
            scanGallery(this, externalStorageDirectory.getAbsolutePath());
            if (!file.exists()) {
                file.mkdirs();
            }
            saved_filenm = System.currentTimeMillis();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file.getPath() + File.separator + saved_filenm + ".pdf"));
            pdfDocument.writeTo(fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            Log.d("PDF", "Save PDF successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        pdfDocument.close();
    }

    
    private class AsyncTaskExample extends AsyncTask<Void, Void, Void> {
        ProgressDialog p;

        private AsyncTaskExample() {
        }

        @Override 
        protected void onPreExecute() {
            super.onPreExecute();
            ProgressDialog progressDialog = new ProgressDialog(PreviewActivity.this);
            this.p = progressDialog;
            progressDialog.setMessage("Please wait...It is downloading");
            this.p.setIndeterminate(false);
            this.p.setCancelable(false);
            this.p.show();
        }

        
        @Override 
        public Void doInBackground(Void... voidArr) {
            PreviewActivity.this.SaveClick();
            return null;
        }

        
        @Override 
        public void onPostExecute(Void r1) {
            super.onPostExecute( r1);
            this.p.dismiss();
        }
    }

    
    private class AsyncTaskExamplePDF extends AsyncTask<Void, Void, Void> {
        ProgressDialog p1;

        private AsyncTaskExamplePDF() {
        }

        @Override 
        protected void onPreExecute() {
            super.onPreExecute();
            ProgressDialog progressDialog = new ProgressDialog(PreviewActivity.this);
            this.p1 = progressDialog;
            progressDialog.setMessage("Please wait...It is downloading");
            this.p1.setIndeterminate(false);
            this.p1.setCancelable(false);
            this.p1.show();
        }

        
        @Override 
        public Void doInBackground(Void... voidArr) {
            PreviewActivity.this.savePDF();
            return null;
        }

        
        @Override 
        public void onPostExecute(Void r3) {
            super.onPostExecute( r3);
            this.p1.dismiss();
            PreviewActivity.this.startActivity(new Intent(PreviewActivity.this, SharepdfActivity.class));
        }
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
                PreviewActivity.this.onBackPressed();
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.download);
        this.download = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() { 
            @Override 
            public void onClick(View view) {
                new AsyncTaskExamplePDF().execute(new Void[0]);
            }
        });
    }
}
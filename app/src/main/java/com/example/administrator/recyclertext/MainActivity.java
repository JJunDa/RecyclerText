package com.example.administrator.recyclertext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<Student> stuList = new ArrayList<Student>();
    private MyAdapter mMyAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initStuList();
        initViews();
    }


    private void initStuList() {
        stuList.add(new Student("张1",R.drawable.stu1));
        stuList.add(new Student("张2",R.drawable.stu2));
        stuList.add(new Student("张3",R.drawable.stu3));
        stuList.add(new Student("张4",R.drawable.stu4));
        stuList.add(new Student("张5",R.drawable.stu5));
        stuList.add(new Student("张6",R.drawable.stu6));
        stuList.add(new Student("张7",R.drawable.stu7));
        stuList.add(new Student("张8",R.drawable.stu8));
        stuList.add(new Student("张9",R.drawable.stu9));
        stuList.add(new Student("张10",R.drawable.stu10));
    }

    private void initViews() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
       LinearLayoutManager manager = new LinearLayoutManager(this);
       manager.setOrientation(LinearLayoutManager.VERTICAL);
//    GridLayoutManager manager = new GridLayoutManager(this,3);

//        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager
//                (3,StaggeredGridLayoutManager.VERTICAL);
      mRecyclerView.addItemDecoration(new DividerItemDecoration(this,
               DividerItemDecoration.VERTICAL));
        mRecyclerView.setLayoutManager(manager);
        mMyAdapter = new MyAdapter(stuList);
        mRecyclerView.setAdapter(mMyAdapter);

    }

}

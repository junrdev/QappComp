package com.junrdev.qappcomp.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.junrdev.qappcomp.ui.theme.Pink40
import com.junrdev.qappcomp.ui.theme.PurpleGrey40


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(navController: NavController) {

//displays all the filters and a submit button
    val filters = listOf(
        "Devops",
        "Linux",
        "Bash",
        "Windows",
        "Cloud",
        "Node Js"
    );
    
    Surface(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .clip(RoundedCornerShape(CornerSize(25.dp))),
        shadowElevation = 4.dp
    ) {

        Column(modifier = Modifier
            .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            
            Box(modifier = Modifier
                .border(width = 1.dp, color = Color.LightGray)
                .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                //TODO: implement a lazy grid

                Column(modifier = Modifier) {
                    LazyRow {
                        items(filters){
                            FilterElement(filterText = it)
                        } 
                    }
                    Spacer(modifier =Modifier.height(10.dp))
                    LazyRow {
                    items(filters){
                        FilterElement(filterText = it)
                    }
                }
                    Spacer(modifier =Modifier.height(10.dp))
                    LazyRow {
                    items(filters){
                        FilterElement(filterText = it)
                    }
                }
                }
            }
            
            FilterElement(filterText = "Submit", modifier = Modifier.background(PurpleGrey40))

        }

    }
}

@Composable
fun FilterElement(modifier: Modifier=Modifier, filterText: String, onclick: () -> Unit={}) {
    Box (
        modifier = Modifier
    ){
        Surface(
            modifier = Modifier
                .padding(12.dp)
                .clickable { onclick() },
            shape = CircleShape.copy(CornerSize(10.dp)),
            shadowElevation = 5.dp
        ) {
            Text(
                text = filterText, modifier = Modifier
                    .padding(12.dp)
            )
        }
    }
}

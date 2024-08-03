package com.example.newsapp.presentation.navgraph

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.newsapp.domain.model.Article
import com.example.newsapp.domain.model.Source
import com.example.newsapp.presentation.details.DetailsScreen
import com.example.newsapp.presentation.onboarding.OnBoardingScreen
import com.example.newsapp.presentation.onboarding.OnBoardingViewModel

@Composable
fun NavGraph(
    startDestination: String
) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ) {
            composable(
                route = Route.OnBoardingScreen.route
            ) {
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(
                    event = viewModel::onEvent
                )
            }
        }

        navigation(
            route = Route.NewsNavigation.route,
            startDestination = Route.NewsNavigatorScreen.route
        ) {
            composable(route = Route.NewsNavigatorScreen.route) {
                val article = Article(
                    author = "",
                    title = "Coinbase says Apple blocked its last app release on NFTs in Wallet ... - CryptoSaurus",
                    description = "Coinbase says Apple blocked its last app release on NFTs in Wallet ... - CryptoSaurus",
                    content = "We use cookies and data to Deliver and maintain Google services Track outages and protect against spam, fraud, and abuse Measure audience engagement and site statistics to unde… [+1131 chars]",
                    publishedAt = "2023-06-16T22:24:33Z",
                    source = Source(
                        id = "", name = "bbc"
                    ),
                    url = "https://news.google.com/rss/articles/CBMikwFBVV95cUxPTnhXTGpXS1hla2U2LWN5bXZhcTlyQWwycTdrTndVeFFaOGhrX3ZqOElvSHBLSGttTWV5X2RaX09QRzVMRkFMTllnZHZ6Q0FTR19rZ1dMbTd1WDJwdkpPOUktUnJqZF8tejZ4N2kxQUs2TGp1aldVX0s1VnVYY2dkSjdjbC1lS0t5eVdYSzMybC1MOHc?oc=5",
                    urlToImage = "https://media.wired.com/photos/6495d5e893ba5cd8bbdc95af/191:100/w_1280,c_limit/The-EU-Rules-Phone-Batteries-Must-Be-Replaceable-Gear-2BE6PRN.jpg"
                )

                DetailsScreen(article = article, event = {}) {

                }
            }
        }
    }
}
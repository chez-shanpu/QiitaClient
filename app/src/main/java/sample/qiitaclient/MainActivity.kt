package sample.qiitaclient

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import sample.qiitaclient.model.Article
import sample.qiitaclient.model.User
import sample.qiitaclient.view.ArticleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //ArticleViewのオブジェクト生成
        val articleView = ArticleView(applicationContext)

        //Articleオブジェクトを生成してArticleViewオブジェクトにセット
        articleView.setArticle(Article(id = "123",
                title = "test",
                url = "http://www.example.com/articles/123",
                user = User(id = "456", name = "shanpu", profileImageUrl = "")))

        //このアクティビティにArticleViewオブジェクトをセット
        setContentView(articleView)
    }
}

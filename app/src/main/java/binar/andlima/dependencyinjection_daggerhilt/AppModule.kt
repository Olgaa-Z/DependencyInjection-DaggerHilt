package binar.andlima.dependencyinjection_daggerhilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

//untuk kasih tau hilt , onject appmodule ini module untuk dependency Hilt
//singlecomponent :akan hidup selamanya jika aktivity ini hidup
//AvtivityComponent : akan hidup selamanya jika aktivity/fragment lainnya hidup
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

//    buat blueprint dari dependency2 yg dibutuhkan ex : retrofitclient atau roomDB


//   @Singleton : object engine ini akan dibuat seklai selama apk berjalan
//    jika dihapus, setiap object engine di inject,
//    function ini akan buat engine yg baru berulang-ulang
//    akan habiskan memory aplikasi = memory leak
//    @provides : kasih tau Hilt, module yg disediakan untuk di inject
        @Singleton
        @Provides
       fun provideEngine(): Engine{
           return Engine()
       }

    @Singleton
    @Provides
    fun provideString()="ini adalah string yang akan diinject"

//    fun provideEngine(@ApplicationContext context: Context): Engine{
//
//        return Engine()
//    }


}
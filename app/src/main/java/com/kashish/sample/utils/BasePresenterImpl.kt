package com.kashish.sample.utils

open class BasePresenterImpl<V : BaseView> : BasePresenter<V> {
    private var view: V? = null

    override fun attachView(view: V) {
        this.view = view
    }

    override fun detachView() {
        this.view = null
    }

    protected fun getView(): V? = view
}
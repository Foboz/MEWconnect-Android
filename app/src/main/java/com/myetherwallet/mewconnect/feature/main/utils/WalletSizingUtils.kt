package com.myetherwallet.mewconnect.feature.main.utils

import android.content.Context
import android.os.Build
import android.view.View
import com.myetherwallet.mewconnect.R
import com.myetherwallet.mewconnect.core.utils.ApplicationUtils

/**
 * Created by BArtWell on 08.12.2018.
 */

private const val MARGIN_DP = 16f
private const val SIZE_RATIO = 0.63415f

object WalletSizingUtils {

    fun calculateCardWidth(context: Context) =
            ApplicationUtils.getDisplaySize(context).width - ApplicationUtils.dpToPx(MARGIN_DP * 2).toInt()

    fun calculateCardHeight(context: Context) = (calculateCardWidth(context) * SIZE_RATIO).toInt()

    fun calculateListMargin(view: View): Int {
        val toolbarHeight = view.context.resources.getDimension(R.dimen.wallet_toolbar_height)
        val toolbarMargin = ApplicationUtils.getToolbarMargin(view)
        val headerHeight = view.context.resources.getDimension(R.dimen.wallet_header_height)
        val cardHeight = WalletSizingUtils.calculateCardHeight(view.context)
        return (toolbarHeight + toolbarMargin + headerHeight + cardHeight).toInt()
    }

    fun calculateScrollThreshold(view: View): Int {
        return calculateListMargin(view) / 2
    }
}
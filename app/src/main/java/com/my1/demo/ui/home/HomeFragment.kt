package com.my1.demo.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.my1.demo.Store
import com.my1.demo.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

private var _binding: FragmentHomeBinding? = null
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

    _binding = FragmentHomeBinding.inflate(inflater, container, false)
    val root: View = binding.root

    val rv_board = binding.rvHome
    val itemList = ArrayList<Store>()

    //아이템 추가
    //itemList.add(Store(매장이름, 위치, 시간, 내용))

    //테스트데이터
    itemList.add(Store("aa미용실","대구 달서구 ...","12:15", "할인 중!"))
    itemList.add(Store("bb헬스장","대구 달서구 ...","12:14", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."))
    itemList.add(Store("cc네일샵","대구 달서구 ...","12:13", "내용"))
    itemList.add(Store("이름","위치","시간", "내용"))
    itemList.add(Store("이름","위치","시간", "내용"))
    itemList.add(Store("이름","위치","시간", "내용"))

    val boardAdapter = BoardAdapter(itemList)
    boardAdapter.notifyDataSetChanged()

    rv_board.adapter = boardAdapter

    /*
    homeViewModel.text.observe(viewLifecycleOwner) {
      textView.text = it
    }
    */

    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
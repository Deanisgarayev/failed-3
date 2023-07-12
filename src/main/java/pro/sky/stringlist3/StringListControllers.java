package pro.sky.stringlist3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class StringListControllers {
    @RestController
    @RequestMapping("/StringList")
    public class StringListController {
        StringList stringList;
        @Autowired
        public StringListController(StringList stringList) {
            this.stringList = stringList;
        }
        @GetMapping("/add")
        public String add(@RequestParam String item) {
            return stringList.add(item);
        }

        @GetMapping(value = "/add",params = "index")
        public String add(@RequestParam("index") int index, @RequestParam String item) {
            return stringList.add(index, item);
        }
        @GetMapping("/set")
        public String set(@RequestParam int index, @RequestParam String item) {
            return stringList.set(index, item);
        }
        @GetMapping(value = "/remove", params = "item")
        public String remove(@RequestParam("item") String item) {
            return stringList.remove(item);
        }
        @GetMapping("/remove")
        public String remove(@RequestParam int index) {
            return stringList.remove(index);
        }
        @GetMapping("/contains")
        public boolean contains(@RequestParam String index) {
            return stringList.contains(index);
        }
        @GetMapping("/indexOF")
        public int indexOF(@RequestParam String item) {
            return stringList.indexOF(item);
        }
        @GetMapping("/lastIndexOF")
        public int lastIndexOF(@RequestParam String item) {
            return stringList.lastIndexOF(item);
        }
        @GetMapping("/get")
        public String get(@RequestParam int index) {
            return stringList.get(index);
        }
        @GetMapping("/equals")
        public boolean equals(@RequestParam StringList otherList) {
            return stringList.equals(otherList);
        }

        @GetMapping("/size")
        public int size() {
            return stringList.size();
        }
        @GetMapping("/isEmpty")
        public boolean isEmpty() {
            return stringList.isEmpty();
        }
        @GetMapping("/clear")
        public void clear() {
            stringList.clear();
        }
        @GetMapping("/toArray")
        public String[] toArray() {
            return stringList.toArray();
        }
    }
}
